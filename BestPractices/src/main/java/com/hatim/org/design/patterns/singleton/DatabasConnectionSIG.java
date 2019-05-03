package com.hatim.org.design.patterns.singleton;

public class DatabasConnectionSIG {
	
	private static DatabasConnectionSIG onlyInstance=new DatabasConnectionSIG();

	public String connect(String url) {

		return "Connecting to .." + url;
	}
	
	public static  DatabasConnectionSIG getInstance(){
		
		
		return onlyInstance;
	}
	
	
	private DatabasConnectionSIG(){
		
	}

}
