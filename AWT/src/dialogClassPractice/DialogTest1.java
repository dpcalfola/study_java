package dialogClassPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest1 {

    public static void main(String[] args) {
        Frame f = new Frame("Parent");
        f.setSize(300, 200);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Dialog info1 = new Dialog(f,"Information",true);
        info1.setSize(140, 90);
        info1.setLocation(50,50);
        info1.setLayout(new FlowLayout());

        Label msg = new Label("This is modal dialog", Label.CENTER);
        Button btn1 = new Button("OK");
        info1.add(msg);
        info1.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("OK")){
                    // .dispose() ==> void //Dialog 를 닫는다
                    info1.dispose();

                }
            }
        });
//        info1.setVisible(true); // 렌더링 한다
//        info1.setVisible(false); // 숨긴다
//        info1.setVisible(true); // 렌더링 한다



        f.setVisible(true);
        info1.setVisible(true);
    }

}
