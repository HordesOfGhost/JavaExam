import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowEventEx implements WindowListener{
    JLabel jl;

    WindowEventEx(){
        JFrame f = new JFrame();

        jl = new JLabel("Window Opened");
        jl.setBounds(60,60,240,60);
        f.add(jl);
        f.setLayout(null);
        f.setSize(640,480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void windowOpened(WindowEvent e){
        jl.setText("Window opened");
        System.out.println("Window Opened");
    }
    
    public void windowClosing(WindowEvent e){
        jl.setText("Window Closing");
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e){
        jl.setText("Window Closed");
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e){
        jl.setText("Window Iconified");
        System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent e){
        jl.setText("Window Deiconified");
        System.out.println("Window Deiconified");
    }
    public void windowActivated(WindowEvent e){
        jl.setText("Window Activated");
        System.out.println("Window Activated");
    }
    public void windowDeactivated(WindowEvent e){
        jl.setText("Window Deactivated");
        System.out.println("Window Deactivated");
    }
    public static void main(String[] args){
        new WindowEventEx();
    }
}