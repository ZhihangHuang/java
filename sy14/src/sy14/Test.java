package sy14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener{//确定test类的对象
    static Test frm = new Test();
    static  JButton jb = new JButton("改变字体颜色");
    static JTextArea jta = new JTextArea("欢迎学习委托事件模型",5,20);
    public static void main(String[] args) {
        jb.addActionListener(frm);
        frm.setTitle("操作事件");
        frm.setSize(260,170);
        frm.setLayout(new FlowLayout());
        frm.add(jta);
        frm.add(jb);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jta.setForeground(Color.red);
    }
}
