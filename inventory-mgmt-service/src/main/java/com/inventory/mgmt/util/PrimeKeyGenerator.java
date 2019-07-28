package com.inventory.mgmt.util;

import java.util.Random;

public class PrimeKeyGenerator {
	
	public static String generatePrimeKey(String letter) {
		Random rnd = new Random();
		char[] digits = new char[9];
		digits[0] = (char) (rnd.nextInt(7) + '1');
		for (int i = 1; i < digits.length; i++) {
			digits[i] = (char) (rnd.nextInt(8) + '0');
		}
		return letter + new String(digits);
	}
	
	public static int generateIntId() {
		Random rnd = new Random();
		int number = rnd.nextInt(4);		
		return number;
	}

}
