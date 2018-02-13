import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s = scanner.nextInt();
		int h = s/60%24;
		int m = s%60;
	
		
		System.out.print(h + " " + m);
		
		
	}
	
}	