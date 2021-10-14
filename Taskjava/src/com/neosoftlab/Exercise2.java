package com.neosoftlab;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 int a,b,c;
	      a=40;
	      b=30;
	      c=a+b;
	      System.out.println("Addition:"+c);
	      c=a-b;
	      System.out.println("Substraction:"+c);
	      c=a*b;
	      System.out.println("Multiplication:"+c);
	      c=a/b;
	      System.out.println("Division:"+c);
	      c=a%b;
	      System.out.println("Remainder:"+c);
	      a=++a;
	      System.out.println("Increment operator:"+a);
	      a=--a;
	      System.out.println("Decrement operator:"+a);
	      
	      System.out.println("============================================");
	      
	      //Relational opearator
	      System.out.println("The two operands a and b are equal ="+(a==b));
	      System.out.println("The two operands a and b are not equal ="+(a!=b));
	      System.out.println("The operand a is greater than b ="+(a>b));
	      System.out.println("The operand a is smaller than b ="+(a<b));
	      System.out.println("The operand a is greater than or equal to b ="+(a>=b));
	      System.out.println("The operand a is smaller than or equal to b ="+(a<=b));
	      
	      System.out.println("===============================================");
	      //Bitwise Operator
	      c=a&b;
	      System.out.println("AND of a&b ="+c);
	      c=a|b;
	      System.out.println("OR of a|b ="+c);
	      c=a^b;
	      System.out.println("Exclusive OR of a^b ="+c);
	      c=a<<b;
	      System.out.println("Left Shift of a<<b ="+c);
	      c=a>>b;
	      System.out.println("Right shift of a>>b ="+c);
	      c=~a;
	      System.out.println("Complement of ~a ="+c);
	      
	      System.out.println("================================================");
	      
	       //Conditional Operator
	      c=(a==1)?20:50;
	      System.out.println("Value of c is:"+c);
	      c=(a==40)?20:50;
	      System.out.println("Value of c is:"+c);
	      
	      System.out.println("=================================================");
	      
	    //control Statements
			
			//if statement
	       int marks = 50;
	       if(marks > 65)
	    	   System.out.println("First Class");
	       else
	    	   System.out.println("Second Class");
	       System.out.println("Hii welcome ,hello Saba here");
	       
	       System.out.println("===========================================");
	       
	       //while statements
	       int i = 5;
	       while(i<=20)
	       {
	    	   System.out.println(i);
	    	   i=i+2;
	       }
	       
	       System.out.println("==============================================");
	       //Do-while statements
	       int n = 1;
	       do {
	    	   System.out.println(n);
	    	   n++;
	    	   
	       }while(n<=10);
	       
	       System.out.println("================================================");
	       
	       //Switch Statement  
	       String name = "Flamingo";
	       switch(name)
	       {
	       case "Owl":
	    	   System.out.println("Night Creature");
	    	   break;
	       case "Eagle":
	    	   System.out.println("Keen Vision");
	    	   break;
	       case "Pelican":
	    	   System.out.println("Lives near water");
	    	   break;
	       case "Flamingo":
	    	   System.out.println("Pretty and pink");
	    	   break;
	       default:
	    	   System.out.println("Can Fly.");
	    	   break;
	       }
	       System.out.println("=========================================");
	      
	       //print integers 5 to 10
	       int x;
	      for(x=5;x<=10;x++)
	       {
	    	   System.out.println("Java for loop example: "+x);
	    	   
	      }
	      
	      System.out.println("===============================================================");
	      
	  	
	  
	      
	}

}
