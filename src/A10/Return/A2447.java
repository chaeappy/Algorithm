package A10.Return;

import java.util.Scanner;

public class A2447 {
	static void loop() {
		if (number == 1) {
			return 1;
		} else {
			System.out.print("***");
			return number * loop(--number);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
			System.out.print("* *");
			System.out.print("***");	
		}
	}

}
