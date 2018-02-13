import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите число A ");
		long numberA = scanner.nextLong();
		
		System.out.println("¬ведите число B ");
		long numberB = scanner.nextLong();
		
		System.out.println("¬ведите число C ");
		long numberC = scanner.nextLong();
		
		long result = numberA*numberB*numberC;
		System.out.println("—умма сложени€ будет;\n " + result);
		
		

	}

}
