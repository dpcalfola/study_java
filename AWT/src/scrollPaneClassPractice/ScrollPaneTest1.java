package scrollPaneClassPractice;

import java.awt.*;

public class ScrollPaneTest1 {
    public static void main(String[] args) {

        // as needed 가 가장 쓸만함
        Frame f1 = new Frame("ScrollPane Test - default: AS NEEDED");
        f1.setSize(300, 200);

        ScrollPane sp1 = new ScrollPane();
        Panel p1 = new Panel();
        p1.setBackground(Color.pink);
        p1.add(new Button("1st"));
        p1.add(new Button("2nd"));
        p1.add(new Button("3rd"));
        p1.add(new Button("3th"));


        sp1.add(p1);
        f1.add(sp1);
        f1.setVisible(true);



        Frame f2 = new Frame("ScrollPane Test - ");
        f2.setSize(300, 200);

        // 생성자에 s 치면 선택 옵션 창 나옴
        ScrollPane sp2 = new ScrollPane(ScrollPane.SCROLLBARS_NEVER);
        Panel p2 = new Panel();
        p2.setBackground(Color.pink);
        p2.add(new Button("1st"));
        p2.add(new Button("2nd"));
        p2.add(new Button("3rd"));
        p2.add(new Button("3th"));


        sp2.add(p2);
        f2.add(sp2 );
        f2.setVisible(true);
    }
}
