package com.kavita;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailValidationFileHandling {
	
	public static void main(String[] args) throws IOException {
		String[] s1 = new String[5];
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		File file1 = new File("src/resources/emails1.txt");
		File file2 = new File("src/resources/domains.txt"); //That one created by this
		//if already file exists, it writes data in that file else it creates new file and writes data in it
		//Lets check domains
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(file1,true));
		BufferedWriter buffWrite2 = new BufferedWriter(new FileWriter(file2,true));
		
		
		for(int i=0;i<s1.length;i++) {
			System.out.print("Enter your Mail : ");
			String temp = buffer.readLine();
			
			if(temp.matches("(a-z){1,10}(A-Z){1,10}(.){3}(@){1}(0-9){1,10}") ) {
				System.out.println("Invalid Email!");
			}
			else {
				s1[i] = temp;
				System.out.println("Mail Stored");
			}
		}
		for(int j = 0;j<s1.length;j++) {
			buffWrite.write(s1[j]);
			buffWrite.newLine();
			
			System.out.println(s1[j]);
		}
		buffWrite.close();
		
		String[] s2 = new String[5]; //Creating new array to store domains
		for(int k = 0; k<s2.length;k++) { //Now we are creating new array to split domains of emails and to store them in new file
			String[] domains = s1[k].split("@");
			//making two parts of string from "@" and storing in domains array
			/*
			 * buffWrite2.newLine(); //Moving to new line buffWrite2.write(domains[1]);
			 */
		//Lets test it how it works :  We are using split method;
			
			System.out.println(domains[1]); //This is giving domains
			
			buffWrite2.newLine();
			buffWrite2.write(domains[1]);
			
		}
		buffWrite2.close();
		//New file automatically created here
		
	}
}
