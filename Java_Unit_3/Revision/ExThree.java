import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ExThree extends MouseAdapter{
    JTextField num1,num2,Output;
    JLabel outputlabel;
    ExThree(){
        JFrame f = new JFrame("Addition");

        JLabel lb1 = new JLabel("Number 1");
        num1 = new JTextField(5);

        JLabel lb2 = new JLabel("Number 2");
        num2 = new JTextField(5);

        outputlabel = new JLabel("Output");
        Output = new JTextField(5);

        JButton bt = new JButton("Submit");
        bt.addMouseListener(this);

        f.add(lb1);
        f.add(num1);
        f.add(lb2);
        f.add(num2);
        f.add(outputlabel);
        f.add(Output);
        f.add(bt);

        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseClicked(ActionEvent e){
        String n1 = num1.getText();
        String n2 = num2.getText();

        int x1 = Integer.parseInt(n1);
        int x2 = Integer.parseInt(n2);

        int sum_x1_x2 = x1 + x2;

        Output.setText("Sum : "+sum_x1_x2);
    }
    public void mouseReleased(ActionEvent e){
        String n1 = num1.getText();
        String n2 = num2.getText();

        int x1 = Integer.parseInt(n1);
        int x2 = Integer.parseInt(n2);

        int diff_x1_x2 = x1 - x2;

        Output.setText("Differences : "+diff_x1_x2);
    }
    public static void main(String[] args){
        new ExThree();
    }
}