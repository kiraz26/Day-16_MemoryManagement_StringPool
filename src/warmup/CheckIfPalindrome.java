package warmup;

import java.util.Scanner;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to check if palindrome");
		String word = input.next();
		String reversed = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i) ;
		}
		
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is a palindrome");

		} else {
			System.out.println("It is not a palindrome");

		}
	}

}
