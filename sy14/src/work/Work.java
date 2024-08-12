package work;
import javax.swing.JOptionPane;
public class Work {
    static String num1;
    static String num2;
    static double n1,n2,result;

    public static void main(String[] args) {
        num1 = JOptionPane.showInputDialog("Enter First Number");
        num2 = JOptionPane.showInputDialog("Enter Second Number");
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);
        result = n1/n2;
        JOptionPane.showMessageDialog(null, "The result is: " + result, "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }


}
