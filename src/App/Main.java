package App;


import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int userInput;
	static int attempts = 3;
	static int totalNumToGuess = 0;

	private static int getRandom(int userOption) {
		Random rnd = new Random();
		int num = rnd.nextInt(userOption);

		return num;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to guess the number game!");
		System.out.println("Insert your number limit...");

		int num = Main.getRandom(sc.nextInt());
		System.out.println("The computer has picked a number, now its your turn...");
		System.out.println("Please insert your number...");

		while (true) {

			if (attempts == 0) {
				System.out.println("Sorry you have no more attempts left.");
				break;
			}
			System.out.println("You have " + attempts + " attempts left.");
			userInput = sc.nextInt();

			if (num == userInput) {
				System.out.println("Good job you guessed the number!\nIt took you: " + totalNumToGuess + " guesses.");
				break;
			} else if (num < userInput) {
				System.out.println("Your guess is bigger than the number.");
				totalNumToGuess++;
				attempts--;
			} else {
				System.out.println("Your number is smaller than the number.");
				totalNumToGuess++;
				attempts--;
			}

		}
		sc.close();
		System.out.println("Game exited");

	}

}