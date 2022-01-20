package PopupMenuClassPractice;

import java.awt.*;

public class PopupMenuTest {
    public static void main(String[] args) {
        Frame f = new Frame("Popmenu Test");
        f.setSize(300, 200);

        PopupMenu pMenu = new PopupMenu();
        MenuItem miCut = new MenuItem("Cut");

        pMenu.add(miCut);

        f.add(pMenu);
        f.setVisible(true);
    }
}
