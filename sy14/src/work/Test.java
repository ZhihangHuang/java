package work;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test extends JFrame implements ActionListener{
    JLabel [] jb = {new JLabel("输入名字:"),new JLabel("输入年龄:"),new JLabel("输入性别:")};
    JTextField inputName;
    JTextField inputAge;
    JTextField inputGender;
    JTextArea inputMessage;
    JPanel inputArea = new JPanel();
    public Test(String title){
        super(title);
        GridLayout gri = new GridLayout(3,1);
        inputArea.setLayout(gri);
        inputName = new JTextField(20);
        inputAge = new JTextField(20);
        inputGender = new JTextField(20);
        inputMessage = new JTextArea();
        //第一行
        JPanel row1 = new JPanel();
        row1.add(jb[0]);
        row1.add(inputName);
        //第二行
        JPanel row2 = new JPanel();
        row2.add(jb[1]);
        row2.add(inputAge);

        //第三行
        JPanel row3 = new JPanel();
        row3.add(jb[2]);
        row3.add(inputGender);

        inputArea.add(row1);
        inputArea.add(row2);
        inputArea.add(row3);


        this.add(inputArea, BorderLayout.NORTH);
        this.add(inputMessage, BorderLayout.SOUTH);

        inputName.addActionListener(this);
        inputAge.addActionListener(this);
        inputGender.addActionListener(this);

        this.setSize(500,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = inputName.getText();
        String age = inputAge.getText();
        String gender = inputGender.getText();

        int  n = JOptionPane.showConfirmDialog(this,"请确认输入是否","确认对话框",JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this,"正确");
                inputMessage.append("name:"+name+"\nage:"+age+"\ngender:"+gender+"\n");
            } else if (n == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this,"错误");
                inputMessage.setText(null);
            }

    }

    public static void main(String[] args) {
        Test frm = new Test("确认对话框");
    }
}
