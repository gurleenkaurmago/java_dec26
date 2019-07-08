package example;
import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arg;
		int i=0,count = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Please enter a string");
		arg=a.nextLine();
		System.out.println(arg);
		/*String[] split= arg.split(" ");
		for(String str : split) 
		{
			i++;// This code does not count the spaces at the end of the sentence
		}
		i--;
		System.out.println("the no. of spaces are "+i);
		*/
		for(int j=0;j<arg.length();j++)
		{
			if(arg.charAt(j)==' ')
				count++; //this code counts correct no. of spaces
		}
		System.out.println("The no. of spaces are "+count);
			
		
		

	}
}
