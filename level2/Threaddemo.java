package level2;

class MyThread extends Thread{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
		System.out.println("thread called " + Thread.currentThread().getName());
		}
	}
}
public class Threaddemo {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
		m1.setName("sakthi");
		m1.start();
		m1.join();
		MyThread m2=new MyThread();
		m2.setName("tamil");
		m2.start();
		m2.join();
		MyThread m3=new MyThread();
		m3.setName("Shalini");
		m3.start();
		m3.join();
		
	}

}
