package example;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is java code.";
		String flag="";
					
		System.out.println(str);
		String[] str1 = str.split(" ");
		
		for(String w: str1)
			{
			
			flag=flag+w.substring(0,1).toUpperCase()+w.substring(1,w.length()).toLowerCase()+" ";
			//System.out.print(w.substring(0,1).toUpperCase()+w.substring(1,w.length()).toLowerCase()+" ");
			
			}
		System.out.println(flag);
		
		
		
		
			
		

	}

}
