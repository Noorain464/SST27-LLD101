package com.example.notifications;

public class BaseDecorator implements Notifier{
    protected final Notifier notifier;
    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    @Override
    public void notify(String text) {
        notifier.notify(text);
    }
}
