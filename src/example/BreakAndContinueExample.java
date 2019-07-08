package example;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++)
		{

			if(i%4==0)
				break;
			System.out.println(i);
		}
		
		//continue
		for(int i=1;i<10;i++)
		{

			if(i%4==0)
				continue;
			System.out.println(i);
		}
		
		
		
	}

}
