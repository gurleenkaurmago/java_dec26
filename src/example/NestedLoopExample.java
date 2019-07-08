package example;

public class NestedLoopExample {

	public static void main(String[] args) {
		
		/*
		int a,b,c;
		a=33;b=44; c=a+b;
		System.out.print("sum of two numbers : ");
		System.out.println(c);
		 */
		

		for(int i=1; i<=3;i++)//for row
		{
		
			for(int j=1; j<=4;j++)//for col
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}

		///
		/*
		 * 1
		 * 12
		 * 123
		 * 1234	  
		 */
		
		for(int i=1; i<=4;i++)//for row
		{
		
			for(int j=1; j<=i;j++)//for col
			{
				System.out.print(j);
			}
			System.out.println();
		}
		//	for(int i=1; i<=4;i++)//for row
		for(int i=1; i<=10;i++)//for row
		{
		
			for(int j=1; j<=i;j++)//for col
			{
				System.out.print("*");
			}
			System.out.println();
		}



	}

}
