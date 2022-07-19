package Proyecto.Controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import Proyecto.Models.Moto;
import Proyecto.Services.MotoServiceImp;

@Controller
public class motoContoller {

    @Autowired
    private MotoServiceImp motoService;

    @GetMapping("/admin/motos")
    public String adminMotos(Model model) {
        var motos = motoService.getAllMotos();
        model.addAttribute("motos", motos);
        return "/admin/motos";
       
    }

    @GetMapping("/admin/moto/new")
    public String newdata(Model model) {
        return "/admin/agregarMoto";
    }

    @PostMapping("/admin/moto/add")
    public String add(Moto moto,
            @RequestParam("file") MultipartFile imagen) {
        if (!imagen.isEmpty()) {
            Path directorio = Paths.get("src//main//resources//static//img");
            String ruta = directorio.toFile().getAbsolutePath();
            try {
                byte[] bytesImg = imagen.getBytes();
                Path rutaArchivo = Paths.get(ruta + "//" + imagen.getOriginalFilename());
                Files.write(rutaArchivo, bytesImg);
                moto.setImage(imagen.getOriginalFilename());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        motoService.save(moto);
        return "redirect:/admin/motos";
    }

    @GetMapping("/admin/moto/delete/{id}")
    public String delete(@PathVariable Long id) {
        Moto moto = motoService.find(id);
        motoService.delete(moto);
        return "redirect:/admin/motos";
    }

    @GetMapping("/admin/moto/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Moto moto = motoService.find(id);
        model.addAttribute("item", moto);
        return "/admin/editarMoto";
    }
}
