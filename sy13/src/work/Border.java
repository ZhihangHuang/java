package work;
import javax.swing.*;
import java.awt.*;
public class Border {
	static JFrame  frm = new JFrame ("BorderLayout布局管理器");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayout bdy = new BorderLayout(5,10);//默认的就是boderlayout只不过没有间隔
		frm.setLayout(bdy);
		
		frm.setSize(330,200);
		frm.add(new JButton("North"),BorderLayout.NORTH);
		frm.add(new JButton("South"),BorderLayout.SOUTH);
		frm.add(new JButton("East"),BorderLayout.EAST);
		frm.add(new JButton("West"),BorderLayout.WEST);
		frm.add(new JButton("Middle"),BorderLayout.CENTER);
		
		frm.setVisible(true);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
