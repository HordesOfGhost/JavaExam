import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree{
    Tree(){
        JFrame f = new JFrame("Tree");

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");

        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode white = new DefaultMutableTreeNode("White");

        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(white);

        JTree jt = new JTree(style);

        f.add(jt);
        f.setSize(640,640);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Tree();
    }
}