package work;
import javax.swing.*;
import java.awt.*;
public class Flow  {
	static JFrame jfr = new JFrame("FlowLayout: ");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayout fly = new FlowLayout(FlowLayout.CENTER, 5,10);
		JButton jb = new JButton ("按钮");
		JLabel jla = new JLabel ("我是一个标签");
		
		jfr.setLayout (fly);
		jfr.setSize(260,150);
		
		jfr.add(jb);
		jfr.add(jla);
		jfr.add(new JTextField("流式布局策略Flow_Layout"));
		
		
		jfr.setVisible(true);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
