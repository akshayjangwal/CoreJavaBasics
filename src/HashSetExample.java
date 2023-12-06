import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("UK");            //------> Duplicate values not accepted and hence not printed in output as well.
		hs.add("Akshay");
		hs.add("Jangwal");
		
		System.out.println(hs);
		
		//Iterator ---> It is like an interface. Read each and every object present in the set. 
		//Create an object for set just like hs, hs.iterator and then create iterator object.

		Iterator<String> i = hs.iterator();  // ----> imported java.util package ---- Iterator<String> is the return type for iterator()
		System.out.println(i.next()); //-----> points to the first index, i.e. 0th index.
		System.out.println(i.next());
		
		/*But now what if we have 100 object in set data structure and want to print 100th index,
		will we right i.next() 100 times?? NO. For that we have hasNext() method and while loop
		hasNext() method checks if next index is present or not*/
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		
		}
	  
	}

}
