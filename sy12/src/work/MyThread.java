package work;

class MyThread implements Runnable {
	private int ticket = 10;

	public void run() {
		while (true) {
			if (ticket >0) {
				System.out.println(Thread.currentThread().getName()+"售票机第"+ ticket--+"号");
			}else{
				System.exit(0);
			}
		}
	}
}