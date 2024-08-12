package sy14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test3 extends JFrame implements ItemListener {
    static Test3 fra = new Test3();
    static JCheckBox jck1 = new JCheckBox("粗体");
    static JCheckBox jck2 = new JCheckBox("斜体");
    static JRadioButton jrb1 =new JRadioButton("红色");
    static JRadioButton jrb2 = new JRadioButton("绿色");
    static JTextArea ta = new JTextArea("选项事件",8,30);
    public static void main(String[] args) {
        //创建frame
        fra.setTitle("事件处理");
        fra.setLocation(200,150);
        fra.setSize(300, 300);
        fra.setLayout(new FlowLayout(FlowLayout.LEFT));

        //创建单选按钮的族
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1); bg.add(jrb2);
        //确定Itemlistener
        jck1.addItemListener(fra); jck2.addItemListener(fra);
        jrb1.addItemListener(fra); jrb2.addItemListener(fra);
        fra.add(jck1); fra.add(jck2);
        fra.add(jrb1); fra.add(jrb2);
        fra.add(ta);

        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
        //单选点击按钮执行
        if(jrb1.isSelected()){
            ta.setForeground(Color.RED);
        }
        if (jrb2.isSelected()){
            ta.setForeground(Color.GREEN);
        }
        //复选
        Font font1 = ta.getFont();
        int style1 = font1.getStyle();
        if((e.getSource() == jck1)||(e.getSource() == jck2)){
            if(e.getSource() == jck1){
                style1 = style1^1;
            }
            if(e.getSource() == jck2){
                style1 = style1^2;
            }
            ta.setFont(new Font(font1.getFontName(), style1, ta.getFont().getSize()));
        }

    }
}
