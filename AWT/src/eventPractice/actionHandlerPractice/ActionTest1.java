package eventPractice.actionHandlerPractice;

import java.awt.*;

public class ActionTest1 {
    private Frame f;
    private Button btn1, btn2, btn3, btn4, btn5;

    public ActionTest1(){
        f = new Frame();
        btn1 = new Button("Button1");
        btn2 = new Button("Button2");
        btn3 = new Button("Button3");
        btn4 = new Button("Button4");
        btn5 = new Button("Button5");

    }

    public void startFrame() {
        btn1.addActionListener(new ActionHandler1());
        btn2.addActionListener(new ActionHandler1());
        btn3.addActionListener(new ActionHandler1());
        btn4.addActionListener(new ActionHandler1());
        btn5.addActionListener(new ActionHandler1());

        f.add(btn1, BorderLayout.NORTH);
        f.add(btn2, BorderLayout.SOUTH);
        f.add(btn3, "West");
        f.add(btn4, "East");
        f.add(btn5, "Center");

        f.setSize(500, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ActionTest1 handlerTest = new ActionTest1();
        handlerTest.startFrame();


    }
}
