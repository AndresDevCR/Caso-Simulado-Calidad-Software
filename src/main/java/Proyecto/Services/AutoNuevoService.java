package Proyecto.Services;

import java.util.List;

import Proyecto.Models.AutoNuevo;


public interface AutoNuevoService {
    
    public List<AutoNuevo> getAllAutoNuevos();

    public void save(AutoNuevo autonuevo);

    public void delete(AutoNuevo autonuevo);

    public AutoNuevo getAutoNuevo(AutoNuevo autonuevo);

    public AutoNuevo find(Long id);

    public AutoNuevo findByBrand(AutoNuevo autonuevo);

    public AutoNuevo findByModel(AutoNuevo autonuevo);

    public AutoNuevo findByYear(AutoNuevo autonuevo);

    public AutoNuevo findByColor(AutoNuevo autonuevo);
}
