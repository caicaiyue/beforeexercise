package mode;

import headfirstmode.TestProtect;

public class TestHeadFirstModeTestProtect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestProtect(){
			 void callWhoAmI(){
				super.whoAmI();
			}
		}.callWhoAmI();
		
		TestProtect tp = new TestProtect(){
			public void call(){
				super.whoAmI();
			}
		};
		
		
		
		
		
		
	
		
	}

}
