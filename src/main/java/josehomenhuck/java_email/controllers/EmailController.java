package josehomenhuck.java_email.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import josehomenhuck.java_email.application.EmailService;
import josehomenhuck.java_email.core.Email;

@RestController
@RequestMapping("/api/email")
public class EmailController {
  
  private final EmailService emailService;

  public EmailController(EmailService emailService) {
    this.emailService = emailService;
  }

  /**
   * Send an email
   * HTTP POST :8080/api/email/send
   * Content-Type: application/json
   * 
   * {
   *  "to": "josepedro.homenhuck@gmail.com",
   *  "subject": "Hello",
   *  "body": "Hello, how are you?"
   * }
   * 
   */
  @PostMapping("/send")
  public ResponseEntity<String> sendEmail(@RequestBody Email email) {
    try {
      emailService.sendEmail(email.to(), email.subject(), email.body());
      return ResponseEntity.ok("Email sent successfully");
    } catch (Exception e) {
      return ResponseEntity.status(500).body(e.getMessage());
    }
  }
}
