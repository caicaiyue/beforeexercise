package headfirstmode;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack<Iterator> stack = new Stack<Iterator>();
	
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.empty()){
			return false;
		}else{
			Iterator iterator = stack.peek();
			if(!iterator.hasNext()){
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
			Iterator iterator = stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu){
				stack.push(component.createIterator());
			}
			return component;
		}else{
			return null;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
