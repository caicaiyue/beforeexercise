package headfirstmode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
	private Object obj;
	public DynamicSubject(){
		
	}
	
	public DynamicSubject(Object obj){
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before calling"+method);
		method.invoke(obj, args);
		System.out.println("after calling " + method);  
	    return null;  
	}

}
