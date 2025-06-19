package notificationFactory.notificationType;

import notificationFactory.NotificationType;

public class SMSNotification implements NotificationType {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
