package sy13;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
public class Test {
	public static void main(String[] agrs) {
		JFrame jfrm = new JFrame();
		jfrm.setTitle("test");
		jfrm.setSize(340,340);
		jfrm.setLocation(250,140);
		
		JPanel pan = new JPanel();
		pan.setSize(200,100);
		pan.setLocation(10, 110);
		
		JButton jbut = new JButton("Click me");
		jbut.setSize(100,50 );
		jbut.setLocation(20, 30);
		Font fnt = new Font ("黑体",Font.BOLD+Font.ITALIC,10);
		jbut.setFont(fnt);
		
		jfrm.setLayout(null);
		pan.setLayout(null);
		
		pan.add(jbut);
		pan.setBorder(new TitledBorder("面板区"));
		jfrm.add(pan);
		
		Image im = (new ImageIcon("images.jpg")).getImage();
		jfrm.setIconImage(im);
		
		jfrm.setVisible(true);
		jfrm.getContentPane().setBackground(Color.red);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}