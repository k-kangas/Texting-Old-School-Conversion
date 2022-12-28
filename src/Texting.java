/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Texting Old-School
 */

import java.util.Scanner;

public class Texting {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program inputs a word, randomly selects a letter from that word, and displays the corresponding digit from the standard telephone keypad\n\n");

		//Input a word from user.
		System.out.print("Enter a word: ");
		String s = input.nextLine().toUpperCase();

		// Chooses a random number from 0 to length of string).
		int randomNum = (int)(Math.random() * s.length());

		// Assigns the letter/character for the corresponding spot of the number picked in the string & displays it.
		char ch = s.charAt(randomNum);
		System.out.println("\nA random letter from that word is: " + ch);

		// Determines & Displays the phone keypad digit for the random letter picked.
		int matchingDigit = 0;
		char key2 = 'A', key3 = 'D', key4 = 'G', key5 = 'J', key6 = 'M', key7 = 'P', key8 = 'T', key9 = 'W';
		if (ch < key3){
			matchingDigit = 2;
		}
		else if (ch < key4) {
			matchingDigit = 3;
		}
		else if (ch < key5) {
			matchingDigit = 4;
		}
		else if (ch < key6) {
			matchingDigit = 5;
		}
		else if (ch < key7) {
			matchingDigit = 6;
		}
		else if (ch < key8) {
			matchingDigit = 7;
		}
		else if (ch < key9) {
			matchingDigit = 8;
		}else {
			matchingDigit = 9;
		}
		System.out.println("\nThe corresponding digit on the phone keypad is: " + matchingDigit);

		// Extra Credit
		int NumberOfTimesKeyPressed = 0;
		switch(ch)
		{
		case 'A':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'B':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'C':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'D':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'E':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'F':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'G':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'H':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'I':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'J':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'K':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'L':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'M':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'N':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'O':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'P':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'Q':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'R':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'S':
			NumberOfTimesKeyPressed = 4;
			break;
		case 'T':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'U':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'V':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'W':
			NumberOfTimesKeyPressed = 1;
			break;
		case 'X':
			NumberOfTimesKeyPressed = 2;
			break;
		case 'Y':
			NumberOfTimesKeyPressed = 3;
			break;
		case 'Z':
			NumberOfTimesKeyPressed = 4;
			break;
		default:
			System.out.println("\n");
			break;
		}
		System.out.println("\nThe " + matchingDigit + " key must be pressed " + NumberOfTimesKeyPressed + " time(s) to get the letter " + ch + ".");

		// END OF PROGRAM
	}
}

