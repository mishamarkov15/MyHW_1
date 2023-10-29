package org.example;

public class Main {
    static public void main(String[] args) {
        Client a = new Client('t');
        Client b = new Client('w');

        a.send();
        b.send();
        a.get();;
        a.get();
    }
}
