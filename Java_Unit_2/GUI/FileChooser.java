import java.awt.*;
import javax.swing.*;

public class FileChooser{
    FileChooser(){
        JFrame f = new JFrame("Parent");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JFileChooser jf = new JFileChooser("C://");
        f.add(jf);
        jf.showOpenDialog(f);
    }
    public static void main(String[] args){
        new FileChooser();
    }
}