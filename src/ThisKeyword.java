  
public class ThisKeyword {

	
	int a = 5;                    //-------> Global variable a
	
	public void getData()
	{
		int a = 6;               //-------> Local variable a
		int b = a+ this.a;       //-------> Print sum of global variable and local variable
		
		System.out.println(a);
		System.out.println(this.a);     //-----> Using "this" keyword to invoke global value of variable a 
        System.out.println(b);       // -----> 6+5=11
	}
	public static void main(String[] args) {
		
		ThisKeyword a = new ThisKeyword();
		a.getData();
		

	}

}
