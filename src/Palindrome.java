
public class Palindrome {

	public static void main(String[] args) {
		
		String s = "akshay";
		String temp = "";                                       //empty string concept
		
		for (int i =s.length()-1; i>=0; i--) {
			
			temp = temp+ s.charAt(i);
		}
		System.out.println(temp);
//		System.out.println("The length of the string is : "+s.length());

	if (s.equals(temp)) 
		System.out.println("It is a palindrome");
		else 
			System.out.println("It is not a palindrome");
		
	}
}
