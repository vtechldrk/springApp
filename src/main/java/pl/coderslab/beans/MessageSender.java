package pl.coderslab.beans;

public class MessageSender {
    String message = "Message from xml";
    MessageService messageService;

    public MessageSender(String sendMessage) {

    }

    public void sendMessage() {
        messageService.send();
    }
    public void  sendMessageFromProperty(){
       messageService.send(message);
    };
}
