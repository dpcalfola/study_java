package labelClassPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelTest1 extends WindowAdapter {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        Label id1 = new Label("ID: ");
        id1.setBounds(50, 50, 100, 10);

        Label pwd1 = new Label("PASSWORD: ");
        pwd1.setBounds(50, 65, 100, 10);


        Button b1 = new Button("test");
        b1.setSize(100, 30);
        b1.setLocation(40, 90);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id1.setText("clicked!!");
            }
        });

        f.add(b1);
        f.add(id1);
        f.add(pwd1);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}
