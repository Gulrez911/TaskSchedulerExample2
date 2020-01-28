import java.util.Scanner;

public class ArmstrongCoding {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int originalNum, remainder, result = 0;
		originalNum = num;
		while (originalNum != 0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, 3);
			originalNum /= 10;
		}
		if (result == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}