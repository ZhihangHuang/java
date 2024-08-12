package sy12;

public class Test {

	public static void main(String[] args) {
		MyThread me = new MyThread("我");
		MyThread you = new MyThread("你");
		Thread t1 = new Thread(me);
		Thread t2 = new Thread(you);
		t1.start();
		t2.start();
		System.out.println("mian运行完成");
	}

}
