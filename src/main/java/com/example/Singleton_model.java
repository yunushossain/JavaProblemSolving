package com.example;

public class Singleton_model {
private static Singleton_model st = null;


	private Singleton_model() {
	
	}
	
	public static Singleton_model getInstance() {
		if(st==null) {
			st = new Singleton_model();
		}
		return st;
	}

}
