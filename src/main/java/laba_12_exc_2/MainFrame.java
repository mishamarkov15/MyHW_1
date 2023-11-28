package laba_12_exc_2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {
    MainFrame(String pathToPhoto) throws IOException {
        super("Photo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        var img = ImageIO.read(new File(pathToPhoto));
        var icon = new ImageIcon(img);
        var label = new JLabel();
        label.setIcon(icon);

        add(label);
        pack();

        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        MainFrame m = new MainFrame(args[0]);
    }
}
