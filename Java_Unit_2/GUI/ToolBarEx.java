import javax.swing.*;
import java.awt.*;

public class ToolBarEx{
    ToolBarEx(){
        JFrame f = new JFrame("Tool Bar Example");

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);

        JButton button = new JButton("Sakku");

        // Swing Tool Tip
        button.setToolTipText("I Love You - Bibu");
        toolbar.add(button);
        toolbar.addSeparator();
        
        JButton b2 =new JButton("Bibu");
        toolbar.add(b2);
        b2.setToolTipText("I Love You - Sakku");

        toolbar.add(new JComboBox(new String[]{"A","B","C","D"}));

        Container contentPane = f.getContentPane();
        contentPane.add(toolbar,BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        JScrollPane pane = new JScrollPane(textArea);
        contentPane.add(pane,BorderLayout.CENTER);
        f.setSize(300,300);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new ToolBarEx();
    }
}