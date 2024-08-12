package sy12;

public class MyThread implements Runnable{
	private String who;
	public MyThread (String str) {
		who = str;
	}
	public void run() {
		for (int i=0; i<5;i++) {
			try {
				Thread.sleep((int)(1000*Math.random()));
			}catch(Exception e){
				System.out.println(e.toString());
			}
			System.out.println(who+"在运行");
		}
	}
}
