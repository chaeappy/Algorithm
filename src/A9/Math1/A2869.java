package A9.Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2869 {
	static void howManyDays(int[] intArr) {
		int day = 0;
		int meter = 0;
		
		while (intArr[0] < intArr[2]) {
			day++;
			System.out.println(day);
			meter = intArr[0] * day;
			if (intArr[0] < intArr[2]) {
				break;
			}
			meter = meter - intArr[1];
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String msg = br.readLine();
		String[] strArr = msg.split(" ");
		int[] intArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		howManyDays(intArr);
	}

}
