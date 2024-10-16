package josehomenhuck.java_email.adapter;

public interface EmailGateway {
  void sendEmail(String to, String subject, String body);
}
