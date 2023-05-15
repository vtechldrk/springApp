package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld kalafior1 = (HelloWorld) context.getBean("helloWorld"); //sposob nr 1
        HelloWorld kalafior2 = context.getBean("helloWorld", HelloWorld.class); //sposob nr 2
        HelloWorld kalafior3 = context.getBean(HelloWorld.class); //sposob nr 3

        kalafior1.printMessage();
        kalafior2.printMessage();
        kalafior3.printMessage();
//Pobierz ziarno w metodzie main, a następnie wywołaj na nim metodę getMessage.
        System.out.println(kalafior3.getMessage());

        EmailService email = context.getBean(EmailService.class);
        email.send();

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage();

        context.close();
    }
}
