import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   int n,result;
	       n = scanner.nextInt();
	       result = n / 100 + n % 100 / 10 + n % 100 % 10 /1;
	       System.out.print(result);
	    }

	}
