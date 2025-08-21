package pack;
import java.util.Scanner;
public class File3 {
	public static boolean max(int num1, int num2) {
		if (num1 > num2) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean max(double num1, double num2) {
		if (num1 > num2) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean max(int num1, double num2) {
		if (num1 > num2) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean max(double num1, int num2) {
		if (num1 > num2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int ans1 = 4;
		int ans2 = 6;
		double ans3 = 5.6;
		double ans4 = 10.1;
		
		if (File3.max(ans3, ans4)) {
			System.out.print(ans3+" is larger.");
		}

	}

}
