import java.awt.*;
import javax.swing.*;
public class InternalFramEg {
    InternalFramEg(){
        JFrame f = new JFrame();

        JDesktopPane dp = new JDesktopPane();
        JInternalFrame jif = new JInternalFrame("Wind",true,true,true,true);

        jif.setVisible(true);
        jif.setSize(200,200);
        
        dp.add(jif);
        f.add(dp);

        String[] arr = {"aa","bb","cc"};
        JList jl = new JList<>(arr);
        jif.add(jl);
        
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new InternalFramEg();
    }
}
