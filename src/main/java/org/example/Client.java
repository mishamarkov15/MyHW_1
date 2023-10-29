package org.example;

public class Client {
    private Messenger messenger;

    public Client(char m) {
        if (m == 't') {
            this.messenger = new Telegram();
        } else if (m == 'w') {
            this.messenger = new WhatsApp();
        }
    }

    public void send() {
        this.messenger.sendMessage();
    }

    public void get() {
        this.messenger.getMessage();
    }
}

