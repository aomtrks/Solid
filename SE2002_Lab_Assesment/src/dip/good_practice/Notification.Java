public interface MessageService{
    void send(String msg);
}

class GmailService implements MessageService {
    @Override
    public void send(String msg) { System.out.println("Gmail: " + msg); }
}

public class NotificationApp(MessageService messageservice) {
    this.messageservice = messageservice;

    public void notify(String message) {
        messageservice.send(message);
    }
}  