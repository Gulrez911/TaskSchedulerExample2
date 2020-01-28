import java.util.Scanner;

public class GCDNumberCoding {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		String strArray[] = str.split(",");
		int num1 = Integer.parseInt(strArray[0]);
		int num2 = Integer.parseInt(strArray[1]);
		while (num1 != num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		System.out.println(num2);
	}
}
