package sy12;

class SaleTickets implements Runnable
{   private int tickets=1;
    public void run()
    {  while(true)
        {  if(tickets<=100)
              System.out.println(Thread.currentThread().getName()+"销售第"+tickets+++"票");
            else
                 break;
          }
     }
}
class Test2
{  public static void main(String[] args)
    {    SaleTickets t=new SaleTickets();
    	 Thread t1 = new Thread(t,"窗口1");
    	 
    	 Thread t2 = new Thread(t,"窗口2");
    	 Thread t3 = new Thread(t,"窗口3");
    	 Thread t4 = new Thread(t,"窗口4");
    	 t1.start();
    	 t2.start();
    	 t3.start();
    	 t4.start();
         //分别创建四个线程，都传入参数t，再启动它们
     }
}