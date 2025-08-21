package pack;
import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String input = scan.nextLine();
		String[] words = input.split(" ");
		int amount = 0;
		int occ = 0;
		String big = words[0];
		String small = words[0];
		for (String word : words) {
			amount ++;
			if (word.equals("the")) {
				occ ++;
			}
			if ( (big.length()) < word.length()) {
				big = word;
			}
			if ( (small.length()) > word.length()) {
				small = word;
			}
			
		}
		System.out.println("Number of words: "+amount);
		System.out.println("Longest word: "+big);
		System.out.println("Shortest word: "+small);
		System.out.println("Occurrences of \"the\": "+occ);
		

	}

}
