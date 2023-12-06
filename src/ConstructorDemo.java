
public class ConstructorDemo {
	
	//Default constructor
	public ConstructorDemo()
	{
		System.out.println("I am the default constructor");  //Constructor - No return type and name same as classname
	}
	
	//Parameterised constructor
	public ConstructorDemo (int a, int b)
	{
		System.out.println("I am the parameterised constructor");  
	}
	
	public void GetData()
	{
		System.out.println("I am the method");       //Creating a Method of the class
	}

	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo();  //Declaring an object of the class
		ConstructorDemo obj2 = new ConstructorDemo(4,5);
		obj.GetData();
 
	}

}
