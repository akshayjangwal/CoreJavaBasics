
public class InterviewMaxMinNumber {

	public static void main(String[] args) {
		/* 2 4 50
		   3 0 7
		   1 2 9 */
		int a[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int temp = a[0][0];        //----------->Assuming first number of matrix is minimum
		int maxnumber = 0 ;
		int mincolumn = 0;
		int k=0;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				int b = a[i][j];
				if(b <temp)
				{
					temp = b;
				    mincolumn = j;
			}
		}
	}
		System.out.println(mincolumn);
		
		while(k<3) {
			int d = a[k][mincolumn];
				if(a[k][mincolumn]>maxnumber)
			{
				maxnumber = a[k][mincolumn];
			}
				k++;
		}
		System.out.println(maxnumber);
}
}
