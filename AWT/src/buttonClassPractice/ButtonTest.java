package buttonClassPractice;

import java.awt.*;

public class ButtonTest {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);

        // 이 예제 코드의 최중요 코드
        // 프레임의 레이아웃 디폴트는 보더 레이아웃임
        // setLayout 값에 null 을 넣음으로 레이아웃 설정 초기화
        // 수동 레이아웃 설정 가능
        f.setLayout(null);

        Button b = new Button("확인");
        b.setSize(100,50);
        b.setLocation(100,75);

        f.add(b);
        f.setVisible(true);
    }
}



// 버튼 클릭시 "확인" ==> "취소"로
// 취소 ==> 확인으로