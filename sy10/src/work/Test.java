package work;

import java.util.Scanner;
import java.io.*;
public class Test
 {    public static void main(String[] args) throws IOException
         {  File f=new File("me.txt");
            f.createNewFile(); //创建新文件
            String str="abcdefghijklmnopqrstuvwxyz";//创建字符串对象
            FileWriter fw=new FileWriter(f);
            fw.write(str);
            fw.close();       
            int a=-1;
            Scanner reader=new Scanner(System.in);
            while(a<0||a>25)
              {    System.out.println("从键盘输入一个0~25的整数:");
	     a=reader.nextInt();    
               }
           RandomAccessFile inFile=new RandomAccessFile("me.txt","r");
           inFile.seek((long)a);//将文件指针移动到整数a的位置
           char c =(char)inFile.readByte();//在inFile中读一个字符赋给变量c
           inFile.close();
           System.out.println("me.txt文件中第"+a+"个字符是"+c);
        }
}