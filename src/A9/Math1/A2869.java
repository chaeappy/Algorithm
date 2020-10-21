package A9.Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2869 {
	static int tired (double[] doubleArr) {
		double day = 0;
		if ((doubleArr[2] - doubleArr[0]) % (doubleArr[0] - doubleArr[1]) != 0) {
			day = ((doubleArr[2] - doubleArr[0]) / (doubleArr[0] - doubleArr[1])) + 2;
			
		} else {
			day = ((doubleArr[2] - doubleArr[0]) / (doubleArr[0] - doubleArr[1])) + 1;
		}
		return (int) day;
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String msg = br.readLine();
		String[] strArr = msg.split(" ");
		double[] doubleArr = new double[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			doubleArr[i] = Integer.parseInt(strArr[i]);
		}
		
		
		int dday = tired(doubleArr);
		bw.write(dday + "");
		bw.flush();
		bw.close();
		
		
	}

}