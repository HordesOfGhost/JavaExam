import java.awt.*;
import javax.swing.*;

public class ColorChooserEx{
    ColorChooserEx(){
        JFrame f = new JFrame("Color Chooser");

        JColorChooser cc = new JColorChooser();
        
        JPanel p = new JPanel();
        f.add(p);

        Color c = cc.showDialog(f,"Select Color",Color.red);
        p.setBackground(c);
        f.setVisible(true);
        f.setSize(720,720);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new ColorChooserEx();
    }
}