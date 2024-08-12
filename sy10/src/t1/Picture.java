package t1;
import java.io.*;
public class Picture {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream ("d:\\黑色.jpg");
		FileOutputStream fo = new FileOutputStream ("d:\\白色.jpg");
		System.out.println("文件大小:"+fi.available());
		byte [] b = new byte[fi.available()];
		fi.read(b);
		fo.write(b);
		System.out.println("文件已经被拷贝");
		fi.close();
		fo.close();
	}

}
