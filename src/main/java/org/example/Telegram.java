package org.example;

public class Telegram implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Hello from telegram!");
    }

    @Override
    public void getMessage() {
        System.out.println("Receive in telegram...");
    }
}

