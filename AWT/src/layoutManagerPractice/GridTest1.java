package layoutManagerPractice;

import java.awt.*;

public class GridTest1 {
    private Frame frame1;
    private Button b1, b2, b3;
    private TextField tf1, tf2, tf3;

    public GridTest1() {
        frame1 = new Frame("GridLayout example 1");
        b1 = new Button("button1");
        b2 = new Button("button2");
        b3 = new Button("button3");

        tf1 = new TextField("Input text 1");
        tf2 = new TextField("Input text 2");
        tf3 = new TextField("Input text 3");
    }

    public void startFrame(){
        frame1.setLayout(new GridLayout(3,0));
        frame1.add(b1);
        frame1.add(tf1);
        frame1.add(b2);
        frame1.add(tf2);
        frame1.add(b3);
        frame1.add(tf3);

        //.peck 창 크기를 콤포넌트에 딱 맞게 생성 (남지 않게, 최소값으로)
        frame1.pack();
        frame1.setVisible(true);

    }

    public static void main(String[] args) {
        GridTest1 flow = new GridTest1();
        flow.startFrame();
    }
}
