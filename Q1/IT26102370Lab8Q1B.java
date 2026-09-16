import java.util.Scanner;  //javac IT26102370Lab8Q1B.java
public class IT26102370Lab8Q1B{
	public static void main(String[]args){
	
		Scanner input =new Scanner(System.in);
		
		int[] myArray =new int[5];
		int i;
		int j;
		int[] evenArray = new int[5];
		
		System.out.println("Enter 5 numbers: ");
		
		for (i=0; i<myArray.length; i++){
			
			System.out.print("Enter number "+(i+1)+ ":");
			myArray[i]=input.nextInt();	
			
		}
		
		System.out.println();
		System.out.println("myArray content");
	
		for(i=0; i<myArray.length; i++){
	
			System.out.print(myArray[i] + "\t");
		}
		
		System.out.println("\n");
		System.out.println("evenArray contents: ");
		
	    j=0;
		for(i=0; i<myArray.length; i++){
			if(myArray[i]%2==0){
				evenArray[j] = myArray[i];
				j++;
			}
		}
		for(i=0; i<evenArray.length; i++){
			System.out.print(evenArray[i]+"\t");
		}
			
}
}