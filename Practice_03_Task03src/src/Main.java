import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ������ �����: ");
		int n1 = scanner.nextInt();
		System.out.print("������� ������ �����: ");
		int n2 = scanner.nextInt();
		
		if (n1 > n2) {
			System.out.printf("������ ����� %d  ������ ������� ����� %d", n1, n2);
		} else if (n1 == n2) {
				System.out.printf("������ ����� %d ����� ������� ����� %d", n1, n2);
			} else {
			System.out.printf("������ ����� %d ������ ������� ����� %d", n2, n1);
		}
		
	}

}
