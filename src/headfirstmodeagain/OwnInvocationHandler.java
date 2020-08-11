package headfirstmodeagain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnInvocationHandler implements InvocationHandler {
	PersonBean person;

	public OwnInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		if (method.getName().startsWith("get")) {
			return method.invoke(person, args);
		} else if (method.getName().equals("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else if (method.getName().startsWith("set")) {
			return method.invoke(person, args);
		}
		return null;
	}

}
