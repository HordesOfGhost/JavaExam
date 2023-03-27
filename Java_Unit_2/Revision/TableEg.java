import java.awt.BorderLayout;

import javax.swing.*;

public class TableEg {
    TableEg(){

        JFrame f = new JFrame();

        String[][] data = {{"11","Bibek"},
                            {"29","Sakila"}};
        String[] col = {"Id","Name"};
        JTable jt = new JTable(data,col);
        

        // f.add(jt);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new TableEg();
    }    
}
