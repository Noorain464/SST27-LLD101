package com.example.notifications;

public class SmsDecorator extends BaseDecorator {
    private final String phone;
    public SmsDecorator(Notifier notifier,String phone) {
        super(notifier);
        this.phone=phone;
    }
    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[SMS]: " + text + " to " + phone);
    }
}
