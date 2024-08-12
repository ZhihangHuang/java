package sy12;
class ThreadA extends Thread//定义类ThreadA继承Thread类
{   int count=1;
    int num;
    public ThreadA(int newNum)
    {   num=newNum;
        System.out.println("创建线程"+num);
     }
    public void run()
    {  while(true)
        {  System.out.println("线程"+num+":计数"+count);
            count++;
            if(count==3)
                 break;
          }
     }
}
class Test1
{  public static void main(String[] args)
    {    ThreadA a1 = new ThreadA (1);//创建ThreadA的对象a1，传入参数1
         ThreadA a2 = new ThreadA (2);//创建ThreadA的对象a2，传入参数2
         ThreadA a3 = new ThreadA (3);//创建ThreadA的对象a3，传入参数3
         a1.start();//调用a1的start()方法，启动线程a1
         a2.start();//调用a2的start()方法，启动线程a2
         a3.start();//调用a3的start()方法，启动线程a3
          System.out.println("主方法main()运行结束！");
     }
}