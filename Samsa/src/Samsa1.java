import java.util.Scanner;

public class Samsa1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println(" ������� ����� �����: ");
		int chek = scanner.nextInt();
		System.out.println("������� ���������� ��������: ");
		int mens = scanner.nextInt();
		double s =  1.0 * chek / mens;
		System.out.println("����� �� ������� %d" + s);
	}

}
