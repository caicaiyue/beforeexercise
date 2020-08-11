package headfirstmode;

public class UseTestProtect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProtect tp = new TestProtect(){
			 protected void whoAmI(){
				super.whoAmI();
				System.out.println("ÎÒÊÇUseTestProtectµÄwhoAmI");
			}
			
		};
		tp.whoAmI();
	}

}
