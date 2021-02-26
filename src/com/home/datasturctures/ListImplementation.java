package com.home.datasturctures;

public class ListImplementation<T> {
	
	private static final int SIZE_FACTOR = 5;
	
	private T data[];
	
	private int index;
	
	private int size;
	
	public  ListImplementation() {
		this.data = (T[]) new Object[SIZE_FACTOR];
		this.size = SIZE_FACTOR;
	}
	
	public void add(T obj) {
		System.out.println("Index:: "+this.index + " Size:: "+this.size + " Data size:: "+this.data.length);
		if(this.index == this.size - 1) {
			increaseSizeAndReallocate();
		}
		data[this.index] = obj;
		this.index++;
	}
	
	private void increaseSizeAndReallocate() {
		this.size = this.size+SIZE_FACTOR;
		T newData[] = (T[]) new Object[this.size];
		for(int i=0; i<data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
	}
	
	public T get(int i) throws Exception {
		if(i > this.index - 1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i < 0) {
			throw new Exception("Negative Index not allowed");
		}
		return this.data[i];
	}
	
	public void remove(int i) throws Exception {
		if(i > this.index - 1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i < 0) {
			throw new Exception("Negative Index not allowed");
		}
		System.out.println("Object getting removed:: "+this.data[i]);
		for(int x=i; x<data.length-1;x++) {
			data[x] = data[x+1];
		}
		this.index--;
	}

	public static void main(String[] args) throws Exception {
		ListImplementation<String> list = new ListImplementation<>();
		list.add("Zero");
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Nine");
		
		System.out.println("8th Element is:: "+list.get(7));
		
		list.remove(5);
		
		System.out.println("8th Element is:: "+list.get(7));

	}

}
