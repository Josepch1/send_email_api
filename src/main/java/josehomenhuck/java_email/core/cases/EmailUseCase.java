package josehomenhuck.java_email.core.cases;

public interface EmailUseCase {
    void sendEmail(String to, String subject, String body);
}
