package frameClassPractice;

import java.awt.*;

public class FrameClassTest {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize1 = tk.getScreenSize();

        f.setLocation(screenSize1.width/2-150, screenSize1.height/2-100);
        f.setVisible(true);
    }
}
