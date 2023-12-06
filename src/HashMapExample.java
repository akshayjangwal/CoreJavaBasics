import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Morning");
		hm.put(2, "Welcome");
		hm.put(3, "Back!");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		hm.remove(1);
		System.out.println(hm.get(1));
		
		System.out.println(hm.get(42));
		
		//Now we convert this HashMap into a Set and we store this Set collection into the sn object
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp =  (Map.Entry)it.next(); 
			
			//Iterator takes us to the first set that is having both key and value (0,Hello in this case).
			//If we print it.next() directly, it will throw an error as the first index is having both key and value unlike HashSet which had only value. Hence, it gets confused whether to extract key or value? By typecasting using Map.Entry, we are explicitly extracting both key and value separately using .key() and .value() functions.
			//I need to print both key and values separately, hence we are typecasting using Map.Entry as above.
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		

	}

}
