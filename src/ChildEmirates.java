
public class ChildEmirates extends ParentAirCraft {     //---> extends means Inheritance concept

	public static void main(String[] args) {
		
		ChildEmirates a =  new ChildEmirates();          // --> Since child class is inheriting parent class, hence we can access all the methods of parent class from the object of the child class
		//ParentAirCraft b = new ParentAirCraft();
		a.engine();
		a.SafetyGuidelines();
		
		a.colour();
 }

	@Override
	public void colour() {
		System.out.println("colour of the aircraft");		
	}

}
