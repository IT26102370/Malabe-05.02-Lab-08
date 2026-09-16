import java.util.Scanner; 	//javac IT26102370Lab8Q2.java
public class IT26102370Lab8Q2{
	public static void main(String[]args){
		int[] A ={10, 20, 30, 40, 50};
		int[] B ={34, 67, 12, 89, 12};
		int[] C = new int[5];
	    int i;
		
	Scanner input =new Scanner(System.in);
		System.out.println("A Array Contents:");
		for ( i = 0; i < A.length; i++) {

			System.out.print(A[i] + " ");
		}
	
		System.out.println("\n");
		System.out.println("B Array Contents:");
		
		for ( i = 0; i < B.length; i++) {

			System.out.print(B[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Array Contents (A + B):");
		
		for ( i = 0; i < A.length; i++) {
		C[i] = A[i] + B[i];
		}
		
		for ( i = 0; i < C.length; i++) {

			System.out.print(C[i] + " "); 
		}
	}
}