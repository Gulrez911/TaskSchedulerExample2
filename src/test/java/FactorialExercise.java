import java.util.Scanner;

public class FactorialExercise {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int str = reader.nextInt();
		int fact = 1;
		while (str > 0) {
			fact = fact * str;
			str--;
		}
		System.out.println(fact);
	}

}