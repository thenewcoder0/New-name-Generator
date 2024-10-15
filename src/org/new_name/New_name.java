package org.new_name;

import java.util.Random;
import java.util.Scanner;

public class New_name {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		System.out.println("Welcome to New Name Creator");
		System.out.println("Enter the First Name:");
		String firstname =s.nextLine();
		System.out.println("Enter the Second Name:");
		String secondname=s.nextLine();
		
		String newName="";
		if (r.nextBoolean()){
			newName= firstname.substring(0,firstname.length()/2);}
			else {
			newName= firstname.substring(firstname.length()/2);
			}
		if(r.nextBoolean()){
			newName = secondname.substring(0,secondname.length()/2);}
		else {
			newName=secondname.substring(secondname.length()/2);
		}
		System.out.println("The New Name is: " + newName);
		s.close();
		}
		}