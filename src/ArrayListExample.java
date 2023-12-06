import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList<Integer> a = new ArrayList<Integer>(); //It means I am adding integers to this ArrayList
         
		ArrayList<String> a = new ArrayList<String>();
		a.add("Akshay");
		a.add("Java");    
		System.out.println(a);  
        a.add(0, "QA"); 
        System.out.println(a);
        /*a.remove(1);                    //--------> Remove by index
        a.remove("Java");                 //----> Remove by string
        System.out.println(a); */
        
        System.out.println(a.get(2));               //---------->Retrieve string value at index 2 in the object a
        System.out.println(a.contains("testing"));  //----> Check if string by name testing is present in a object or not. Will return a boolean value. 
        System.out.println(a.contains("QA"));
        
        System.out.println(a.indexOf("Akshay"));
        System.out.println(a.size());
        System.out.println(a.isEmpty());                //----> whether array is empty or not. Returns a boolean value. 
        } 

}
