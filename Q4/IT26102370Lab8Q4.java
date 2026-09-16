import java.util.Scanner; //javac IT26102370Lab8Q4.java
public class IT26102370Lab8Q4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int[] studentArray= new int[8];
		int userInput;
		int searchID;
		boolean status=true;
		boolean found=false;
		int i;
		
		for(i=0; i<studentArray.length; i++){
			while (status){
				System.out.print("Enter student ID for student"+(i+1)+":");
				userInput=input.nextInt();
				
				if (userInput>0){
					studentArray[i]=userInput;
					break;
				}else{
					System.out.println("Error: Please Enter ONLY Positive Numbers");
				}
			}	
		}
		System.out.println();
			
		System.out.print("Enter a Student ID to Search: ");
		searchID = input.nextInt();
		
		for(i=0; i<studentArray.length; i++){
			if(studentArray[i]== searchID){
				found=true;
				break;
			}
		}
		System.out.println();
		
		if(found){
			System.out.println("Student is Available");
		}else{
			System.out.println("Student is not Available");
		}
	}
	}