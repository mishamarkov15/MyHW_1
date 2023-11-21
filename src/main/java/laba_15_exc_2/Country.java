package laba_15_exc_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Country {
    public static void main(String[] args) {
        Frame f = new Frame("Country");

        String country[] = {"None", "Russia", "USA", "England", "Germany", "Italy"};

        JComboBox cb = new JComboBox(country);
        cb.setBounds(10, 50, 90, 20);

        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setEditable(false);
        ta.setText("Choose country to see info.");
        ta.setBounds(120, 50, 250,110);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected_country = cb.getItemAt(cb.getSelectedIndex()).toString();
                if (Objects.equals(selected_country, "Russia")) {
                    ta.setText("Russia is the biggest country in the world!");
                } else if (Objects.equals(selected_country, "USA")) {
                    ta.setText("USA is the second country in the world! And the biggest economics.");
                } else if (Objects.equals(selected_country, "England")) {
                    ta.setText("London is the capital of England.");
                } else if (Objects.equals(selected_country, "Germany")) {
                    ta.setText("Germany people manufactures Mercedes and BMW");
                } else if (Objects.equals(selected_country, "Italy")) {
                    ta.setText("Italy is one of the oldest country.");
                }
            }
        });

        f.add(cb);f.add(ta);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
