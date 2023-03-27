import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FocusEventEg implements FocusListener{
    JTextField tf1,tf2;
    FocusEventEg(){

        JFrame f = new JFrame("Focus");

        tf1 = new JTextField(10);
        tf2 = new JTextField(10);

        f.add(tf1);
        f.add(tf2);

        tf1.addFocusListener(this);
        tf2.addFocusListener(this);

        f.setLayout(new FlowLayout());
        f.setSize(640,480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void focusGained(FocusEvent e){
        if(e.getSource() == tf1){
            tf1.setBackground(Color.GREEN);
        }else{
            tf2.setBackground(Color.GREEN);
        }
    }
    public void focusLost(FocusEvent e){
        if(e.getSource() == tf1){
            tf1.setBackground(Color.RED);
        }else{
            tf2.setBackground(Color.RED);
        }
    }
    public static void main(String[] args){
        new FocusEventEg();
    }


}