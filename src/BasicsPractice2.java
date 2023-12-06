
public class BasicsPractice2 {

	public static void main(String[] args) {
		
		//split funtion // trim function
		
		String s = "akshay jangwal delhi";
		String[] splittedString = s.split("jangwal");
		
		for (int i=0; i<splittedString.length ; i++) {
		
		System.out.println(splittedString[i].trim());
	}
		
		//print each character in a string separately
		//for (int i =0; i<s.length();i++) {
			
		//System.out.println(s.charAt(i));
		//}
		
		//print the string in reverse order
		for (int i =s.length()-1; i>=0;i--) {
			
			System.out.println(s.charAt(i));
			}		
	}

}
