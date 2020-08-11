package headfirstmode;

public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton INSTANCE;
	
	private DoubleCheckSingleton(){
		
	}
	
	public  static DoubleCheckSingleton getInstance(){
		if(INSTANCE==null){
			synchronized(DoubleCheckSingleton.class){
				if(INSTANCE==null){
					INSTANCE = new DoubleCheckSingleton();
				}
			}
		}
		
		return INSTANCE;
	}
	
	public String toString(){
		//return INSTANCE.getClass().getName();
		return DoubleCheckSingleton.class.getName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getInstance());
		System.out.println(DoubleCheckSingleton.getInstance());
	}

}
