package buttonClassPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTestQuiz1 {
    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        Button b = new Button("확인");
        b.setSize(100,50);
        b.setLocation(100,75);

        f.add(b);
        f.setVisible(true);

        // 여기서부터 퀴즈 코드

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getLabel().equals("확인")){
                    b.setLabel("취소");
                }else{
                    b.setLabel("확인");
                }
            }
        });
    }
}


// Quiz
// 버튼 클릭시 "확인" ==> "취소"로
// 취소 ==> 확인으로