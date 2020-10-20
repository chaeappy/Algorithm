package A9.Math1;

import java.util.ArrayList;
import java.util.Scanner;

// 설탕배달 3 or 5kg 방법 찾기
public class A2839 {
	static Scanner sc = new Scanner(System.in);
	static int input = 0;
	static int sugar = 0;
	static int five = 0;
	static int three = 0;
	static int reMainder = 0;
	static int listSize = 0;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static void divide(int a) {
		input = a;
		reMainder = input % 5;
		sugar = input - reMainder;
		while (sugar != 0) {
			list.add(5);
			sugar -= 5;
		}
		
		listSize = list.size();
		
		if (reMainder % 3 == 0) {
			three = reMainder / 3;
			System.out.println(list.size() + three );
		} else if (reMainder % 3 != 0) {
			Loof1 : for (int i = 0; i < listSize; i++) {
				reMainder += list.get(0);
				list.remove(0);
				if (reMainder % 3 == 0) {
					three = reMainder / 3;
					System.out.println(list.size() + three);
					break Loof1;
				} else if (list.size() == 0 && reMainder % 3 != 0) {
					System.out.println("-1");
				}
			}	
		}
	}
	

	public static void main(String[] args) {
		int input = sc.nextInt();
		if (input % 5 == 0) {
				five = input / 5;
				System.out.println(five);
		} else if (input != 4) {
			divide(input);
		} else if (input == 4) {
			System.out.println("-1");
		
		}
	} // main


}
