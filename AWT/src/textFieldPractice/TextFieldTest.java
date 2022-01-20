package textFieldPractice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {


    public static void main(String[] args) {

        AccountData a1 = new AccountData();


        Frame f = new Frame("Login");
        f.setSize(350, 100);
        f.setLayout(new FlowLayout());

        Label lId = new Label("ID: ", Label.RIGHT);
        Label lPwd = new Label("Password: ", Label.RIGHT);

        TextField result = new TextField(20);
        TextField id = new TextField(10);
        TextField pwd = new TextField(10);
        pwd.setEchoChar('*');


        Button b1 = new Button("Submit");
        b1.setSize(300, 200);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Submit")) {
                    if (a1.isCorrectAccount(id.getText(), pwd.getText())) {
                        System.out.println("correct");
                        result.setText("Hello " + a1.getAdminId());
                        f.remove(b1);
                        f.add(result);
                        f.setVisible(true);

                    } else {
                        result.setText("Cannot found account");
                        System.out.println(id.getText());
                        System.out.println(pwd.getText());
                        f.remove(b1);
                        f.add(result);
                        f.setVisible(true);


                    }

                }
            }
        });

        f.add(lId);
        f.add(id);
        f.add(lPwd);
        f.add(pwd);
        f.add(b1);
        f.setVisible(true);

    }
}


class AccountData {

    boolean isCorrectAccount(String inputId, String inputPwd) {
        if (inputId.equals(adminId) && inputPwd.equals(adminPwd)) {
            return true;
        }
        return false;
    }

    private final String adminId = "Fola";
    private final String adminPwd = "1234";

    public String getAdminId() {
        return adminId;
    }
}