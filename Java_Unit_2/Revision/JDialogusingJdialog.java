import java.awt.*;
import javax.swing.*;

public class JDialogusingJdialog {
    JDialogusingJdialog(){

        JFrame f = new JFrame("Parent Frame");

        JDialog dg = new JDialog();

        JButton b1 = new JButton("Button");
        JTextArea ja = new JTextArea();


        // f.add(dg);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dg.add(b1);
        dg.add(ja);
        dg.setTitle("DialogBox");
        dg.setSize(200,200);
        dg.setVisible(true);
        dg.setLayout(new GridLayout(2,2));
    }
    public static void main(String[] args){
        new JDialogusingJdialog();
    }
    
}
