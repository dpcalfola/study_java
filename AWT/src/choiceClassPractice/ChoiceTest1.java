package choiceClassPractice;

import java.awt.*;
import java.awt.event.*;

public class ChoiceTest1 extends WindowAdapter implements ActionListener {

    // main
    public static void main(String[] args) {

        ChoiceTest1 g1 = new ChoiceTest1();

    }
    //

    Frame f = new Frame("Choice - Select");
    Choice day = new Choice();
    Button b1;


    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }




    ChoiceTest1() {
        f.setSize(500, 500);
        f.setLayout(null);
        day.add("SUN");
        day.add("MON");
        day.add("TUE");
        day.add("WED");
        day.add("THU");
        day.add("FRI");
        day.add("SAT");


        day.setSize(100, 50);
        day.setLocation(100, 70);


        // 복사 코드 // 재구현 해볼것
//        day.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                b1.setLabel(day.getSelectedItem());
//            }
//        });


        b1 = new Button("요일");
        b1.setLocation(300, 300);
        b1.setSize(100, 50);
        b1.addActionListener(this);


        f.add(day);
        f.add(b1);
        f.setVisible(true);
        f.addWindowListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b1.setLabel(day.getSelectedItem());
    }
}


// 버튼을 클릭할시 초이스 시 선택된 요일로 버튼 레이블 설정