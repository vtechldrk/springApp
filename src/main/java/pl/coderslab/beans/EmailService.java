package pl.coderslab.beans;

public class EmailService implements MessageService{
    public EmailService(String send) {

    }

    @Override
    public void send() {
        System.out.println("Sending Email....");
    }

    @Override
    public void send(String message) {
        System.out.println("message" + message);
    }
}
