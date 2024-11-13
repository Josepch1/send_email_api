package josehomenhuck.java_email.adapter;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailGatewayImpl implements EmailGateway {

    private final JavaMailSender mailSender;

    public EmailGatewayImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        message.setFrom("johndoe@email.com"); // Alterar conforme necessário
        mailSender.send(message);
    }
}
