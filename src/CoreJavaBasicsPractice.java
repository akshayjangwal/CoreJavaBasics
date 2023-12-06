
public class CoreJavaBasicsPractice {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String [] name = {"akshay", "jangwal", "delhi"};
		
		for(int i =0; i<name.length; i++)
		{
		System.out.println(name[i]);
		}
		
		//Enhanced for loop declaration
		
		for( String s: name) {
			System.out.println(s);
		}
		
		
	}
}
