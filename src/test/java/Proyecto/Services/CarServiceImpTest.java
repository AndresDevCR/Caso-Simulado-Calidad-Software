package Proyecto.Services;

import Proyecto.Models.Car;
import Proyecto.Repositories.CarDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarServiceImpTest {
    CarServiceImp carServiceImp;
    CarDao carDao;
    Car car;
    @BeforeEach
    void setUp() {
        carServiceImp = mock(CarServiceImp.class);
        carDao = mock(CarDao.class);
        car = mock(Car.class);
        car.setIdCar(new Long(1));
    }

    @Test
    void find() {
        when(carServiceImp.find(1L)).thenReturn(new Car());
        assertNotNull(carServiceImp.find(1L));

    }
}