import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Menu_Practise{

    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    JCheckBoxMenuItem i6;
    JRadioButtonMenuItem i7;

    Menu_Practise(){
        JFrame f = new JFrame("Menus");
        JMenuBar mb = new JMenuBar();
        //ImageIcon myIcon = new ImageIcon("C://Users//Ghost//Desktop//check//mst.JPG");
        
        menu = new JMenu("Menu");
        submenu = new JMenu("SubMenu");


        //Mneumonics and accelators
        menu.setMnemonic(KeyEvent.VK_F);

        i1 = new JMenuItem("Copy");
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
        i2 = new JMenuItem("Cut");
        i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
        i3 = new JMenuItem("Paste");
        i4 = new JMenuItem("Save");
        i5 = new JMenuItem("Item 5",KeyEvent.VK_5);
        i6 = new JCheckBoxMenuItem("Male");
        i7 = new JRadioButtonMenuItem("Radio");
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        // submenu.add(i5);
        submenu.add(i6);

        menu.add(submenu);
        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args){
        new Menu_Practise();
    }
}