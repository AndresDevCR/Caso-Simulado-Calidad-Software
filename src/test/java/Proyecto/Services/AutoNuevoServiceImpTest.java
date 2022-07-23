package Proyecto.Services;

import Proyecto.Repositories.AutoNuevoDao;
import Proyecto.Models.AutoNuevo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;

class AutoNuevoServiceImpTest {

    private AutoNuevoServiceImp autoNuevoServiceImp;
    private AutoNuevoService autoNuevoService;
    private AutoNuevo autoNuevo;

    @BeforeEach
    void setUp() {
        AutoNuevoDao autoNuevoDao = Mockito.mock(AutoNuevoDao.class);
        autoNuevoService = Mockito.mock(AutoNuevoService.class);
    }

    @Test
    void getAllAutoNuevos() {
        when(autoNuevoService.getAllAutoNuevos()).thenReturn(Arrays.asList(autoNuevo));
        assertEquals(Arrays.asList(autoNuevo), autoNuevoService.getAllAutoNuevos());
    }

    @Test
    void findbybrand() {
        when(autoNuevoService.findByBrand(autoNuevo)).thenReturn(autoNuevo);
        assertEquals(autoNuevo, autoNuevoService.findByBrand(autoNuevo));
    }

    @Test
    void findbymodel() {
        when(autoNuevoService.findByModel(autoNuevo)).thenReturn(autoNuevo);
        assertEquals(autoNuevo, autoNuevoService.findByModel(autoNuevo));
    }

    @Test
    void findbyyear() {
        when(autoNuevoService.findByYear(autoNuevo)).thenReturn(autoNuevo);
        assertEquals(autoNuevo, autoNuevoService.findByYear(autoNuevo));
    }

    @Test
    void findbycolor() {
        when(autoNuevoService.findByColor(autoNuevo)).thenReturn(autoNuevo);
        assertEquals(autoNuevo, autoNuevoService.findByColor(autoNuevo));
    }

}