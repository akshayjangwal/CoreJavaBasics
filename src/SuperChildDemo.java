
public class SuperChildDemo extends SuperParentDemo{
	
	String name = "Jangwal";
	
	//Super keyword to call CONSTRUCTOR in parent class
	public SuperChildDemo()
	{
		System.out.println("Child class constructor");
	}
	
	//Super keyword to call VARIABLE in parent class
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);

	}
	
	//Super Keyword to call METHOD in parent class
	public void getAnotherData()
	{
		//super.getAnotherData(); //-----------------------> can be mentioned anywhere within child class method as per requirement           
		System.out.println("Child class method");
		super.getAnotherData();
	}

	public static void main(String[] args) {
		SuperChildDemo a = new SuperChildDemo();
		a.getData();
		a.getAnotherData();
		

	}

}
