package A9.Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2869 {
	static void howManyDays(int[] intArr) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int day = 0;
		
		while (intArr[0] + ((intArr[0] - intArr[1]) * day) < intArr[2]) {
			day++;
		}
		
		bw.write((day + 1) + "");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = br.readLine();
		String[] strArr = msg.split(" ");
		int[] intArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		howManyDays(intArr);
		
	}

}


