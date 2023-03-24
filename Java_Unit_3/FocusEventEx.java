import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusEventEx implements FocusListener{
    JTextField tf1;
    JTextField tf2;

    FocusEventEx(){

        JFrame f = new JFrame();
        
        tf1 = new JTextField();
        tf2 = new JTextField();

        tf1.setBounds(0,0,100,100);
        tf2.setBounds(0,100,100,100);


        f.add(tf1);
        f.add(tf2);
        
        tf1.addFocusListener(this);
        tf2.addFocusListener(this);
        f.setLayout(null);
        f.setTitle("Focus Listener");
        f.setSize(700,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void focusGained(FocusEvent e){
        if(e.getSource() == tf1){
            tf1.setBackground(Color.GREEN);
        }
        else if(e.getSource() == tf2){
            tf2.setBackground(Color.GREEN);
        }
    }
    @Override
    public void focusLost(FocusEvent e){
        if(e.getSource() == tf1){
            tf1.setBackground(Color.RED);
        }
        else if(e.getSource() == tf2){
            tf2.setBackground(Color.RED);
        }
    }
    public static void main(String[] args){
        new FocusEventEx();
    }
}