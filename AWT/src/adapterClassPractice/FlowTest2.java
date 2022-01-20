package adapterClassPractice;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest2 extends WindowAdapter {
    private Frame f1 ;
    private Button btn1, btn2, btn3 ;

    public FlowTest2() {
        f1 = new Frame("adapter example");
        btn1 = new Button("OK");
        btn2 = new Button("Open");
        btn3 = new Button("Close");

    }
    // void 메서드 명을 정확하게 입력해야 함.
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public void startFrame() {
        f1.addWindowListener(this);
        f1.setLayout(new FlowLayout());

        f1.add(btn1);
        f1.add(btn2);
        f1.add(btn3);

        f1.setSize(300, 300);
        f1.setVisible(true);


    }

    public static void main(String[] args) {
        FlowTest2 g2 = new FlowTest2();
        g2.startFrame();

    }
}
