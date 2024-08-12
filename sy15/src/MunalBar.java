
import javax.security.auth.kerberos.KerberosTicket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MunalBar extends JFrame {
    private JTextArea textArea;
    public MunalBar (){
        super("菜单应用");
        JMenu filemenu = new JMenu("文件(F)");
        filemenu.setMnemonic('F');
        JMenuItem A = new JMenuItem("关于（A）");
        A.setMnemonic('A');
        A.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MunalBar.this,"这是一个菜单的例子","关于",JOptionPane.PLAIN_MESSAGE);
            }
        });
        JMenuItem X = new JMenuItem("推出（x）");
        X.setMnemonic('X');
        X.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        filemenu.add(A);
        filemenu.add(X);
        JMenuBar bar = new JMenuBar();
        bar.add(filemenu);
        textArea = new JTextArea("文本区");
        this.add(textArea,BorderLayout.CENTER);
        this.add(bar,BorderLayout.NORTH);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MunalBar m = new MunalBar();
    }
}
