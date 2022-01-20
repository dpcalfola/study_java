package textAreaClassPractice;

import java.awt.*;

public class TextAreaTest {
    public static void main(String[] args) {
        Frame f = new Frame("Comments");
        f.setSize(500, 200);
        f.setLayout(new FlowLayout());
        f.setLocation(10, 10);

        TextArea comments1 = new TextArea("하고 싶은 말을 적으세요!");

        f.add(comments1);
        comments1.selectAll();
        f.setVisible(true);
    }
}
