import java.util.Scanner;  //javac IT26102370Lab8Q3.java
public class IT26102370Lab8Q3{
	
	public static void main(String[]args){
	
		Scanner input =new Scanner(System.in);
		int[] number= new int[6];
		int count=0;
		int num;
		int max=number[0];
		int i;
		while(count<6){
			
			System.out.print("enter positive number ("+(count+1)+"/6): ");
			num=input.nextInt();
		
			if(num>0){
				number[count]=num;
				count = count + 1;
				
			
			}else{
				
				System.out.println("enter positive numbers");
			}
			
			
			
			for(i =1 ; i<number.length; i++){
				if (number[i] >max){
				max = number[i];
				}
			}
		}
		System.out.println("\n");
		
		System.out.println("array contents");
			for(i=0; i<number.length; i++){
			System.out.print(number[i] + "\t");
			}
		System.out.println();
		System.out.println("The maximum number Entered: "+  max);
		
		
	}
}