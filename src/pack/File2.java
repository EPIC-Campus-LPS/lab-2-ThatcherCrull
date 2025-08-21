package pack;
import java.util.Scanner;
public class File2 {

	public static boolean game() {
		Scanner scan = new Scanner(System.in);
		int num = (int) ((Math.random() * 100) + 1);
		double ans = (double) (Math.sqrt(num));
		System.out.print("What's the square root of "+num+"? ");
		double g = scan.nextDouble();
		
		if (g == ans) {
			System.out.print("Nice job! \n");
			return true;
		} else {
			System.out.print("So close, it's "+ans+"\n");
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Welcome to the Guess the Square Root Game! \n");
		int right = 0;
		
		for (int i = 0; i <= 2; i++) {
			boolean game = File2.game();
			if (game) {
				right ++;
			}
		}
		
		System.out.print("\nYou got "+right+"/3.");
		
		

	}

}
