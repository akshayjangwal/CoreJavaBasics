
public class ArraysDemo {

	public static void main(String[] args) {
		
		//int a;
		//a=4;
		
		int a[]=new int[5];              //---> array declaration and allocating memory space
		 	
		a[0]=10;                          //---> initialising array values -- Way No.1 
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int b[]= {4,3,2,1};            //---> Dynamic array initialisation -- Way No.2
		
		for(int i =0; i<a.length; i++)  //-----> retrieving array values
		{
		System.out.println(a[i]);
	    }
		for(int j=0;j<b.length;j++ )
		{
			System.out.println(b[j]);
		}

}
}
