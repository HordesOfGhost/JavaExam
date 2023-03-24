import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionEventEx implements ActionListener{
    JTextField tf;
    
    ActionEventEx(){
        JFrame f = new JFrame("Action Listener");

        tf = new JTextField();
        tf.setBounds(60,50,170,20);

        JButton btn = new JButton("Show");
        btn.setBounds(90,140,75,40);
        btn.addActionListener(this);

        f.add(btn);
        f.add(tf);
        f.setSize(250,250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        tf.setText("Hello World");
    }
    public static void main(String[] args){
        new ActionEventEx();
    }

}