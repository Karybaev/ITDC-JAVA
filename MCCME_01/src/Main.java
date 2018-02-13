import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);		
		int n1 = src.nextInt();
		System.out.println("The next number for the number " + n1 + " is " + (n1 + 1) + "." );
		System.out.println("The previous number for the number " + n1 + " is " + (n1 - 1) + ".");

	}

}
