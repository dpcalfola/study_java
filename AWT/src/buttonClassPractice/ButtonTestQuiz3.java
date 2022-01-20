package buttonClassPractice;

import eventPractice.actionHandlerPractice.ActionHandler1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTestQuiz3 extends WindowAdapter implements ActionListener {

    private Frame f1;
    private Button btn;

    public ButtonTestQuiz3(){
        f1 = new Frame("Login");
        f1.setSize(300, 200);
        f1.setLayout(null);
        f1.addWindowListener(this);

        btn = new Button("확인");
        btn.setSize(100, 50);
        btn.setLocation(100, 75);

        // 버튼을 대기상태로 만든다 ==> ActionEvent e 로 이동
        btn.addActionListener(this);


        f1.add(btn);
        f1.setVisible(true);
    }

    public void windowClosing(WindowEvent e){
        System.exit(0);

    }




    public static void main(String[] args) {

        ButtonTestQuiz3 btq1 = new ButtonTestQuiz3();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("확인")){
            btn.setLabel("취소");
        } else {
            btn.setLabel("확인");
        }

    }
}



// 버튼 클릭시 "확인" ==> "취소"로
// 취소 ==> 확인으로