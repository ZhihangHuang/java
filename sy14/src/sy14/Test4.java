package sy14;
import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test4 extends JFrame implements ActionListener{
    //创建各种组件
    private JLabel [] jLabels = {new JLabel("用户名"),(new JLabel("密码"))};
    private JTextField jname = new JTextField();
    private JPasswordField jp = new JPasswordField();
    private JTextArea jta = new JTextArea("我现在不可编辑",10,30);
    private  JScrollPane jsp = new JScrollPane(jta);
    public Test4(){
        this.setLayout(null);
        this.jLabels[0].setBounds(20,10,50,25);
        this.jname.setBounds(70,10,170,25);
        this.jLabels[1].setBounds(20,30,50,25);
        this.jp.setBounds(70,35,170,25);
        this.jsp.setBounds(20,70,220,100);
        this.jta.setEnabled(false);
        this.jta.setDisabledTextColor(Color.red);
        this.add(this.jLabels[0]);
        this.add(this.jname);
        this.add(this.jLabels[1]);
        this.add(this.jp);
        this.add(this.jsp);

        this.jname.addActionListener(this);
        this.jp.addActionListener(this);

        this.setTitle("文本应用");
        this.setResizable(false);
        this.setBounds(100,100,280,220);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jname.getText().equals("abc")&& String.valueOf(jp.getPassword()).equals("123")){
            this.jta.setEnabled(true);
            this.jta.setText("可以编辑");
            jta.setLineWrap(true);//文本自动折行
        }
    }
    public static void main(String[] args) {
        Test4 frm = new Test4();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
