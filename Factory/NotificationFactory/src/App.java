import notificationFactory.NotificationFactory;
import notificationFactory.NotificationService;

public class App {
    public static void main(String[] args) throws Exception {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.orderNotification("whatsApp", "Hola, este es un mensaje de WhatsApp!");
        service.orderNotification("sms", "Hola, este es un mensaje de SMS!");
        service.orderNotification("email", "Hola, este es un mensaje de Email!");
        
    }
}
