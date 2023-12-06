
public class SwappingValues {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		int temp;
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a="+a+"  b="+b);
		
		//Swapping values without using third variable
		
		a = a+b;      //4+5 = 9
		b = a-b;      //9-5 = 4
		a = a-b;      //9-4 = 5
		
		System.out.println("New swapped values are: a="+a+"  b="+b);	
		
	}

}
