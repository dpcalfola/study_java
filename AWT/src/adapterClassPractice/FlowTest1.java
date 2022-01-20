package adapterClassPractice;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest1 implements WindowListener, ActionListener {

    private Frame f;
    private Button btn1, btn2, btn3;

    public FlowTest1() {
        f = new Frame("adapter example");
        btn1 = new Button("OK");
        btn2 = new Button("Open");
        btn3 = new Button("Close");
    }

    //windowListener
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    // actionListener // 안됨? // 나중에 체크!!
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("OK")){
            System.out.println("OK button clicked");
        }

    }

    public void startFrame() {
        f.addWindowListener(this);
        f.setLayout(new FlowLayout());

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK button clicked.");
            }
        });

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.setSize(500, 500);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        FlowTest1 g1 = new FlowTest1();
        g1.startFrame();
    }

}
