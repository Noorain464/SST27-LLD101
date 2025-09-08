package com.example.notifications;

public class WhatsAppDecorator extends BaseDecorator {
    private final String username;

    public WhatsAppDecorator(Notifier notifier,String username) {
        super(notifier);    
        this.username=username;
    }
    @Override
    public void notify(String text) {
        notifier.notify(text);
        System.out.println("[WHATSAPP]: " + text + " to " + username);
    }
}
