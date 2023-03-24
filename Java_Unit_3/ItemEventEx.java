import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventEx implements ItemListener{
    JFrame frame;
    JCheckBox checkBox;
    JLabel label;
    
    ItemEventEx(){
        frame = new JFrame("Item Events");

        checkBox = new JCheckBox("Check Me");
        checkBox.setBounds(320, 50, 100, 50);
        
        label = new JLabel();
        label.setBounds(320,100,260,100);
        checkBox.addItemListener(this);
        
        frame.add(label);
        frame.add(checkBox);

        frame.setLayout(null);
        frame.setSize(640,480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED){
            label.setText("CheckBox is checked");
        }
        else if(e.getStateChange() == ItemEvent.DESELECTED){
            label.setText("CheckBox is unchecked");
        }
    }
    public static void main(String[] args){
        new ItemEventEx();
    }

}