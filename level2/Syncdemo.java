package level2;

public class Syncdemo {
	int cnt = 0;
	public synchronized void countmethod()
	{
		cnt++;
	}
	public int showcount()
	{
		return cnt;
	}

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		Syncdemo sd=new Syncdemo();
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				for (int i = 1;i<=1000;i++)
				{
					sd.countmethod();				}
			}
			
		});
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				for (int i = 1;i<=1000;i++)
				{
					sd.countmethod();				}
			}
			
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(sd.showcount());
	}

}
