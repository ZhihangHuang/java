package work;
import java.awt.Color;
import javax.swing.*;

public class Fuxuan {
	static JFrame frm = new JFrame("复选康和单选按钮");
	static JCheckBox jchx1 =new JCheckBox("斜体",true);
	static JCheckBox jchx2 =new JCheckBox("粗体");
	static JCheckBox jchx3 =new JCheckBox("下划线");
	
	static JRadioButton jrb1 = new JRadioButton("红色",true);
	static JRadioButton jrb2 = new JRadioButton("黄色");
	static JRadioButton jrb3 = new JRadioButton("蓝色");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonGroup bgp = new ButtonGroup();
		frm.getContentPane().setBackground(Color.green);
		frm.setSize(300, 1000);
		frm.setLocation(200, 150);
		frm.setLayout(null);
		
		jchx1.setBounds(20,20, 150, 20);
		jchx2.setBounds(20,40,150,20);
		jchx3.setBounds(20,60,150,20);
		
		jrb1.setBounds(20, 80, 150, 20);
		jrb2.setBounds(20, 100, 150, 20);
		jrb3.setBounds(20, 120, 150, 20);
		
		bgp.add(jrb1);
		bgp.add(jrb2);
		bgp.add(jrb3);
		
		frm.add(jchx1);
		frm.add(jchx2);
		frm.add(jchx3);
		
		frm.add(jrb1);
		frm.add(jrb2);
		frm.add(jrb3);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

}
