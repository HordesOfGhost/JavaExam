import javax.swing.*;
import javax.swing.tree.*;

public class TreeEg {
    TreeEg(){
        JFrame f = new JFrame("Tree");

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");

        style.add(font);
        style.add(color);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");

        color.add(red);
        
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new TreeEg();
    }
    
}
