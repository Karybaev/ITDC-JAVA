import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.print("Как вас зовут? ");
		String name = scanner.nextLine();
		
		System.out.println("Привет, " + name);
		System.out.print("Как у вас дела? ");
		String horosho = scanner.nextLine();
		System.out.print("Сколько вам лет? ");
		int old = scanner.nextInt();
		System.out.println("Я калькулятор, который работает на сложение!");*/
		
		int n1, n2, n3,n4,n5;
		System.out.print("Введите первое число ");
		n1 = n2 = scanner.nextInt();
		System.out.print("Введите второе число ");
		n3 = n4 = n5 = scanner.nextInt();
		/*n2 = scanner.nextInt()*/;
		System.out.print("Сумма сложения: " +( n1*2 + n5*3)  );
	}
}
