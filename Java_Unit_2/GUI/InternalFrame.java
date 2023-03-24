import java.awt.*;
import javax.swing.*;

public class InternalFrame{
    InternalFrame(){
        JFrame f = new JFrame("Parent");

        JDesktopPane dp = new JDesktopPane();
        JInternalFrame jif = new JInternalFrame("Internal Frame",true,true,true,true);
        JLabel lb = new JLabel("Name");
        JTextField tf = new JTextField(10);


        jif.setSize(320,320);
        jif.setVisible(true);
        jif.setLayout(new FlowLayout(FlowLayout.CENTER));
        jif.add(lb);
        jif.add(tf);

        dp.add(jif);
        f.add(dp);
        
        f.setSize(640,640);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new InternalFrame();
    }
}