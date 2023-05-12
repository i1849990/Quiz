package quiz;

import java.util.ArrayList;

public class Stack<T> {
	
	//use an ArrayList as the backend structure
	
	ArrayList<T> data;
	
	public Stack() {
		
		data = new ArrayList<T>();
		
	}
	/*
	 * add to the stack
	 */
	public void push(T t) {
		
		data.add(t);
		
	}
	
	/*
	 * 
	 * pop from the stack if not empty
	 */
	
	public T pop() {
		if (data.size() == 0) {
			return null;
		}else {
			T t = data.get(data.size()-1);
			data.remove(data.size()-1);
			return t;
		}
		
	}
	
	public int size() {
		return data.size();
	}
	
	public boolean empty() {
		if(size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public T peek() {
		if(empty()) {
			return null;
		}
		return data.get(data.size()-1);
	}
	
	
	
	
	
	
	
	
}
