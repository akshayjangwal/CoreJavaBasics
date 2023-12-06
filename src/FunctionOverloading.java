
public class FunctionOverloading {
	
	public static void main(String[] args) {
		
		FunctionOverloading a = new FunctionOverloading();
		a.getData(2);
		a.getData("Akshay");
		a.getData(5,6);

	}
	
	public void getData(int a)
	{
		System.out.println(a);
    }
	//public void getData(int a) --------------> Function Overloading
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(a);
    }
	
}
