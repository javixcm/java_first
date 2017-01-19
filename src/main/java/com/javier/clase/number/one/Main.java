package com.javier.clase.number.one;

public class Main {

	public static void main(String []arg){
		Customer c = new Customer();
		c.setAge(20);
		c.processAge();
		
		int value = c.getValueBySex(true);
		System.out.println("return value == "+ value);
		
	}
	
	
}
