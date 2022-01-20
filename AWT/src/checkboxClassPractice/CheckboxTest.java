package checkboxClassPractice;

import java.awt.*;

public class CheckboxTest {
    public static void main(String[] args) {
        Frame f1 = new Frame("Questions");
        f1.setSize(305, 250);
        f1.setLayout(new FlowLayout());

        Label q1 = new Label("1. 당신의 관심 분야는(여러개 선택 가능)");
        Checkbox news = new Checkbox("news", true);
        Checkbox sports = new Checkbox("sports");
        Checkbox movie = new Checkbox("movie");
        Checkbox music = new Checkbox("music");

        f1.add(q1);
        f1.add(news);
        f1.add(sports);
        f1.add(movie);
        f1.add(music);


        Label q2 = new Label("2. 얼마나 자주 극장에 가십니까?");
        CheckboxGroup group1 = new CheckboxGroup();
        Checkbox movie1 = new Checkbox("한 달에 한 번 갑니다", group1, true);
        Checkbox movie2 = new Checkbox("일주일에 한 번 갑니다", group1, true);
        Checkbox movie3 = new Checkbox("일주일에 두 번 갑니다", group1, true);
        f1.add(q2);
        f1.add(movie1);
        f1.add(movie2);
        f1.add(movie3);

        Label q3 = new Label("3. 하루에 얼마나 컴퓨터를 사용하십니까?");
        CheckboxGroup group2 = new CheckboxGroup();
        Checkbox com1 = new Checkbox("", group2, true);
        Checkbox com2 = new Checkbox("", group2, false);
        Checkbox com3 = new Checkbox("", group2, false);
        f1.add(q3);
        f1.add(com1);
        f1.add(com2);
        f1.add(com3);

        f1.setVisible(true);
    }
}
