package fileDialogClassPractice;

import java.awt.*;
import java.io.File;

public class FileDialogTest1 {
    public static void main(String[] args) {
        Frame f = new Frame ("Parent");
        f.setSize(300, 200);

        FileDialog fileOpen = new FileDialog(f, "File Open", FileDialog.LOAD);

        f.setVisible(true);
        fileOpen.setDirectory("");
        fileOpen.setVisible(true);



        System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
    }
}

