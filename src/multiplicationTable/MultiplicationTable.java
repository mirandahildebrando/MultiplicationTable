package multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** Welcome to the multiplication table program **");
		System.out.println("Enter the number to do the multiplication table: ");

		int n = scanner.nextInt();
		
		for (int i=0; i < 11; i++) {
			int result = n * i;
			System.out.println(n + "X" + i + "=" + result);
			
		}
	}

}
