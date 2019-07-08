package example;


public class StringExmaple {

	public static void main(String[] args) {
		
		
		String str = " this Is java CoDE.  ";
		String s;
		
		s = str.toUpperCase();
		System.out.println(s);
		
		s = str.toLowerCase();
		System.out.println(s);
		
		int l = str.length();
		System.out.println(l);
		
		
		s = str.replace("a", "xy");
		System.out.println(s);
		
		
		s = str.trim();
		l = s.length();
		System.out.println(l);
		
		
		s = str+"test";		
		s = str.concat("test");
		
	
		int ps;
		ps = str.indexOf("o");
		System.out.println(ps);
		
		char c;
		c =str.charAt(2);
		System.out.println(c);
		
		//convert to ascii
		int ss = c;
		System.out.println(ss);
		
		
		s = str.substring(0, 3);
		System.out.println(s);
		
		//{"this","is","java","code"}
		s="this is java";
		String data[] = s.split(" ");
		System.out.println(data[1]);
		
		//
		if(s.contains("is"))
		{
			System.out.println("is is present..");
		}
	
		//
		if(s.endsWith("n"))
		{
			
		}
		//
		if(s.startsWith("s"))
		{
			
		}
		

	}

}
