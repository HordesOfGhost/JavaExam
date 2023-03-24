import java.awt.*;
import javax.swing.*;

public class JDailogEx{
    JDailogEx(){
        JFrame f = new JFrame("Dialog ex");
        JLabel l = new JLabel("Name");
        JTextField tf = new JTextField(10);

        JDialog jd = new JDialog(f,"JDialog_Example",true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        jd.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        jd.setSize(300,200);
        jd.setLocation(50,50);
        jd.add(l);
        jd.add(tf);
        jd.setVisible(true);
    }
    public static void main(String[] args){
        new JDailogEx();
    }
}