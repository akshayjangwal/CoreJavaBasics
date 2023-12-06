
public class MethodsDemo {

	public static void main(String[] args) {
		
	//creating object of the class to access created method...............(2)	
		
	MethodsDemo m = new MethodsDemo();
	String name = m.getData();
	System.out.println(name);
	
	//Accessing method from another class .................................(3)
	
	MethodsDemo2 m2 = new MethodsDemo2();
	m2.getuserData();
	getData2();
	}

	//creating a method ..................................................(1)
	public String getData()
	{
		System.out.println("Hello");
		return "akshay jangwal";
		
	}
	
	//STATIC - accessing methods of a class without creating its object.........(4)
	public static String getData2()
	{
		System.out.println("Hello");
		return "akshay jangwal";
		
	}
	
}

