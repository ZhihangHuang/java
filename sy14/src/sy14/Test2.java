package sy14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test2 {//确定test类的对象
    static Test frm = new Test();
    static  JButton jb = new JButton("改变字体颜色");
    static JTextArea jta = new JTextArea("欢迎学习委托事件模型",5,20);
    public static void main(String[] args) {
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.red);
            }
        });//匿名内部类结束
        frm.setLayout(new FlowLayout());
        frm.setSize(260,170);
        frm.add(jta);
        frm.add(jb);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        jta.setForeground(Color.RED);
    }
}