package headfirstmode;

import java.lang.reflect.InvocationTargetException;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
import java.lang.reflect.Method;

public class VarArgsTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Base base = new Other();
		Class b = base.getClass();
		Method mb1 = b.getMethod("print", String.class);
		mb1.invoke(base, (Object)new String());
		Method mb2 = b.getMethod("print", String[].class);
		mb2.invoke(base, new Object[]{new String[]{}});
		Base sub = new Sub();
		Class cs = sub.getClass();
		Method ms = cs.getMethod("print",String[].class);
		ms.invoke(sub,new Object[0]);
	}
}

class Base {
	public void print(String... args) {
		System.out.println("Base......test");
	}

}

class Other extends Base {
	public void print(String args) {
		System.out.println("Other......test");
	}
}

class Sub extends Base{
	public void print(){
		System.out.println("sub....test");
	}
}


