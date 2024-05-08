package org.Microservicios;


public class EmailService {

    public static void main(String[] args) {
        // Ejemplo de cómo usar el microservicio de email
        EmailDetails emailDetails = new EmailDetails("example@example.com", "Este es un mensaje de prueba.");
        sendEmail(emailDetails);
    }

    public static void sendEmail(EmailDetails emailDetails) {
        // Simplemente mostramos los detalles del email en la consola
        System.out.println("Sending email to: " + emailDetails.getRecipientEmail());
        System.out.println("Message body: " + emailDetails.getMessageBody());
        System.out.println("Email sent successfully.");
    }
}

class EmailDetails {
    private String recipientEmail;
    private String messageBody;

    public EmailDetails(String recipientEmail, String messageBody) {
        this.recipientEmail = recipientEmail;
        this.messageBody = messageBody;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public String getMessageBody() {
        return messageBody;
    }
}
