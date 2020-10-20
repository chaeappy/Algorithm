package A8.String;
//문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[26];
		int max = 0;
		int index = 0;
		int count = 0;
		
		String str = br.readLine().toUpperCase();
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			arr[(int)charArr[i]-65] ++;
		}
		
		max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			} 
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (charArr.length == 1) {
				break;
			} else if (max == arr[i])
				count ++;
		}
		
		switch (count) {
			case 0 :
				bw.write(charArr[0]);
				bw.flush();
				bw.close();
				break;
			case 1 :
				bw.write((char)index+65);
				bw.flush();
				bw.close();

				break;
			default :
				bw.write("?");
				bw.flush();
				bw.close();
				break;
		}
	} // main
}
