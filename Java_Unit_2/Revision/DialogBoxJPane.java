import javax.swing.*;

public class DialogBoxJPane {
    public static void main(String[] args){
        String number1 = JOptionPane.showInputDialog("Enter first number");
        String number2 = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int product = num1 * num2;

        JOptionPane.showMessageDialog(null,"Product is " + product,"Product",JOptionPane.PLAIN_MESSAGE);


    }
    
}
