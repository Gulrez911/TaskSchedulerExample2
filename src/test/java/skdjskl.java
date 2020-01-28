import java.util.Scanner;

class CodingExercise {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.print("enter first number:");
		int num1=reader.nextInt();
		System.out.print("enter second number:");
		int num2=reader.nextInt();
		reader.close();
		while(num1 !=num2){    
			if(num1>num2)    
				num1=num1-num2;    
			else    num2=num2-num1;}
		System.out.printf("GCD",num2);
		String str = reader.nextLine();
	}
}
