package SeleniumDemo.SeleniumDemo;

public class StringBrushup {

	public static void main(java.lang.String[] args) {
		//String is an object // String Literal
		
		//String s1 = "Rahul Shetty Academy";
		//String s2= "hello";
		
		
		//new
		//String s3 = new String("Welcome");
		//String s4 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		String [] SplittedString = s.split("Shetty");   //converting String into Array
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]); // space is also printed
		System.out.println(SplittedString[1].trim()); // space is trimmed.
		/*for (int i=0 ; i<s.length(); i++)
		{
			System.out.println(s.charAt(i)); // charAt  will give the letter which is in index
		
		}*/
		for (int j=s.length()-1 ;j>=0; j--)//REVERSE THE STRING
		{
			System.out.println(s.charAt(j)); // charAt  will give the letter which is in index
		
		}
			
		
	}

}