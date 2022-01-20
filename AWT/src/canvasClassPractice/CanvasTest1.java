package canvasClassPractice;

import java.awt.*;

public class CanvasTest1 {
    public static void main(String[] args) {
        Frame f = new Frame("Canvas Test");
        f.setSize(300, 200);
        f.setLayout(null);

        Canvas c1 = new Canvas();
        c1.setBackground(Color.pink);
        c1.setBounds(50, 50, 150, 100);

        f.add(c1);
        f.setVisible(true);
    }
}
