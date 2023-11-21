package laba_15_exc_3;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing application");
        GridLayout layout = new GridLayout(0, 1, 10, 10);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(saveItem);fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);editMenu.add(cutItem);editMenu.add(pasteItem);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);menuBar.add(editMenu);menuBar.add(helpMenu);



        JButton first = new JButton("Button 1"), second = new JButton("Button 2");
        JPanel panel = new JPanel();
        panel.add(first);panel.add(second);

        JTextArea textArea = new JTextArea(2, 20);
        textArea.setText("This is the are you can write text.");

        frame.setJMenuBar(menuBar);
        frame.add(panel);
        frame.add(textArea);

        frame.setSize(300, 200);
        frame.setLayout(layout);
        frame.setVisible(true);
    }
}
