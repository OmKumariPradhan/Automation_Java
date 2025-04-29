package SeleniumDemo.SeleniumDemo;

public class CoreJava {

	public static void main(String[] args) {
		int my =12345;
		String abc="Welcome";
		char aplhabet = 'G';
		double dec= 1.09;
		boolean mycard= true;

		System.out.println(my);
		System.out.println(abc);
		System.out.println(aplhabet);
		System.out.println(dec);
		System.out.println(mycard);
		
		//Array
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		int[] arr2 = {1,2,3,4,5,11,122};
		
		for (int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Simran", "Pradhan", "Om", "Kumari"};
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//Enchanced loop
	
		for(String s:name)
			System.out.println(s);
			
	}

}
