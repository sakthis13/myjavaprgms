package level2;
class MyError implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread called "
                    + Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                
            }
        }
    }
}

public class Threaddem {
		

	public static void main(String[] args) throws Exception {

    	MyError my1 = new MyError();

        Thread m1 = new Thread(my1);

        m1.setName("tamil");

        m1.start();

        m1.join();


        MyError my2 = new MyError();

        Thread m2 = new Thread(my2);

        m2.setName("sakthi");

        m2.start();

        m2.join();
    }

}
