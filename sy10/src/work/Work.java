package work;
import java.util.*;

class Number {
	private int n1;
	private int n2;
	Number(int n3, int n4) {
		n1 = n3;
		n2 = n4;
	}
	int addition () {
		System.out.println("addition is；"+ (n1 +n2));
		return n1 + n2;
	}
	
	int substration() {
		System.out.println("substraction is；"+ (n1 -n2));
		return n1 - n2;
	}
	int mutltiplication () {
		System.out.println("mutltiplication is "+ n1*n2);
		return n1*n2;
	}
	double division (int n1,int n2) throws Exception{
		System.out.println("division is "+ n1/n2);
		return n1/n2;
	}
}

public class Work {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int i,j;
		Scanner n = new Scanner(System.in);
		System.out.print("输入你的数字number1 ：");
		i = n.nextInt();
		System.out.print("输入你的数字number2 ：");
		j =n.nextInt();
		Number num = new Number(i,j);
		num.addition();
		num.substration();
		num.mutltiplication();
		try {
			num.division(i,j);
		}
		catch(Exception e){
			System.out.println("异常处理"+e.getMessage());
		}
		System.out.println("结束");
	}

}
