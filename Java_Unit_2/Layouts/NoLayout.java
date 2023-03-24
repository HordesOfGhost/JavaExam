// import java.awt.*;
import javax.swing.*;

public class NoLayout{
    NoLayout(){
        JFrame f = new JFrame("No Layout");

        JButton b1 = new JButton("Button 1");

        b1.setBounds(52,100,100,120);
        f.add(b1);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new NoLayout();
    }
}