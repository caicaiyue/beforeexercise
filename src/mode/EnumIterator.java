package mode;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumIterator implements Iterator {
	Enumeration enum1;
	
	EnumIterator(Enumeration enum1){
		this.enum1 = enum1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enum1.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return  enum1.nextElement();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
