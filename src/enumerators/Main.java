package enumerators;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		USCurrency coins [] = new USCurrency[3];
		coins[0] = USCurrency.DIME;
		coins[1] = USCurrency.NICKLE;
		coins[2] = USCurrency.QUARTER;
		float sum = 0;
		for (USCurrency coin:coins) {
			System.out.println(coin.name);
			sum += coin.value;
		}
		System.out.println(sum);
	}
;}
