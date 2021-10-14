package com.neosoftlab;
import java.util.Scanner;

public class Exercise1 {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bl;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st string ");
		String s1=sc.nextLine();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		System.out.println("Enter third string");
		String s3=sc.nextLine();
		//check s1 and s2 same or not
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Content is same");
		else
			System.out.println("Content is not equal");
		
		//check s1 and s3
		if(s1.contentEquals(s3))
			System.out.println("Content is same");
		else
			System.out.println("Content is not  same");
		

		
    //Default display value
		System.out.println("========================================================================");
	       System.out.println("The default values of primitive data types are:");
	        System.out.println("Byte:"+b);
	        System.out.println("Short:"+s);
	        System.out.println("int:"+i);
	        System.out.println("long:"+l);
	        System.out.println("float:"+f);
	        System.out.println("double:"+d);
	        System.out.println("char:"+c);
	        System.out.println("Boolean:"+bl);
	        
	        System.out.println("==========================================");
	        System.out.println("Hello!! My name is Kavita");
			
	}
	}


