import javax.swing.*;
import java.awt.event.*;

class PopUpMenuEx{
    PopUpMenuEx(){
        JFrame f = new JFrame("POP Menu");
        JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popupmenu.show(f,e.getX(),e.getY());
            }
        });
        f.add(popupmenu);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new PopUpMenuEx();
    }
}