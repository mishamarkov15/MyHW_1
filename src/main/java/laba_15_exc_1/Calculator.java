package laba_15_exc_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args)  {
        Frame f = new Frame("Country");

        Label lhs_label = new Label();
        lhs_label.setText("Первое число:");
        lhs_label.setBounds(20, 50, 150, 20);
        final TextField lhs = new TextField();
        lhs.setBounds(180, 50, 150, 20);

        Label rhs_label = new Label();
        rhs_label.setText("Второе число:");
        rhs_label.setBounds(20, 100, 150, 20);
        final TextField rhs = new TextField();
        rhs.setBounds(180, 100, 150, 20);


        Label res_label = new Label();
        res_label.setText("Результат:");
        res_label.setBounds(20, 150, 150, 20);
        final TextField res = new TextField();
        res.setBounds(180, 150, 150, 20);
        res.setEditable(false);

        Button plus =  new Button("+");
        plus.setBounds(20, 200, 40, 40);
        plus.setSize(40, 40);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first = Double.parseDouble(lhs.getText());
                double second = Double.parseDouble(rhs.getText());
                res.setText("%.2f".formatted(first + second));
            }
        });

        Button minus =  new Button("-");
        minus.setBounds(70, 200, 40, 40);
        minus.setSize(40, 40);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first = Double.parseDouble(lhs.getText());
                double second = Double.parseDouble(rhs.getText());
                res.setText("%.2f".formatted(first - second));
            }
        });

        Button multiply =  new Button("*");
        multiply.setBounds(120, 200, 40, 40);
        multiply.setSize(40, 40);
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first = Double.parseDouble(lhs.getText());
                double second = Double.parseDouble(rhs.getText());
                res.setText("%.2f".formatted(first * second));
            }
        });

        Button division =  new Button("/");
        division.setBounds(170, 200, 40, 40);
        division.setSize(40, 40);
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double first = Double.parseDouble(lhs.getText());
                double second = Double.parseDouble(rhs.getText());
                res.setText("%.2f".formatted(first / second));
            }
        });

        f.add(lhs_label);f.add(rhs_label);f.add(res_label);
        f.add(plus);f.add(minus);f.add(division);f.add(multiply);f.add(lhs);f.add(rhs);f.add(res);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
