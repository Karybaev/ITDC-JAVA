import java.util.Scanner;

public class Task01 {

	public static void main(String[] args, int firstNumber) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("100");
		int firsNumber = scanner.nextInt();
		
		System.out.print("110");
		int secondNumber = scanner.nextInt();
		
		int result = firstNumber+ secondNumber;
		System.out.println(firstNumber + "+" + secondNumber + "=" + result);

	}

}
