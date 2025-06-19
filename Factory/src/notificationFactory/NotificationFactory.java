package notificationFactory;

import notificationFactory.notificationType.EmailNotification;
import notificationFactory.notificationType.SMSNotification;
import notificationFactory.notificationType.WhatsAppNotification;

public class NotificationFactory {
    public NotificationType createNotification(String type) {
        NotificationType notification = null;
        if (type.equalsIgnoreCase("whatsapp")) {
            notification = new WhatsAppNotification();
        } else if (type.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            notification = new SMSNotification();
        }
        return notification;
    }
}
