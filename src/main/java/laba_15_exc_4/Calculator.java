package laba_15_exc_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Calculator {
    private static HashMap<String, JButton> buttonMap;
    private static JTextArea resArea;
    private static String cache;
    private static String operation;

    public static void fillButtonMap() {
        buttonMap = new HashMap<>();
        for (int i = 0; i < 10; ++i) {
            buttonMap.put(String.valueOf(i), new JButton(String.valueOf(i)));
        }
        String operations = "+-/*.=";
        for (int i = 0; i < operations.length(); ++i) {
            buttonMap.put(Character.toString(operations.charAt(i)),
                    new JButton(Character.toString(operations.charAt(i))));
        }
    }

    public static void createFunctions() {
        for (int i = 0; i < 10; ++i) {
            buttonMap.get(String.valueOf(i)).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String text = resArea.getText();
                    if (Objects.equals(text, "0")) {
                        text = String.valueOf(e.getActionCommand());
                    } else {
                        text += String.valueOf(e.getActionCommand());
                    }
                    resArea.setText(text);
                }
            });
        }

        String operations = "+-/*";
        for (int i = 0; i < operations.length(); ++i) {
            buttonMap.get(Character.toString(operations.charAt(i))).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (cache.isEmpty()) {
                        operation = e.getActionCommand();
                        String text = resArea.getText();
                        if (text.endsWith(".")) {
                            text += "0";
                        }
                        cache = text;
                        resArea.setText("0");
                    } else {
                        operation = e.getActionCommand();
                        double lhs = Double.parseDouble(cache);
                        String text = resArea.getText();
                        if (text.endsWith(".")) { text += "0"; }
                        double rhs = Double.parseDouble(text);
                        double res = 0.0;
                        if (Objects.equals(operation, "+")) {
                            res = lhs + rhs;
                        } else if (Objects.equals(operation, "-")) {
                            res = lhs - rhs;
                        } else if (Objects.equals(operation, "*")) {
                            res = lhs * rhs;
                        } else if (Objects.equals(operation, "/")) {
                            res = lhs / rhs;
                        }
                        resArea.setText(String.valueOf(res));
                        operation = "";
                        cache = "";
                    }
                }
            });
        }


        buttonMap.get(".").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = resArea.getText();
                if (text.contains(".")) {return;}
                resArea.setText(text + ".");
            }
        });

        buttonMap.get("=").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation.isEmpty()) {
                    return;
                }
                double lhs = Double.parseDouble(cache);
                String text = resArea.getText();
                if (text.endsWith(".")) { text += "0"; }
                double rhs = Double.parseDouble(text);
                double res = 0.0;
                if (Objects.equals(operation, "+")) {
                    res = lhs + rhs;
                } else if (Objects.equals(operation, "-")) {
                    res = lhs - rhs;
                } else if (Objects.equals(operation, "*")) {
                    res = lhs * rhs;
                } else if (Objects.equals(operation, "/")) {
                    res = lhs / rhs;
                }
                resArea.setText(String.valueOf(res));
                operation = "";
                cache = "";
            }
        });
    }

    public static void main(String[] args) {
        cache = "";
        operation = "";
        JFrame frame = new JFrame("Swing calculator");
        GridLayout layout = new GridLayout(0, 1);

        JPanel resPanel = new JPanel(), firstRow = new JPanel(), secondRow = new JPanel(), thirdRow = new JPanel(), fourthRow = new JPanel();
        fillButtonMap();

        // fill resPanel
        resArea = new JTextArea("0");
        resPanel.add(resArea);

        firstRow.add(buttonMap.get("7"));
        firstRow.add(buttonMap.get("8"));
        firstRow.add(buttonMap.get("9"));
        firstRow.add(buttonMap.get("/"));
        secondRow.add(buttonMap.get("4"));
        secondRow.add(buttonMap.get("5"));
        secondRow.add(buttonMap.get("6"));
        secondRow.add(buttonMap.get("*"));
        thirdRow.add(buttonMap.get("1"));
        thirdRow.add(buttonMap.get("2"));
        thirdRow.add(buttonMap.get("3"));
        thirdRow.add(buttonMap.get("-"));
        fourthRow.add(buttonMap.get("0"));
        fourthRow.add(buttonMap.get("."));
        fourthRow.add(buttonMap.get("="));
        fourthRow.add(buttonMap.get("+"));

        createFunctions();

        frame.setSize(400, 400);
        frame.setLayout(layout);
        frame.add(resPanel);
        frame.add(firstRow);
        frame.add(secondRow);
        frame.add(thirdRow);
        frame.add(fourthRow);
        frame.setVisible(true);
    }
}
