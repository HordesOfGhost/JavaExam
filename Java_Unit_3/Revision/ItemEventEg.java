import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ItemEventEg implements ItemListener{
    JLabel lb;
    JCheckBox cb;
    ItemEventEg(){
        JFrame f = new JFrame("ItemEvent");
        
        
        lb = new JLabel();
        JCheckBox cb = new JCheckBox("Box");



        cb.addItemListener(this);

        f.add(lb);
        f.add(cb);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        if (e.getStateChange() == ItemEvent.SELECTED){
            lb.setText("Selected");
        }else if (e.getStateChange() == ItemEvent.DESELECTED){
            lb.setText("Deselected");
        }
    }
    public static void main(String[] args){
        new ItemEventEg();
    }
}