import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ��������? ");
		int a = scanner.nextInt();
		System.out.print("������ ��������? ");
		int b = scanner.nextInt();
		System.out.printf("�� ������������: a = %d; b = %d;%n", a, b);
		
		// TODO: ��������� ������������ ����������
		int temp = a;
		a = b;
		b = a;
		

		System.out.printf("����� ������������: a = %d; b = %d;%n", a, b);
	}

}
