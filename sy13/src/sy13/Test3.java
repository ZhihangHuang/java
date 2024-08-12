package sy13;
import javax.swing.*;
import java.awt.*;
public class Test3 extends JFrame  {

	public static void main(String[] args) {
		Test3 jfrm = new Test3();
		jfrm.setTitle("Test1");
		jfrm.getContentPane().setBackground(Color.pink);
		jfrm.setSize(250, 180);
		Image im = (new ImageIcon("images.jpg")).getImage();
		jfrm.setIconImage(im);
		jfrm.setLayout(null);

		JPanel jp = new JPanel();
		jp.setSize(200, 150);
		jp.setLocation(0,0);
		Font fon = new Font("黑体",Font.BOLD+Font.ITALIC,20);
		jp.setFont(fon);
		jp.setLayout(null);
	
		
		JButton btn = new JButton("灯笼");
		btn.setBounds(50, 45,100,40);
		btn.setToolTipText("我是按钮");//$$$问题不能显示
		
		jfrm.add(btn);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}

}
