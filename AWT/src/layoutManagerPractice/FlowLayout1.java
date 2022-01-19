package layoutManagerPractice;

import java.awt.*;


public class FlowLayout1 {

    private Frame fr1;
    private Button btn1, btn2, btn3, btn4, btn5, btn6;

    public FlowLayout1() {
        fr1 = new Frame("FlowLayout1 Example");
        btn1 = new Button("확인");
        btn2 = new Button("열기");
        btn3 = new Button("닫기");
        btn4 = new Button("추가버튼1");
        btn5 = new Button("추가버튼2");
        btn6 = new Button("추가버튼3");
    }

    public void startFrame() {
        // 디폴트 값이 아닌 FlowLayout 으로 설정

        // 아래 코드는 아아래 두줄을 축약한 것
//        fr1.setLayout(new FlowLayout());

        FlowLayout f1 = new FlowLayout();
        fr1.setLayout(f1);

        // 버튼의 위치는 왼쪽 상단부터
        // add 시킨 순서대로
        fr1.add(btn1);
        fr1.add(btn2);
        fr1.add(btn3);
        fr1.add(btn4);
        fr1.add(btn5);
        fr1.add(btn6);



        fr1.setSize(300, 300);
        fr1.setVisible(true);
    }


    public static void main(String[] args) {
        FlowLayout1 flow = new FlowLayout1();
        flow.startFrame();

    }
}
