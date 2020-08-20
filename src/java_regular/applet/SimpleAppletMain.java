package java_regular.applet;

import javax.swing.*;
import java.awt.*;

public class SimpleAppletMain extends JApplet {
    private String date;

    public void init() {
        date = new java.util.Date().toString();

        Container pane = getContentPane();
        JLabel label = new JLabel("My java_regular.applet works now!", JLabel.CENTER);
        pane.add(label);
    }

    public void paint(Graphics g) {
        g.drawString("Applet started...", 50, 15);
        g.drawString(date,50,35);
    }
}
