package t1;
import java.util.*;
import java.io.*;
public class Test3
{ public static void main(String[] args) throws IOException {
//声明异常
  {
	String str;
    char ch;
	char temp;
    int n=0;
    Scanner buf=new Scanner(System.in);
    System.out.print("输入字符串:");
    str = buf.nextLine();//从键盘读入一个有效字符串放入str
    System.out.print("输入待查找的字符:");
    ch = (char)System.in.read();//从键盘读入一个字符放入ch中
    for(int i=0;i<str.length();i++)
    {
      temp=str.charAt(i);
      if(temp==ch)  n++;
    }
    System.out.print("字符串"+str+"中字符"+ch+"的个数为："+n);
  }
}
}