import java.util.ArrayList;

public class JavaStreams1 {

	public static void main(String[] args) {
		
		
		// Store the elements in the list and find out the number of elements starting with alphabet A in that list
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akshay");
		names.add("Jangwal");
		names.add("Ajay");
		names.add("Sharma");
		names.add("Ayushi");
		int count =0;
		
		for (int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count ++;
				System.out.println(actual+" . . . starts with letter A");
			}
		}
		System.out.println(count);

	}

}
