import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ����� A ");
		long numberA = scanner.nextLong();
		
		System.out.println("������� ����� B ");
		long numberB = scanner.nextLong();
		
		System.out.println("������� ����� C ");
		long numberC = scanner.nextLong();
		
		long result = numberA*numberB*numberC;
		System.out.println("����� �������� �����;\n " + result);
		
		

	}

}
