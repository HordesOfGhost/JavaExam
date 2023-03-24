import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;
import javax.swing.border.Border;

import javax.swing.*;
public class GUI_Practise {
    GUI_Practise(){
        JFrame f = new JFrame("ALL in One");
        
        // JLabel
        // JLabel lb = new JLabel("Password");
        // lb.setBounds(10,10,100,100);

        // //JText Feild
        // JTextField txt = new JTextField("Hey",100);
        // // txt.setBounds(50,50,100,100);
        // f.add(txt);
        // f.setLayout(new FlowLayout());

        // JTextArea txta = new JTextArea(5,5);
        // f.add(txta);
        // f.setLayout(new FlowLayout());

        // JLabel lb = new JLabel("Password");
        // lb.setBounds(10,100,100,30);
        // JPasswordField pw = new JPasswordField();
        // pw.setBounds(100,100,100,30);
        // f.add(pw);
        // f.add(lb);
        // f.setLayout(null);

        // JCheckBox jc = new JCheckBox("yes");
        // f.add(jc);
        // jc = new JCheckBox("no");
        // f.add(jc);
        // f.setLayout(new FlowLayout());

        // JRadioButton r1 = new JRadioButton("Male");
        // JRadioButton r2 = new JRadioButton("Female");
        // ButtonGroup bg = new ButtonGroup();
        // bg.add(r1);
        // bg.add(r2);
        // f.add(r1);
        // f.add(r2);
        // f.setLayout(new FlowLayout());

        // String[] arr = {"Bibek" , "Sakila" , "Bishuka"};
        // JComboBox jb = new JComboBox(arr);
        // jb.setBounds(50,50,100,50);
        // f.add(jb);
        // f.setLayout(null);

        // JPanel pl = new JPanel();
        // pl.setLayout(new BorderLayout());
        // JScrollPane jsp = new JScrollPane(pl,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        //                                     ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        // f.add(jsp);

        
        // JSlider js = new JSlider(JSlider.VERTICAL,10,100,20);
        // js.setMajorTickSpacing(5);
        // js.setPaintTicks(true);
        // js.setPaintLabels(true);
        // f.add(js);

        // Border raisedborder = BorderFactory.createRaisedBevelBorder();
        // Border raisedborder = BorderFactory.createEtchedBorder();

        // JButton b1 = new JButton("Border");
        // b1.setBounds(10,10,100,50);
        // b1.setBorder(raisedborder);
        // f.add(b1);
        // f.setLayout(null);

        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){

        new GUI_Practise();
    }
}
