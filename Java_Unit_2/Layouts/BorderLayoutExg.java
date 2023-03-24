import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutExg{
    BorderLayoutExg(){
        JFrame f = new JFrame();

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);

        // f.add(b1);
        // f.add(b2);
        // f.add(b3);
        // f.add(b4);
        // f.add(b5);

        // f.setLayout(new BorderLayout());

        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new BorderLayoutExg();
    }
}