package headfirstmode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public class Proxyww extends Proxy implements Subject {
	public static Method m1;
	static{
	try {
		m1 = Class.forName("java.lang.Object").getMethod("equals",Class.forName("java.lang.Object"));
	} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	protected Proxyww(InvocationHandler h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public final boolean equals(Object obj) {  
	    try {  
	        return ((Boolean) super.h.invoke(this, m1, new Object[] { obj })) .booleanValue();  
	    } catch (Throwable throwable) {  
	        throw new UndeclaredThrowableException(throwable);  
	    }  
	}  

	@Override
	public void request() {
		// TODO Auto-generated method stub
		
		Subject rs=new RealSubject();
		
		InvocationHandler ds=new DynamicSubject(rs);
		
		Class<?> cls=rs.getClass(); 
		Subject subject=(Subject) Proxy.newProxyInstance(  
	            cls.getClassLoader(),cls.getInterfaces(), ds);
		subject.request();
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = Proxyww.m1;
		System.out.println(m.getName());
	}

}
