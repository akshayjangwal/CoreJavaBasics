
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		//2 4 6 
		//5 7 8 
		//a[rows][columns]
		
		int a[][]=new int[2][3];
		
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=5;
		a[1][1]=7;
		a[1][2]=8;
		
		//int b[][]= {{2,4,6}, {5,7,8}};

		//System.out.println(a[0][1]);
		
		for(int i=0;i<2;i++)                       // ----> Row
		{
			for(int j=0;j<3;j++)                   // ----> Column
			{
			System.out.print(" "+a[i][j]+" ");	
		    }
			System.out.println(""); 
	}

}
}
