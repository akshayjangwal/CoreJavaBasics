
public class Variables {
	
	//e.g. scenario - census taking place in Delhi city
	
	String name;           //------> INSTANCE VARIABLES as they will change value from object to object based upon which object is calling them. 
	String address;        //------> e.g. when object obj1 calls the GetAddress method, address is "ShankarNagar" and when obj2 then it is "LaxmiNagar"
	//String city;
	static String city = "Delhi";
	
	/*Static Block  --------------> To make code look more optimised and avoid declaring static line by line each variable
	static {
		city = "Delhi";
		i=0;
	}*/
	
  /*public Variables(String name, String address, String city)  // -------> Parameterized constructor as we passed values. Automatically called when object is created for this class
  -----> These three variables are now local variables and have scope within constructor blocks only, our job is to assign these variables to the instance variables. */
	
	public Variables(String name, String address)
	{
		this.name = name;         //----> We use this keyword to assign values to our instance variables from our local constructor variables
		this.address = address;
		
  /*name = name;
  address = address; */
		
  // this.city = city; ------------> not required as city made static
		
		System.out.println(name+" "+address+" "+city);
		
	}
	
	public void GetAddress()
	{
		System.out.println(address);
	}

	public static void main(String[] args) {
		
		//Variables obj1 = new Variables("Akshay", "KrishnaNagar", "Delhi");   //---> sending values via object
		//Variables obj2 = new Variables ("Rahul", "LaxmiNagar", "Delhi");
		Variables obj1 = new Variables("Akshay", "KrishnaNagar");         //-----> removing city so there is no conflict with parameterized constructor as we just made city variable as static
		Variables obj2 = new Variables ("Rahul", "LaxmiNagar");
		obj1.GetAddress();
		obj2.GetAddress();
	}

}
