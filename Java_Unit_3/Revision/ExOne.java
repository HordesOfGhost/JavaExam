import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ExOne implements ActionListener{
    JTextField num1,num2,output;
    JButton addBt,diffBt;
    ExOne(){
        JFrame f = new JFrame("Addition");

        JLabel lb1 = new JLabel("Number 1");
        num1 = new JTextField(5);

        JLabel lb2 = new JLabel("Number 2");
        num2 = new JTextField(5);

        JLabel outputLabel = new JLabel("Output");
        output = new JTextField(5);

        addBt = new JButton("Add");
        addBt.addActionListener(this);

        diffBt = new JButton("Subtract");
        diffBt.addActionListener(this);

        f.add(lb1);
        f.add(num1);
        f.add(lb2);
        f.add(num2);
        f.add(outputLabel);
        f.add(output);
        f.add(addBt);
        f.add(diffBt);

        f.setLayout(new GridLayout(4,2));
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addBt){
            String n1 = num1.getText();
            String n2 = num2.getText();

            int x1 = Integer.parseInt(n1);
            int x2 = Integer.parseInt(n2);

            int output_x1_x2 = x1 + x2;

            output.setText(""+output_x1_x2);
        }else if (e.getSource() == diffBt){
            String n1 = num1.getText();
            String n2 = num2.getText();

            int x1 = Integer.parseInt(n1);
            int x2 = Integer.parseInt(n2);

            int output_x1_x2 = x1 - x2;

            output.setText(""+output_x1_x2);
        }
    }
    public static void main(String[] args){
        new ExOne();
    }
}