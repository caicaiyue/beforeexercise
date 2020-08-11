package exercise;

public class TestDog extends TestClass {
	
	public void doHappyThing(){
		System.out.println("TestDog is happy");
		super.doHappyThing();
	}
	
	public void call(){
		doHappyThing();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDog tc = new TestDog(){
			public void doHappyThing(){
				System.out.println("new TestDog is happy");
				super.doHappyThing();
			}
		};
		tc.call();
	}

}
