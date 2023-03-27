import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIEx{
    GUIEx(){

        JFrame f = new JFrame("GUI");

        // //Labels
        // JLabel l1 = new JLabel("First Label");
        // l1.setBounds(60,60,100,30);
        // f.add(l1);

        // //JText Fields
        // JTextField txt = new JTextField("Here",10);
        // txt.setBounds(60,120,100,50);
        // f.add(txt);

        // //JText Area
        // JTextArea ta = new JTextArea(5,5);
        // ta.setBounds(60,200,100,20);
        // f.add(ta);

        // //JPassword field
        // JPasswordField pw = new JPasswordField();
        // pw.setBounds(60,300,100,20);
        // f.add(pw);

        // //JCheckBox
        // ButtonGroup bg1 = new ButtonGroup();
        // JCheckBox jcp = new JCheckBox("yes");
        // jcp.setBounds(100,400,50,50);
        // bg1.add(jcp);
        // f.add(jcp);
        
        // JCheckBox jcp1 = new JCheckBox("maybe");
        // jcp1.setBounds(150,400,50,50);
        // bg1.add(jcp1);
        // f.add(jcp1);

        // JCheckBox jcp2 = new JCheckBox("no");
        // jcp2.setBounds(200,400,50,50);
        // bg1.add(jcp2);
        // f.add(jcp2);

        // // RadioButton
        // JRadioButton rb1 = new JRadioButton("Male");
        // JRadioButton rb2 = new JRadioButton("Female");

        // ButtonGroup bg2 = new ButtonGroup();
        // bg2.add(rb1);
        // bg2.add(rb2);

        // rb1.setBounds(100,500,50,50);
        // rb2.setBounds(150,500,50,50);

        // f.add(rb1);
        // f.add(rb2);

        // //JCombo Box
        // String[] arr = {"1129","Sakila","Bibek"};
        // JComboBox cb = new JComboBox<>(arr);
        // cb.setBounds(100,0,150,50);
        // f.add(cb);

        // // //JScroll pane
        // // JPanel panel = new JPanel();
        // // panel.setLayout(new BorderLayout());
        // // JScrollPane sp = new JScrollPane(panel,
        // //     ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        // //     ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        // // f.add(sp);

        // // //JSlider
        // // JPanel panel = new JPanel();
        // // JSlider jsl = new JSlider(JSlider.HORIZONTAL,0,100,20);
        // // panel.add(jsl);
        // // f.add(panel);
        
        // //Border
        // JButton b = new JButton("Button");
        // b.setBounds(700,200,50,50);
        // b.setBorder(BorderFactory.createTitledBorder("Hey"));
        // f.add(b);
        
        //Menu
        // JMenuBar jbm = new JMenuBar();
        // JMenu menu = new JMenu("New");
        // JMenu submenu = new JMenu("Sub");

        // JMenuItem i1 = new JMenuItem("i1",KeyEvent.VK_O);
        // i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
        // JMenuItem i2 = new JMenuItem("i2");
        // i2.setEnabled(false);   
        // JMenuItem i3 = new JMenuItem("i3");
        // JMenuItem i4 = new JMenuItem("i4");
        // JMenuItem i5 = new JCheckBoxMenuItem("i5",true);

        // menu.add(i1);
        // menu.add(i2);
        // menu.add(submenu);
        // submenu.add(i3);
        // submenu.add(i4);
        // submenu.add(i5);


        // jbm.add(menu);
        // f.setJMenuBar(jbm);

        //File Choosers

        // JFileChooser jf = new JFileChooser("C://");
        // jf.showOpenDialog(this);


        f.setLayout(null);
        f.setSize(1080,720);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new GUIEx();
    }
}