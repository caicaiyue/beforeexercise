package exercise;

public class CreateThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(){
			public void run(){
				//System.out.println("�̳�Thread");
				super.run();
			}
		};
		thread.start();
	}

}
