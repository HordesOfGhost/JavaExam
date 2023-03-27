import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseActionEg implements MouseListener{
    JLabel lb;
    MouseActionEg(){

        JFrame f = new JFrame("Mouse Listner");
        lb = new JLabel();
        JButton btn = new JButton("Button");

        btn.addMouseListener(this);

        f.add(lb);
        f.add(btn);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        lb.setText("CLICKED");
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public static void main(String[] args){
        new MouseActionEg();
    }
}