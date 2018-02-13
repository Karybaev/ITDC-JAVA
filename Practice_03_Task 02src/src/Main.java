import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите вещественное число: ");
		double nscr = scanner.nextDouble();
		double n1 = nscr;
		
		if (n1 < 0.0) {
			n1 = -n1;
		}
		
		System.out.printf("|%.3f| = %.3f", nscr, n1);
		

		}   
  }
