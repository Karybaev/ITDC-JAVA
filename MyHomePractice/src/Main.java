import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.print("��� ��� �����? ");
		String name = scanner.nextLine();
		
		System.out.println("������, " + name);
		System.out.print("��� � ��� ����? ");
		String horosho = scanner.nextLine();
		System.out.print("������� ��� ���? ");
		int old = scanner.nextInt();
		System.out.println("� �����������, ������� �������� �� ��������!");*/
		
		int n1, n2, n3,n4,n5;
		System.out.print("������� ������ ����� ");
		n1 = n2 = scanner.nextInt();
		System.out.print("������� ������ ����� ");
		n3 = n4 = n5 = scanner.nextInt();
		/*n2 = scanner.nextInt()*/;
		System.out.print("����� ��������: " +( n1*2 + n5*3)  );
	}
}
