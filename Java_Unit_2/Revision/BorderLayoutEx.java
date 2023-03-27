import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx {
    BorderLayoutEx(){

        JFrame f = new JFrame("Border Layout");

        JButton nb = new JButton("North");
        JButton sb = new JButton("South");
        JButton eb = new JButton("East");
        JButton wb = new JButton("West");
        JButton cb = new JButton("Center");

    
        f.add(nb,BorderLayout.NORTH);
        f.add(sb,BorderLayout.SOUTH);
        f.add(eb,BorderLayout.EAST);
        f.add(wb,BorderLayout.WEST);
        f.add(cb,BorderLayout.CENTER);
        // f.add(nb);
        // f.add(sb);
        // f.add(eb);
        // f.add(wb);       
        // f.add(cb);

        // f.setLayout(new BorderLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(720,640);
    }
    public static void main(String[] args){
        new BorderLayoutEx();
    }
}