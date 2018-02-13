import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int h, m, s, s1;
		s = scanner.nextInt();
		h = s/60/60%24;
		m = s/60%60;
		s1 = s%60%60;
		
		System.out.printf("%d : %02d : %02d", h, m,s1);

	}

}
