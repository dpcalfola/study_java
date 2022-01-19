package layoutManagerPractice;

import java.awt.*;

public class BorderTest2 {

    private Frame frame;
    private Button center, west, east, south;
    private TextField tf1;


    // 생성자
    public BorderTest2(){
        // title: 창의 중앙에 표시되는 이름
        frame = new Frame("BorderLayout Example2");

        // label: 버튼에 표시되는 이름
        west = new Button("button 1");
        center = new Button("button Center");
        tf1 = new TextField();
        tf1.setText("입력창 입니다");
    }

    public void startFrame() {
        // constraints: 규약.
        // "North" 등등은 모두 예약어.
        // 앞글자 대문자 아닐 시 컴파일 에러
        frame.add(tf1, "North");

        frame.add(west,"West");

        frame.add(center, "Center");

        // 프레임 사이즈
        frame.setSize(800, 800);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        BorderTest2 border = new BorderTest2();
        border.startFrame();
    }
}
