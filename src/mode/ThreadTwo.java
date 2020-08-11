package mode;

public class ThreadTwo implements Runnable {
	Accum a = Accum.getAccum();
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		for(int x=0;x<99;x++){
			a.updateCounter(1);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
		}
		
		
		System.out.println("two"+a.getCount());
	}

}
