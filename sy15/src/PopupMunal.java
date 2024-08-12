import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
public class PopupMunal extends JFrame {
    private JTextArea textArea = new JTextArea("菜单设计",30,20);
    private JScrollPane scrollPane = new JScrollPane(textArea);
    private JPopupMenu popupMenu = new JPopupMenu();
    private JMenuItem [] jmunal = {new JMenuItem("red"),new JMenuItem("green"),new JMenuItem("blue")};
    public PopupMunal() {
        super("弹出菜单");
        popupMenu.add(jmunal[0]);
        popupMenu.add(jmunal[1]);
        popupMenu.add(jmunal[2]);

        ItemHandler itemHandler = new ItemHandler();
        jmunal[0].addActionListener(itemHandler);
        jmunal[1].addActionListener(itemHandler);
        jmunal[2].addActionListener(itemHandler);

        textArea.addMouseListener(new MouseAda());
        this.add(scrollPane,BorderLayout.CENTER);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private class ItemHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==jmunal[0]) {
                textArea.setForeground(Color.RED);
            }
            else if(e.getSource()==jmunal[1]) {
                textArea.setForeground(Color.GREEN);
            }
            else if(e.getSource()==jmunal[2]) {
                textArea.setForeground(Color.BLUE);
            }
        }
    }

    private class MouseAda extends MouseAdapter {
        public void mouseReleased (MouseEvent mouseEvent) {
            if(mouseEvent.isPopupTrigger()) {//判断鼠标事件是否是有弹出菜单引发
                popupMenu.show((Component) mouseEvent.getSource(), mouseEvent.getX(), mouseEvent.getY());
            }
        }
    }



    public static void main(String[] args) {
        PopupMunal popupMunal = new PopupMunal();
    }
}
