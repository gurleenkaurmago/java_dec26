package example;

public class christmastree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<15;i++)
		{
			for(int k=15-i;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<=2*i;j++)	
				System.out.print("*");
			
			System.out.println();
		}	
		
			

	}

}
