import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventEx implements MouseListener{
    JButton bt;
    
    MouseEventEx(){

        JFrame f = new JFrame();
        
        bt = new JButton("CLICK ME");
        f.add(bt);
        bt.addMouseListener(this);
        bt.setBounds(50,50,250,50);
        f.setLayout(null);
        f.setTitle("Handling Mouse Listener");
        f.setSize(640,480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        bt.setText("MouseClicked");
        bt.setBackground(Color.BLUE);
    }
    @Override
    public void mouseEntered(MouseEvent e){
        bt.setBackground(Color.RED);
    }
    @Override
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    public static void main(String[] args){
        new MouseEventEx();
    }
}