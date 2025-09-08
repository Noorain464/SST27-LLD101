package com.example.notifications;

public class SlackDecorator extends BaseDecorator {
    private final String channel;
  
    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel=channel;
    }

    @Override
    public void notify(String text) {
        notifier.notify(text);
        System.out.println("[SLACK]: " + text + " to channel " + channel);
    }
}
