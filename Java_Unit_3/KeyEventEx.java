import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventEx implements KeyListener{
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);

    KeyEventEx(){

        JFrame f = new JFrame();

        t1.setBounds(0,0,1000,100);
        t2.setBounds(0,100,1000,100);

        f.add(t1);
        f.add(t2);

        t2.setEditable(false);
        f.setLayout(null);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1.addKeyListener(this);

    }
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void keyPressed(KeyEvent e){
    }
    @Override
    public void keyReleased(KeyEvent e){
        String copy = t1.getText();
        t2.setText(copy);
    }
    public static void main(String[] args){
        new KeyEventEx();
    }
}