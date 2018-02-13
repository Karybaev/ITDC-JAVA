import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int n1 = scanner.nextInt();
	    int result = n1 / 100 + n1 % 100/10 + n1%100%10/1;
		System.out.print(result);

	}

}
