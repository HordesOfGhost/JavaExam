import javax.swing.*;

public class TableEx{
    TableEx(){
        JFrame f = new JFrame();
        String data[][] = {{"101","Bibek","29"},
                            {"102","Sakila","11"}};
        String column[] = {"ID","Name","RollNo"};
        JTable jt = new JTable(data,column);
        
        jt.setBounds(30,50,200,300);
        JScrollPane sp = new JScrollPane(jt);

        f.add(sp);
        f.setSize(640,480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new TableEx();
    }
}