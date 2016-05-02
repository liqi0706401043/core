package com.mikey.Aalgorithms;

public class OnArrayToTwoStack {
	private int[] arr;
	private int size1;
	private int size2;
	private int total;
	public enum Stack{
		STACK1,STACK2;
	}
	private static final int DEFAULATE_SEIZE = 10;
	public OnArrayToTwoStack(int n) {
		arr = new int[n];
		total = n;
		size1 = 0; 
		size2 = n-1;
	}
	
	void push(Stack stack, int x){
		switch(stack){
		case STACK1:
			if(size1 > size2)
				System.out.println("not enough capacitity");
			arr[size1] = x;
			size1++;
			break;
		case STACK2:
			if(size1 > size2)
				System.out.println("not enough capacitity");
			arr[size2] = x;
			size2--;
			break;
		}
	}
	
	int pop(Stack stack){
		switch(stack){
		case STACK1:
			if(size1 == 0){
				System.out.println("The stack1 is empty");
				break;
			}
			else{
				size1--;
				return arr[size1];
			}
		case STACK2:
			if(size2 == total-1){
				System.out.println("The stack2 is empty");
				break;
			}
			else{
				size2++;
				return arr[size2];
				
			}
		}
		return -1;
	}
	
	public int size(Stack stack){
		switch(stack){
		case STACK1:
			return size1;
			
		case STACK2:
			return total - size2 -1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		OnArrayToTwoStack doubleStack = new OnArrayToTwoStack(10);
		
		
		doubleStack.push(Stack.STACK1, 1);
		System.out.println("stack1 out: " + doubleStack.pop(Stack.STACK1));		
		doubleStack.push(Stack.STACK1, 6);
		doubleStack.push(Stack.STACK1, 3);
		doubleStack.push(Stack.STACK1, 5);
		System.out.println("stack1 out: " + doubleStack.size(Stack.STACK1));
		System.out.println("stack1 out: " + doubleStack.pop(Stack.STACK1));
		System.out.println("stack1 out: " + doubleStack.pop(Stack.STACK1));
		System.out.println("stack1 out: " + doubleStack.pop(Stack.STACK1));
		
		
		doubleStack.push(Stack.STACK2, 8);
		doubleStack.push(Stack.STACK2, 0);
		doubleStack.push(Stack.STACK2, 4);
		System.out.println("stack2 size: " + doubleStack.size(Stack.STACK2));
		System.out.println("stack2 out: " + doubleStack.pop(Stack.STACK2));
		
		System.out.println("stack2 out: " + doubleStack.pop(Stack.STACK2));
		System.out.println("stack2 out: " + doubleStack.pop(Stack.STACK2));
		System.out.println("stack2 out: " + doubleStack.pop(Stack.STACK2));
		
		
		
	}

}
