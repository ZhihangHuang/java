package t1;
import java.io.*;
public class File {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("d://java//test.txt");
		char []c= new char [500];
		char[] c1 = {'H','E','L','L','O','\r','\n'};
		String str1 = "欢迎使用java\n";
		fw.write(c1);
		fw.write(str1);
		String str3 = "hello";
		fw.write(str3);
		fw.close();
		FileReader fr = new FileReader ("d://java//test.txt");
		int num = fr.read(c);
		String str2 = new String(c,0,num);
		System.out.println("输入的字符个数是"+ num +"其内容如下：");
		System.out.println(str2);
		fr.close();
		
	}

}
