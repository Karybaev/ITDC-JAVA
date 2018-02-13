
public class Main {

	public static void main(String[] args) {
		double n = 0.0;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		n += 0.1;
		
		if (Math.abs(n - 1.0) < 0.0000001) {
			System.out.print("Верно");
	  } else {
		  System.out.print("Неверно");
	  } 

	}

}
