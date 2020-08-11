package mode;

public class ThreadOne implements Runnable {
	Accum a = Accum.getAccum();
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		for(int x=0;x<98;x++){
			a.updateCounter(1000);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		System.out.println("one"+a.getCount());
	}

}
