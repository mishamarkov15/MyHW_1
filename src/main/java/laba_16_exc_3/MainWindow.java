package laba_16_exc_3;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    MainWindow() {
        JLabel service = new JLabel("Service");
        JLabel username = new JLabel("User name");
        JLabel password = new JLabel("Password");

        JTextField serviceInput = new JTextField();
        JTextField usernameInput = new JTextField();
        JPasswordField passwordInput = new JPasswordField();

        JButton b = new JButton("authorize");//create butto

        add(service);add(serviceInput);
        add(username);add(usernameInput);
        add(password);add(passwordInput);
        add(b);add(b);
        setLayout(new GridLayout(4, 2));
        pack();
        setSize(getPreferredSize());
        setVisible(true);

        b.addActionListener(e -> {
            if (serviceInput.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "`service` must be not empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (usernameInput.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "`username` must be not empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (passwordInput.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "`password` must be not empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}