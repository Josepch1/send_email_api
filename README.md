# 📧 Spring Email API

Welcome to the Spring Email API project! This project demonstrates how to send emails using Spring Boot.

## 🚀 Getting Started

### Prerequisites

- Java 23 or higher
- Maven 3.6.5 or higher

### Installation

1. Clone the repository:
  ```sh
  git clone https://github.com/Josepch1/send_email_api.git
  cd send_email_api
  ```

2. Build the project:
  ```sh
  ./mvnw clean package
  ```

3. Run the application:
  ```sh
  java -jar target/java_email-0.0.1-SNAPSHOT.jar
  ```

## 📚 Usage

### Sending an Email

To send an email, make a POST request to `/api/email/send` with the following JSON payload:

```json
{
  "to": "recipient@example.com",
  "subject": "Hello",
  "body": "Hello, how are you?"
}
```

### Example

```sh
curl -X POST http://localhost:8080/api/email/send \
  -H "Content-Type: application/json" \
  -d '{
    "to": "recipient@example.com",
    "subject": "Hello",
    "body": "Hello, how are you?"
    }'
```

## 🛠️ Development

### Running Tests

To run the tests, use the following command:

```sh
./mvnw test
```

## 📞 Contact

If you have any questions, feel free to open an issue.

Happy coding! 😊
