import java.awt.*;
import javax.swing.*;

public class GridBagEx{
    GridBagEx(){
        JFrame f = new JFrame("GridBag");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 1;
        cst.gridy = 0;
        panel.add(b1,cst);

        cst.gridx = 0;
        cst.gridy = 0;
        panel.add(b2,cst);
        
        
        cst.gridx = 2;
        cst.gridy = 0;
        panel.add(b3,cst);

        cst.gridx = 3;
        cst.gridy = 0;
        panel.add(b4,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        
        cst.gridx = 0;
        cst.gridwidth = 2;
        cst.gridy = 1;
        panel.add(b5,cst);
        
        
        cst.fill = GridBagConstraints.HORIZONTAL;
        
        cst.gridx = 3;
        cst.gridwidth = 1;
        cst.gridheight = 2;
        cst.gridy = 2;
        panel.add(b6,cst);

        f.setSize(300,300);
        f.getContentPane().add(panel);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new GridBagEx();
    }
}