package eventPractice.actionHandlerPractice3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousEvent1 {
    private Frame frame;
    private Button btn1, btn2, btn3, btn4, btn5;

    public AnonymousEvent1() {
        frame = new Frame("Anonymous Event Handler");
        btn1 = new Button("Button 1");
        btn2 = new Button("Button 2");
        btn3 = new Button("Button 3");
        btn4 = new Button("Button 4");
        btn5 = new Button("Button 5");

    }

    public void startFrame() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 clicked");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 4 clicked");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 5 clicked");
            }
        });

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.WEST);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.EAST);
        frame.add(btn5, BorderLayout.SOUTH);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AnonymousEvent1 g1 = new AnonymousEvent1();
        g1.startFrame();
    }

}
