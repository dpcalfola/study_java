package layoutManagerPractice;

import java.awt.*;
import java.io.FileReader;

public class PanelTest1 {

    private Frame f;
    private Panel p;
    private Button ok, cancel;
    private TextField tf1;

    public PanelTest1() {
        f = new Frame("Pannel example 1");
        ok = new Button("OK");
        cancel = new Button("Cancel");
        tf1 = new TextField("Input...");
        p = new Panel();

    }

    public void startFrame() {
        f.add(tf1, BorderLayout.NORTH);
        p.setBackground(Color.gray);
        p.add(ok);
        p.add(cancel);
        f.add(p, BorderLayout.CENTER);

        f.setSize(400, 400);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        PanelTest1 g = new PanelTest1();
        g.startFrame();
    }
}

// 패널: 콤포넌트 안에 콤포넌트
// div ???
// 패널의 기본 레이아웃은 플로우레이아웃