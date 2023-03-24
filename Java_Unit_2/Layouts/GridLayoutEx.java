import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx{
    GridLayoutEx(){
        JFrame f = new JFrame("GridLayout");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");

        f.add(b1);f.add(b2);
        f.add(b3);f.add(b4);
        f.add(b5);f.add(b6);

        f.setLayout(new GridLayout(3,3,4,5));

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new GridLayoutEx();
    }
}