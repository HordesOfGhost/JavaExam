import java.awt.*;
import javax.swing.*;

public class GridBagLayoutEx{
    GridBagLayoutEx(){

        JFrame f = new JFrame("GridBag Layout");

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");     
        JButton b3 = new JButton("Button3");     
        JButton b4 = new JButton("Button4");     
        JButton b5 = new JButton("Button5");     

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 0;
        panel.add(b1,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 1;
        cst.gridy = 0;
        panel.add(b2,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 2;
        cst.gridy = 0;
        panel.add(b3,cst);
        
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 1;
        cst.gridwidth = 3;
        panel.add(b4,cst);

        
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 2;
        cst.gridy = 2;
        panel.add(b5,cst);

        f.add(panel);
        f.setSize(760,480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new GridBagLayoutEx();
    }
}