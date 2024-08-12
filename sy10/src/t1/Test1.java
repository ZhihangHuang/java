package t1;
import java.io.*;//导入io包
class Test1
{   public static void main(String[] args) throws IOException
   {  int i;
      FileInputStream fin;
      FileOutputStream fout;
      fin = new FileInputStream("myfile.txt");//为fin实例化，指向文件myfile.txt
      fout = new FileOutputStream("yourfile.txt");//为fout实例化，指向文件yourfile.txt
     do
     {    i=fin.read();
          if(i!=-1)
            fout.write(i);
      }  while(i!=-1);
      fin.close();//关闭输入流
     fout.close();
     System.out.println("myfile.txt内容已经被复制到yourfile.txt文件中");
   }
}