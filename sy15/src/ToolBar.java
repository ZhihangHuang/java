import javax.swing.*;
import javax.swing.colorchooser.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class ToolBar extends JFrame implements ActionListener {
    private JTextArea text = new JTextArea("编辑", 100, 100);
    private JScrollPane scroll = new JScrollPane(text);
    private JToolBar toolBar = new JToolBar("浮动工具栏");
    private JPanel toolBarPanel = new JPanel();
    private JButton[] jb = {new JButton(), new JButton(), new JButton(), new JButton()};
    private ImageIcon image1, image2, image3, image4;
    private JFileChooser jfc = new JFileChooser(".");

    DefaultColorSelectionModel model = new DefaultColorSelectionModel();//设置调色板对象
    JColorChooser colorChooser = new JColorChooser(model);
    Color newcolor;

    public ToolBar(String str) {
        super(str);
        image1 = new ImageIcon("open.jpg");
        image2 = new ImageIcon("save.jpg");
        image3 = new ImageIcon("color.jpg");
        image4 = new ImageIcon("help.jpg");
        jb[0].setIcon(image1);
        jb[1].setIcon(image2);
        jb[2].setIcon(image3);
        jb[3].setIcon(image4);

        jb[0].setToolTipText("open");
        jb[1].setToolTipText("save");
        jb[2].setToolTipText("color");
        jb[3].setToolTipText("help");

        jb[0].addActionListener(this);
        jb[1].addActionListener(this);
        jb[2].addActionListener(this);
        jb[3].addActionListener(this);

        toolBar.add(jb[0]);
        toolBar.add(jb[1]);
        toolBar.add(jb[2]);
        toolBar.add(jb[3]);
        toolBarPanel.setLayout(new FlowLayout());
        toolBarPanel.add(toolBar);

        JPopupMenu jpo = new JPopupMenu();
        JMenuItem mb = new JMenuItem("粗斜体");
        jpo.add(mb);
        SetFont st = new SetFont();
        mb.addActionListener(st);


        text.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if (me.isPopupTrigger()) {
                    jpo.show((Component) me.getSource(), me.getX(), me.getY());
                }
            }
        });



        this.add(toolBarPanel, BorderLayout.NORTH);
        this.add(scroll, BorderLayout.CENTER);
        this.setSize(1000, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ToolBar T = new ToolBar("工具栏");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == jb[0]) {
            int status = jfc.showOpenDialog(this);
            if (status != JFileChooser.APPROVE_OPTION) {
                text.setText("no file");
            } else {
                try {
                    File file = jfc.getSelectedFile();
                    Scanner sc = new Scanner(file);
                    String info = "";
                    while (sc.hasNext()) {//判断石佛有数据
                        String line = sc.nextLine();//读取每一行
                        info = info + line + "\r\n";
                        text.setText(info);
                        sc.close();
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.toString());
                }
            }
        } else if (b == jb[1]) {
            int status = jfc.showSaveDialog(this);
            if (status == JFileChooser.APPROVE_OPTION) {
                try {
                    File file1 = jfc.getSelectedFile();
                    FileWriter fw = new FileWriter(file1);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(text.getText());
                    bw.close();
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        } else if (b == jb[2]) {

            Color newColor = JColorChooser.showDialog(this, "选择字体颜色", text.getForeground());
            if (newColor != null) {
                text.setForeground(newColor);
            }
        }else if (b == jb[3]) {
            JOptionPane.showMessageDialog(this, "打开,保存,调色", "说明", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private class SetFont implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ce) {
            if (ce.getActionCommand().equals("粗斜体")) {
                text.setFont(new Font("粗斜体", Font.BOLD+Font.ITALIC, 30));
            }


        }

    }
}