package eventPractice.actionHandlerPractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Button1")){
            System.out.println("Button 1 clicked !!");
        }
        if(e.getActionCommand().equals("Button2")){
            System.out.println("Button 2 clicked !!");
        }
        if(e.getActionCommand().equals("Button3")){
            System.out.println("Button 3 clicked !!");
        }
        if(e.getActionCommand().equals("Button4")){
            System.out.println("Button 4 clicked !!");
        }
        if(e.getActionCommand().equals("Button5")){
            System.out.println("Button 5 clicked !!");
        }
    }
}
