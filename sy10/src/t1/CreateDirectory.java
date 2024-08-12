package t1;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        // 指定要创建的文件夹路径
        String directoryPath = "d:\\pandapic";

        // 创建File对象
        File directory = new File(directoryPath);

        // 判断文件夹是否已经存在
        if (!directory.exists()) {
            // 创建文件夹
            if (directory.mkdirs()) {
                System.out.println("文件夹创建成功: " + directoryPath);
            } else {
                System.out.println("文件夹创建失败: " + directoryPath);
            }
        } else {
            System.out.println("文件夹已经存在: " + directoryPath);
        }
    }
}