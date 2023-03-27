import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionEventEx implements ActionListener{
    JLabel lb;
    ActionEventEx(){
        JFrame f = new JFrame("Action Event");

        JButton bt = new JButton("Button");
        lb = new JLabel();

        bt.addActionListener(this);
        
        f.add(bt);
        f.add(lb);

        f.setLayout(new FlowLayout());

        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        lb.setText("Sakku and Bibu");
    }
    public static void main(String[] args){
        new ActionEventEx();
    }



}