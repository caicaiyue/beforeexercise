package exercise;

public class TestCat implements TestInterface {

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("TestCat is sing");
	}
	
	public void call(){
		sing();
	}
	
	public static void main(String[] args) {
		TestCat ct = new TestCat(){
			public void sing(){
				System.out.println("11111");
				super.sing();
			}
		};
		
		ct.call();
		
		 /*Thread thread = new Thread(new MyRunnable()) {
             @Override
             public void run() {
                 System.out.println("¼Ì³ÐThread");
                 super.run();
             }
         };
         thread.start();*/
	}

}
