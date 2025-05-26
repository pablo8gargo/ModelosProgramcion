package notificationFactory;

public class NotificationService {
    NotificationFactory factory;
    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public NotificationType orderNotification(String type, String message) {
        NotificationType notification;
        notification = factory.createNotification(type);

        notification.send(message);
        return notification;
    }

}
