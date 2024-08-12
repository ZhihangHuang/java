package work;
class CashWithdrow{
	private static int Balance = 2000;
	public static synchronized void Withdrow (int k) {
		int temp =Balance;
		temp = temp -k;
		try {
			Thread.sleep((int)(1000*Math.random()));
		}
		catch(InterruptedException e){
			System.out.println(e.toString());
		}
		Balance = temp;
		System.out.println("余额是"+Balance);
	}
}
class CashBank extends Thread {
	public void run (){
		for (int i =0; i<4; i++) {
			CashWithdrow.Withdrow(100);
		}
	}
}

public abstract class Test1 {

	public static void main(String[] args) throws Exception {
		CashBank c1 = new CashBank(); 
		CashBank c2 = new CashBank(); 
		CashBank c3 = new CashBank(); 
		c1.start();
		c2.start();
		c3.start();
	}

}
