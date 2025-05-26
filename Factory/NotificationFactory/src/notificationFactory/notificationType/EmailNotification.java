package notificationFactory.notificationType;

import notificationFactory.NotificationType;

public class EmailNotification implements NotificationType {
    @Override
    public void send(String message) {
        System.out.println("Enviando correo electrónico: " + message);
    }
}

