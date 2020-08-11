package exercise;

import java.io.*;

public class DungeonGameTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DungeonGame d = new DungeonGame();
		System.out.println(d.getX()+d.getY()+d.getZ());
		try {
			FileOutputStream fos = new FileOutputStream(new File("dg.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			FileInputStream fls = new FileInputStream(new File("dg.ser"));
			ObjectInputStream ois = new ObjectInputStream(fls);
			d=(DungeonGame)ois.readObject();
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(d.getX()+d.getY()+d.getZ());
	}

}

class DungeonGame implements Serializable{
	public int x =3;
	transient long y =4;
	private short z = 5;
	
	int getX(){
		return x;
	}
	
	long getY(){
		return y;
	}
	
	short getZ(){
		return z;
	}
}
