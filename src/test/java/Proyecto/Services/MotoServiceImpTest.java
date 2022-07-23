package Proyecto.Services;

import Proyecto.Models.Moto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MotoServiceImpTest {

    private MotoService motoService;
    private MotoServiceImp motoServiceImp;
    private Moto moto;


    @BeforeEach
    void setUp() {
        motoService = Mockito.mock(MotoService.class);

    }

    @Test
    void getAllMotos() {
        when(motoService.getAllMotos()).thenReturn(Arrays.asList(moto));
        assertEquals(Arrays.asList(moto), motoService.getAllMotos());
    }

}