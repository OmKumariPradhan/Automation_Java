package SeleniumDemo.SeleniumDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCoreIf {

	public static void main(String[] args) {
		int[] arr2= {1,2,3,4,5,6,7,8,9,12,122};
		
		for(int i=0;i<arr2.length;i++)
		
			if(arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
				
			{
				System.out.println(arr2[i]+ "Is not divisible by 2");
			}
		
		
		ArrayList<String> a = new ArrayList<String>(); // Create object of that method to access the method of the class
		a.add("Selenium");
		a.add("Academy");
		a.add("Tuitorial");
		//a.remove(2); /// to remove
		System.out.println(a.get(1)); // to extract or call the value
		
		for (int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("**********");
		for(String val:a)
		{
			System.out.println(val);
		}
		
		//Array is present or Not in ArrayList
		System.out.println(a.contains("Selenium"));
		
		String[] name = {"Simran", "Pradhan", "Om", "Kumari"}; // initializing array 
		List<String >nameArray= Arrays.asList(name);  //Converting array into arrayList
		System.out.println(nameArray.contains("Simran"));
			
	}

}
