public class EmailClient implements Notification {
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}