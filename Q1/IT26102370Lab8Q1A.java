import java.util.Scanner;  //javac IT26102370Lab8Q1A.java
public class IT26102370Lab8Q1A{
	public static void main(String[]args){
	
		Scanner input =new Scanner(System.in);
		
		int[] myArray =new int[5];
		int i;
		
		System.out.println("Enter 5 numbers: ");
		
		for (i=0; i<myArray.length; i++){
			System.out.print("Enter number "+(i+1)+ ":");
			myArray[i]=input.nextInt();	
		}
		
		System.out.println();
		System.out.println("Arrays in Reversed order: ");
	
		for(i=myArray.length-1;i>=0; i--){
	
			System.out.print(myArray[i] + "\t");
		}
	}
			
}
