import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ����������� ��������? ");
        int minimum = scanner.nextInt();
        System.out.print("������� ������������ ��������? ");
        int maximum = scanner.nextInt();

        int random = (int) (minimum + Math.random() * (maximum - minimum + 1));
        System.out.printf("�������� ����� �� %d �� %d: %d\n", minimum, maximum, random);
    }

}
