package example;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		//print in reverse
		i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		//print all odd numbers between 1 to 30
		i=1;
		while(i<=30)
		{
			System.out.println(i);
			i+=2;  //i =i+2
		}
		
		//print sum of all odd and even numbers between 1 to 100
		int se=0,so=0;
		i =1;
		while(i<=100) {
			
			if(i%2==0)
				se +=i;
			else
				so +=i;
			
			i++;
		}
		System.out.println("sum of all even : "+se);
		System.out.println("sum of all odd : "+so);
		
		
			
		
	}

}
