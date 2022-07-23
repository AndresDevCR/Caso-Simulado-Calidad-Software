package Proyecto.Services;

import Proyecto.Models.User;
import Proyecto.Repositories.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import java.util.Arrays;

class UserServiceImpTest {
    private UserServiceImp userServiceImp;
    private UserService userService;
    private User user;

    @BeforeEach
    void setUp() {
        UserDao userDao = Mockito.mock(UserDao.class);
        userService = Mockito.mock(UserService.class);
    }
    @Test
    void getAllUser() {
        when(userService.getAllUsers()).thenReturn(Arrays.asList(user));
        assertEquals(Arrays.asList(user), userService.getAllUsers());
    }
}