package com.neosoftlab;

public class Exercise16_3 extends Thread {

	
		private int delay; 
		Exercise16_3 (String name, float seconds) 
		{ 
			super (name); 
			delay = (int) seconds * 1000;
			start(); 
		} 
		public void run ( ) 
		{ 
			while (true) 
			{ 
				System.out.println (Thread.currentThread ( ).getName ( ) ); 
				try 
				{ 
				 Thread.sleep (delay); 
				} 
				 catch (InterruptedException e) 
				{ 
				  return ; 
			} 
		} 
	} 
	public static void main (String argc[ ]) 
	{ 
		
		new Exercise16_3 ("one potato", 1.1F); 
		new Exercise16_3 ("two potato", 1.3F); 
		new Exercise16_3 ("three potato", 0.5F); 
		new Exercise16_3 ("four", 0.7F); 
	} 
}