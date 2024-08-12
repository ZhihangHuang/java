package sy13;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
    public static void main(String[] args) {
        // 创建一个新的 JFrame 实例
        JFrame frame = new JFrame("Hello, World!");

        // 设置关闭操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个新的 JLabel 实例
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);

        // 添加 JLabel 到 JFrame
        frame.add(label);

        // 设置 JFrame 大小
        frame.setSize(400, 200);

        // 显示 JFrame
        frame.setVisible(true);
    }
}