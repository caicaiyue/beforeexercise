package headfirstmodereview;

import java.util.Iterator;
import java.util.Stack;

public class ComponentIterator implements Iterator {
	Stack<Iterator> stack = new Stack<Iterator>();
	
	public ComponentIterator(Iterator iterator){
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator it = stack.peek();
			if(!it.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
		
		
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator it = stack.peek();
			Component c = (Component) it.next();
			if(c instanceof Menu){
				stack.push(c.creatIterator());
				return next();
			}else{
				return c;
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
