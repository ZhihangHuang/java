package work;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Assignment extends Thread{
    static JPanel  pan= new JPanel();
    static JPanel ButtonPanel = new JPanel();
    static JButton add,sub,mul,div;

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        JFrame fra = new JFrame("简易计算器");
        fra.setSize(600,100);
        fra.setLocation(300,200);
        FlowLayout flt = new FlowLayout (FlowLayout.CENTER, 10, 10);
        GridLayout grid = new GridLayout(1, 4);
        pan.setBackground(Color.YELLOW);


        JTextField  Textnum1 = new  JTextField("0.",5);
        JLabel num1 = new JLabel("Number 1",JLabel.CENTER);
        JTextField  Textnum2 = new  JTextField("0.",5);
        JLabel num2 = new JLabel("Number 2",JLabel.CENTER);
        JTextField  Textresult = new  JTextField("0.",10);
        JLabel result= new JLabel("result",JLabel.CENTER);
        pan.add(num1);
        pan.add(Textnum1);
        pan.add(num2);
        pan.add(result);
        pan.add(Textnum2);
        pan.add(result);
        pan.add(Textresult);
        pan.setLayout(flt);
        fra.add(pan,BorderLayout.NORTH);

        add =new JButton("Add");
        sub =new JButton("Substract");
        mul = new JButton("Multiply");
        div =new JButton("Divide");

        ButtonPanel.add(add);
        ButtonPanel.add(sub);
        ButtonPanel.add(mul);
        ButtonPanel.add(div);
        ButtonPanel.setLayout(grid);
        fra.add(ButtonPanel,BorderLayout.SOUTH);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(Textnum1.getText());
                double n2 = Double.parseDouble(Textnum2.getText());
                double res = n1 + n2;

                Textresult.setText(String.valueOf(res));
            }
        });

        sub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(Textnum1.getText());
                double n2 = Double.parseDouble(Textnum2.getText());
                double res = n1 - n2;
                Textresult.setText(String.valueOf(res));
            }
        });
        mul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(Textnum1.getText());
                double n2 = Double.parseDouble(Textnum2.getText());
                double res = n1 * n2;
                Textresult.setText(String.valueOf(res));
            }
        });
        div.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(Textnum1.getText());
                double n2 = Double.parseDouble(Textnum2.getText());
                try{
                    if(n2 == 0){
                        JOptionPane.showMessageDialog(null,"被除数为0");
                    }else{
                        double res = n1 / n2;
                        Textresult.setText(String.valueOf(res));
                    }
                }catch (Exception E){
                    System.out.println(E.toString());
                }
            }
        });






        fra.setVisible(true);
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
