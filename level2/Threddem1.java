package level2;
class MError implements Runnable {

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

public class Threddem1 {
		

	public static void main(String[] args) throws Exception {

    	MError my1 = new MError();

        Thread m1 = new Thread(my1);
        MError my2 = new MError();

        Thread m2 = new Thread(my2);

        m1.setName("tamil");
        m2.setName("sakthi");

        m1.start();
        System.out.println(m1.getName()+"alive:  "+m1.isAlive());
        System.out.println(m2.getName()+"alive:   " + m2.isAlive());

        m1.join();


      

   

        m2.start();
        System.out.println(m1.getName()+"alive:  "+m1.isAlive());
        System.out.println(m2.getName()+"alive:   " + m2.isAlive());

        m2.join();
    }

}
