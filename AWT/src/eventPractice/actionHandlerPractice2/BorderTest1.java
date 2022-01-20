package eventPractice.actionHandlerPractice2;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest1 {

    public static void main(String[] args) {
        BorderTest1 g1 = new BorderTest1();
        g1.startFrame();
    }



    private Frame f;
    private Button btn1, btn2, btn3, btn4, btn5;

    public BorderTest1(){
        f = new Frame("BorderTest1 example");
        btn1 = new Button("Button1");
        btn2 = new Button("Button2");
        btn3 = new Button("Button3");
        btn4 = new Button("Button4");
        btn5 = new Button("Button5");
    }

    public class InnerHandler1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Button1")){
                System.out.println("Button1 clicked");
            }
            if(e.getActionCommand().equals("Button2")){
                System.out.println("Button2 clicked");
            }
            if(e.getActionCommand().equals("Button3")){
                System.out.println("Button3 clicked");
            }
            if(e.getActionCommand().equals("Button4")){
                System.out.println("Button4 clicked");
            }
            if(e.getActionCommand().equals("Button5")){
                System.out.println("Button5 clicked");
            }
        }
    }


    public void startFrame() {
        btn1.addActionListener(new InnerHandler1());
        btn2.addActionListener(new InnerHandler1());
        btn3.addActionListener(new InnerHandler1());
        btn4.addActionListener(new InnerHandler1());
        btn5.addActionListener(new InnerHandler1());


        f.add(btn1, BorderLayout.NORTH);
        f.add(btn2, BorderLayout.WEST);
        f.add(btn3, BorderLayout.CENTER);
        f.add(btn4, BorderLayout.EAST);
        f.add(btn5, BorderLayout.SOUTH);

        f.setSize(500, 500);
        f.setVisible(true);
    }


}
