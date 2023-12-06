
public class ExceptionDemo {

	public static void main(String[] args) {

       /*int a = 7;
       int b = 0;
       int c = a/b;
       System.out.println(c);

	}*/
		
		try
		{
			int a = 7;
		    int b = 0;
		    int c = a/b;
		    System.out.println(c);
		}
		
		catch (ArithmeticException et)   //---> specific to and catches only Arithmetic exceptions, error thrown also is related to arithmetic error, so try block goes and sees which catch block is related to this error and executes that block accordingly.
		{
			System.out.println("I caught the specific Arithmetic exception");
		}

		catch(Exception e)    //---> excepts all kind of exceptions, its a generic one 
		{
			System.out.println("I caught the error/exception");
		}
		finally
		{
			System.out.println("I am executing this irrespective of the fact that exception is thrown or not");
		}
		
}
}
