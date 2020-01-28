import java.util.Scanner;

public class PrimeNumberExercise {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean flag = false;
		int number = reader.nextInt();
		for (int i = 2; i < number / 2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
