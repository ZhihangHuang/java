package work;
import javax.swing.*;
public class Wenben extends JFrame{
	JTextField jtf = new JTextField ("该文本不可编辑",30);//因为这个是不可编辑的不动的所以不用static
	static JPasswordField jpf = new JPasswordField("woaini",30);//密码区
	public Wenben(String str) {
		super(str);
		jtf.setBounds(20,40,140,20);
		jtf.setEditable(false);
		this.add(jtf);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wenben frm = new Wenben("文本编辑");
		JTextArea jta = new JTextArea ("我叫黄志航，我在学习java",10,30);
		JScrollPane jsp = new JScrollPane(jta);
		
		frm.setLocation(200, 150);
		frm.setSize(1000,1000);
		frm.setLayout(null);
		
		jpf.setEchoChar('*');
		jsp.setBounds(20, 70, 160, 100);
		jpf.setBounds(20,10,140,20);
		frm.add(jpf);
		frm.add(jsp);
		
		char[] password  = jpf.getPassword();
		String str = new String(password);
		System.out.println("今天的口令：" +password+ "转换之后的文本是： "+str);
		frm.setVisible(true);
		frm.setResizable(false);//文本框的大小不可改变
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
