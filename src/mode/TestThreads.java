package mode;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		Thread one = new Thread(t1);
		Thread two = new Thread(t2);
		one.start();
		two.start();
	}

}
