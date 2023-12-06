import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		//Question : Print unique numbers from the array
		
		int a[] = {4,5,5,5,4,6,6,9,4}; 
		
		ArrayList<Integer> ab = new ArrayList<Integer>();   //Take one empty ArrayList where we will push the numbers encountered first time (eg : 4 is present 3 times, then only first 4 will be pushed to this empty ArrayList)
		
		for(int i=0; i<a.length; i++)              // ab --> 4,
		{
			int k=0;
			
			if(!ab.contains(a[i]))                // This loop pushes value from array into the ArrayList
			{
				ab.add(a[i]);
				k++;
				
				
				for(int j=i+1; j<a.length;j++)     // This loop is checking whether the element pushed in the ArrayList is repeating again in the array, if yes, then increment the value if k, is its incremented means the element pushed is not unique
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println("Number of times "+a[i]+" is present : "+k);
				
				if(k==1)
				{
					System.out.println("Number "+a[i]+" is unique");
				}
			}	
			
		}
		
	}

}
