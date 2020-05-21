package headfirstmodeagain;

import java.util.Iterator;
import java.util.Stack;

public class ComponentIterator implements Iterator {
	Stack<Iterator> stack = new Stack<Iterator>();
	
	public ComponentIterator(Iterator it){
		stack.push(it);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator it = stack.peek();
			if(it.hasNext()){
				return true;
			}else{
				stack.pop();
				return hasNext();
			}
			
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator it = stack.peek();
			MenuComponent mc = (MenuComponent) it.next();
			if(mc instanceof Menu){
				stack.push(mc.createIterator());
				return next();
			}else{
				return mc;
			}
			
		}else{
			return null;
		}
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
