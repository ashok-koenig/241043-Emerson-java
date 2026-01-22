package register;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    EmailService emailService;

    @InjectMocks
    UserService userService;

    @Test
    void testRegisterUser(){
//        emailService = new EmailService();
//        userService = new UserService(emailService);
        Mockito.when(emailService.sendEmail("test@email.com")).thenReturn(true);
        Assertions.assertTrue(userService.register("test@email.com"));
        Mockito.verify(emailService).sendEmail("test@email.com");
    }
}
