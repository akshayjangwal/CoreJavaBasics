
public class InterviewMinNumber {

	public static void main(String[] args) {
		/* 2 4 5 
		   3 4 7
		   1 2 9 */
		
		int a[][]= {{2,4,5},{3,4,7},{0,2,9}};
		int temp = a[0][0];        //----------->Assuming first number of matrix is minimum
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				int b = a[i][j];
				if(b <temp)
					temp = b;
			}
		}
		System.out.println("Smallest number is "+temp);
		
	}

}
