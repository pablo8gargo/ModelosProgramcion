package notificationFactory.notificationType;

import notificationFactory.NotificationType;

public class WhatsAppNotification implements NotificationType{
    @Override
    public void send(String message) {
        System.out.println("Enviando mensaje de WhatsApp: " + message);
    }
}

