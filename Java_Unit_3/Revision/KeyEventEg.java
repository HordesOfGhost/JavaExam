import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class KeyEventEg implements KeyListener{
    JTextField tf,cf;
    KeyEventEg(){
        JFrame f = new JFrame("Key Listener");
        
        tf = new JTextField(20);
        cf = new JTextField(20);

        f.add(tf);
        f.add(cf);

        tf.addKeyListener(this);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyPressed(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        String st = tf.getText();
        cf.setText(st);
    }
    public static void main(String[] args){
        new KeyEventEg();
    }
    
}
