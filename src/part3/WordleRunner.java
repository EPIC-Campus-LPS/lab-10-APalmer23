package part3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class WordleRunner {
	static String[] words = new String[190];
	static boolean correct = false;
	static String answers;

	public static void main(String[] args) throws IOException {
		File file = new File("words.txt");
		Scanner sc = new Scanner(file);
		int c = 0;
		while (sc.hasNextLine()) {
			words[c] = sc.nextLine();
			c++;
		}
		answers = words[(int) (Math.random() * 190)].toUpperCase();
		sc.close();
		Scanner scan = new Scanner(System.in);
		// intro
		System.out.println("Welcome to Wordle!\n\nIn this game you will guess a secret 5 letter word.");
		// main
		while (!correct) {
			System.out.print("\nGuess the secret word: ");
			for (int i = 0; i < 5; i++) {
				System.out.print(currentx[i] + " ");
			}
			System.out.print("\nYour guess:");
			String s = scan.nextLine();
			guess(s);
			for (int i = 0; i < 5; i++) {
				System.out.print(current[i] + " ");
			}
			System.out.print("\n");
		}
		// final
		System.out.println("\nCorrect!");
		scan.close();
	}

	static String[] current = { "_", "_", "_", "_", "_" };
	static String[] currentx = { "_", "_", "_", "_", "_" };

	public static void guess(String str) {
		String[] answera = answers.split("");
		String[] guess = new String[5];
		if (str.toUpperCase().equals(answers))
			correct = true;
		guess = str.toUpperCase().split("");
		for (int i = 0; i < 5; i++) {
			current[i] = "_";
			if (guess[i].toUpperCase().equals(answera[i])) {
				current[i] = "*";
				currentx[i] = answera[i];
			} else if (answers.contains(guess[i].toUpperCase()))
				current[i] = "!";
		}
	}
}