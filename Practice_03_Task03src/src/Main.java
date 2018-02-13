import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¬ведите первое число: ");
		int n1 = scanner.nextInt();
		System.out.print("¬ведите второе число: ");
		int n2 = scanner.nextInt();
		
		if (n1 > n2) {
			System.out.printf("ѕервое число %d  больше второго числа %d", n1, n2);
		} else if (n1 == n2) {
				System.out.printf("ѕервое число %d равно второму числу %d", n1, n2);
			} else {
			System.out.printf("¬торое число %d больше первого числа %d", n2, n1);
		}
		
	}

}
