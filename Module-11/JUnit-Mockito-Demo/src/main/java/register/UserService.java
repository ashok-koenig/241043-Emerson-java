package register;

public class UserService {
    private EmailService emailService;
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public boolean register(String email){
        System.out.println("User registered with email id: "+ email);
        return emailService.sendEmail(email);
    }
}
