
public class StringsBasics {

	public static void main(String[] args) {
		
		//strings are immutable
		
		String a ="hello";
		String b = "hello";
		String c = a.concat("World");
		System.out.println(c);
		
		//StringBuffer and StringBuilder - mutable
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");      //helloworld
		System.out.println(sb);
		sb.replace(3, 5, "YY");  //includes 3rd and 4th index ---- helYYworld
		System.out.println(sb);
		sb.insert(2, "X");        // heXlYYworld
		System.out.println(sb);
		
		sb.deleteCharAt(6);       //heXlYYorld
		System.out.println(sb);
		sb.reverse();	          //dlroYYlXeh
		System.out.println(sb);
		

	}

}
