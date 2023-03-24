import javax.swing.*;

public class SwingComponents {
    SwingComponents(){
        JFrame f = new JFrame("List Example");
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");
        l1.addElement("Item1");

        JList<String> list = new JList<>(l1);
        list.setBounds(100,100,75,75);
        
        f.add(list);
        f.setSize(720,720);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new SwingComponents();
    }
}
