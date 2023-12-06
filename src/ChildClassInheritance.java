
public class ChildClassInheritance extends ParentClassInheritance {

	public static void main(String[] args) {
				
		ChildClassInheritance a = new ChildClassInheritance();
		a.colour();
		a.audiosystem();
		a.brakes();
	}
	public void engine()
	{
		System.out.println("Specific engine is here");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public void audiosystem()            //---------------->Function Overriding
	{
		System.out.println("NEW audio system code is implemented ---> Child Class");
	}
	
}
