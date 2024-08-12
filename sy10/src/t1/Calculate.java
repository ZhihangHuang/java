package t1;
import java.util.*;

public class Calculate {
    public static void main(String[] args) {
        double dian;
        double panda;
        Scanner syu = new Scanner(System.in);
        String input;

        do {
            System.out.println("输入店里价格（输入'exist'退出）：");
            input = syu.next();

            // 检查输入是否是'exist'
            if (input.equals("exist")) {
                System.out.println("程序结束。");
                break;
            }

            try {
                // 尝试将输入转换为双精度浮点数
                dian = Double.parseDouble(input);
                if(dian>=17) panda = dian *1.2;
                else panda = dian * 1.25;
                System.out.println("计算后的价格: " + panda);
            } catch (NumberFormatException e) {
                System.out.println("无效输入，请输入一个数字或'exist'退出。");
            }
        } while (true);

        syu.close();
    }
}