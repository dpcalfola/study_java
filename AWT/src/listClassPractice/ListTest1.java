package listClassPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTest1 extends WindowAdapter implements ActionListener {
    Frame f1 = new Frame("List- Select");
    List selectOne = new List(6);
    List SelectMany = new List(6, true);
    Button b1 = new Button("Select 1");
    Button b2 = new Button("Select 2");

    public ListTest1() {
        f1.setSize(400, 250);
        f1.setLayout(null);

        selectOne.setLocation(20, 40);
        selectOne.setSize(150, 120);
        selectOne.add("Student");
        selectOne.add("Teacher");
        selectOne.add("Driver");
        selectOne.add("Programmer");
        selectOne.add("Sales Person");
        selectOne.add("Director");

        SelectMany.setLocation(220, 40);
        SelectMany.setSize(150, 120);
        SelectMany.add("Student");
        SelectMany.add("Teacher");
        SelectMany.add("Driver");
        SelectMany.add("Programmer");
        SelectMany.add("Sales Person");
        SelectMany.add("Director");

        b1.setSize(100, 50);
        b1.setLocation(40, 180);
        b1.addActionListener(this);

        b2.setSize(100, 50);
        b2.setLocation(245, 180);
        b2.addActionListener(this);


        f1.add(selectOne);
        f1.add(SelectMany);
        f1.setVisible(true);
        f1.addWindowListener(this);
        f1.add(b1);
        f1.add(b2);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        ListTest1 g1 = new ListTest1();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Select 1")) {
            System.out.println(selectOne.getSelectedItem());
        }

        if (e.getActionCommand().equals("Select 2")) {
//            System.out.println(Arrays.toString(SelectMany.getSelectedItems()));
            String[] strArr = SelectMany.getSelectedItems();
            for (int i = 0; i < strArr.length; i++) {
                System.out.println(strArr[i]);
            }

        }

    }
}
