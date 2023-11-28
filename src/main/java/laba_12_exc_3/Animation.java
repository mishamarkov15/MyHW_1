package laba_12_exc_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame {
    JLabel label;

    public static String[] photos = {"img/MT0X3_AV1.jpeg", "img/MT0X3_AV2.jpeg", "img/MT0X3_AV4.jpeg"};

    public void setNewFrame(String pathToFrame) throws IOException {
        var img = ImageIO.read(new File(pathToFrame));
        Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
                Image.SCALE_SMOOTH);
        var icon = new ImageIcon(dimg);
        label.setIcon(icon);
    }

    Animation() throws IOException {
        super("Photo");
        label = new JLabel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        add(label);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String currentPath = new java.io.File(".").getCanonicalPath();
        System.out.println("Current dir:" + currentPath);
        Animation m = new Animation();
        int i = 0;
        while (true) {
            m.setNewFrame(photos[i++ % photos.length]);
            Thread.sleep(100);
        }
    }
}
