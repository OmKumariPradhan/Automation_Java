package SeleniumDemo.SeleniumDemo;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		d.getData1(); // no return
		String name = d.getData2(); // variable name returns string. Whatever value it returns, it stores in the variable name.
		System.out.println(name);
		
		MethodsDemo2 a = new MethodsDemo2(); //creating obj of different class
		a.getUserData();
		
		getData3();  // method is calling without creating object
		
		
	}
    public void getData1()  //no return 
    {
    	System.out.println("Hello World");
    }
    public String getData2()  //return String
    {
    	System.out.println("Hello World");
    	return "Rahul Shetty";
    }
    public static String getData3() //If we declare as "Static" , without creating obj, the method is called.
    {
    	System.out.println("Hello Data3");
    	return "Rahul Shetty";
    }
    
    
    
}
