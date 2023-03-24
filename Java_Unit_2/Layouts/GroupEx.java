import java.awt.*;
import javax.swing.*;

public class GroupEx{
    GroupEx(){
        JFrame f = new JFrame("Group Layout");
        Container contentPanel = f.getContentPane();
        GroupLayout grp = new GroupLayout(contentPanel);

        contentPanel.setLayout(grp);

        JLabel clickMe = new JLabel("Click Here");
        JButton button = new JButton("This Button");
        
        grp.setHorizontalGroup(grp.createSequentialGroup()
        .addComponent(clickMe)
        .addGap(10,20,100)
        .addComponent(button)
        );

        grp.setVerticalGroup(grp.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(clickMe)
                                .addComponent(button));
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public static void main(String[] args){
        new GridBagEx();
    }
    
}