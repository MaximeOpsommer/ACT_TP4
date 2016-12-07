package main;

import java.io.File;

import structure.Pizza;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("data/pizza1");
		
		Pizza pizza = new Pizza(file);
		
		System.out.println(pizza);
		
	}

}
