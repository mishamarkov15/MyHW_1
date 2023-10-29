package org.example;

public class WhatsApp implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("Hello from WhatsApp!");
    }

    @Override
    public void getMessage() {
        System.out.println("Receive in WhatsApp...");
    }
}
