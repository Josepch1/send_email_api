package josehomenhuck.java_email.application;

import org.springframework.stereotype.Service;
import josehomenhuck.java_email.adapter.EmailGateway;
import josehomenhuck.java_email.core.cases.EmailUseCase;

@Service
public class EmailService implements EmailUseCase {

  private final EmailGateway emailGateway;

  public EmailService(EmailGateway emailGateway) {
    this.emailGateway = emailGateway;
  }

  @Override
  public void sendEmail(String to, String subject, String body) {
    emailGateway.sendEmail(to, subject, body);
  }
}
