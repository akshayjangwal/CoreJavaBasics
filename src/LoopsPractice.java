
public class LoopsPractice {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			System.out.println("outer loop");
			
			for(int j=0;j<4;j++) {
				System.out.println("inner loop");
			}
			System.out.println("Cycle completed");
		}
		/*int k=1; 
		for(int i=0;i<4;i++) {                        //No. of Rows
						
			for(int j=1;j<=4-i;j++) {
				System.out.print(" "+k+" ");
				k++;
				
			}
			System.out.println("");                   //Go to the next line
			
		} */
		
		
}
}
