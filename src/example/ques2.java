package example;
import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arg;
		int words=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter a string ");
		arg=s.nextLine();
		
		String[] split=arg.split(" ");
		for(String temp: split)  
		{
			//System.out.println(temp);
			if(temp != null && !temp.isEmpty() )
				words++;
				
				
		}
		
			
			
		System.out.println("the no. of words are "+words);
		

	}

}
