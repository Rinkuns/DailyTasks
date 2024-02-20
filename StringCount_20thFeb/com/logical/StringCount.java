package com.logical;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();

			int alphabetCount = 0;
			int digitCount = 0;
			int specialSymbolCount = 0;

			for (int i = 0; i < input.length(); i++) {
			    char ch = input.charAt(i);
			    if (Character.isLetter(ch)) {
			        alphabetCount++;
			    }
			    else if (Character.isDigit(ch)) {
			        digitCount++;
			    }
			    else {
			        specialSymbolCount++;
			    }
			}

			System.out.println("Alphabets: " + alphabetCount);
			System.out.println("Digits: " + digitCount);
			System.out.println("Special symbols: " + specialSymbolCount);
		}
	}
}
