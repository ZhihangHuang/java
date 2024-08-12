package sy13;
import javax.swing.*;
import java.awt.*;

public class Test1 {

	public static void main(String[] args) {
		JFrame jfrm = new JFrame();
		jfrm.setTitle("Test1");
		jfrm.getContentPane().setBackground(Color.pink);
		jfrm.setLayout(null);
		jfrm.setSize(300, 200);
		Image im = (new ImageIcon("images.jpg")).getImage();
		jfrm.setIconImage(im);
		
		JLabel jlab = new JLabel ("test1,2,3,4",JLabel.LEFT);
		jlab.setVerticalAlignment(JLabel.CENTER);
		jlab.setOpaque(true);
		jlab.setBackground(new Color(200,125,167));
		jlab.setForeground(Color.black );
		jlab.setSize(160, 60);
		jlab.setLocation(80,60);
		Font fnt = new Font("黑体",Font.BOLD+Font.ITALIC,20);
		jlab.setFont(fnt);
		
		jfrm.add(jlab);
		jfrm.setVisible(true);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
