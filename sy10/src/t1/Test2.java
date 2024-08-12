package t1;
import java.io.*;
class Test2
{
   public static void main(String[] args) throws IOException
   {
   char[]c = new char[500];//定义长度为500的字符数组c
   FileReader fr = new FileReader("d:\\java\\sy10\\myfile.txt");//创建类型为FileReader的对象fr，指向文件myfile.txt
    int num=fr.read(c);
    String str=new String(c,0,num);
    System.out.println("读取的字符个数为："+num+"，其内容如下：");
    System.out.println(str);
    FileWriter fw=new FileWriter("test.txt",true);
    fw.write(str);//将str写入到fw中去
    fr.close ();
    fw.close();
    System.out.println("所读内容已写入到文件test.txt中");
   }
}