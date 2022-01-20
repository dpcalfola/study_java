package eventPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 implements ActionListener {
    private Frame frame;
    private Button btnNorth, btnCenter, btnWest, btnEast, btnSouth;
    private TextField tf1;


    // 생성자
    public EventTest1(){
        frame = new Frame("event handler example");

        // label: 버튼에 표시되는 이름
        btnNorth = new Button("button 1");
        btnSouth = new Button("button 2");
        btnWest = new Button("button 3");
        btnEast = new Button("button 4");
        btnCenter = new Button("button Center");

    }

    public void startFrame() {

        // 이벤트리스너를 호출하는 메서드
        // 버튼에 이벤트리스너를 달아주는 역할
        // 이벤트리스너의 역할: 이벤트 발생을 대기
        // this: 자기자신
        // 버튼이 클릭되었을 액션퍼폼드가 호출
        btnNorth.addActionListener(this);
        btnSouth.addActionListener(this);
        btnWest.addActionListener(this);
        btnEast.addActionListener(this);
        btnCenter.addActionListener(this);



        frame.add(btnNorth, "North");
        frame.add(btnSouth,"South");
        frame.add(btnWest,"West");
        frame.add(btnEast, "East");
        frame.add(btnCenter, "Center");


        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // e.getActionCommand().equals( ⭐️️"레이블"⭐  )
        if (e.getActionCommand().equals("button 1")){
            System.out.println("Button 1 Clicked !");
        }
        if (e.getActionCommand().equals("button 2")){
            System.out.println("Button 2 Clicked !");
        }
        if (e.getActionCommand().equals("button 3")){
            System.out.println("Button 3 Clicked !");
        }
        if (e.getActionCommand().equals("button 4")){
            System.out.println("Button 4 Clicked !");
        }
        if (e.getActionCommand().equals("button Center")){
            System.out.println("Button center Clicked !");
        }

    }

    public static void main(String[] args) {
        EventTest1 eventTestEventually = new EventTest1();
        eventTestEventually.startFrame();
    }
}
