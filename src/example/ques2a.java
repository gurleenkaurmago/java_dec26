package example;

import java.util.Scanner;

public class ques2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arg,search;
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a string ");
		arg=s.nextLine();
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the word to be counted in the sentence ");
		search=s1.nextLine();
		
		String[] spl= arg.split(search);
		for(String temp: spl)
			count++;
		
		System.out.println("The count of "+search +" is "+count );

	}

}
