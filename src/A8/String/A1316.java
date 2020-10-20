package A8.String;
//문제
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//출력
//첫째 줄에 그룹 단어의 개수를 출력한다.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class A1316 {
	static char[] charArr = null;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<String> list = new ArrayList<String>();
	static String input = null;
	static int groupNum = 0;
	static int count = 0;
	
	static void addList(char[] charArr) {
		char[] charArr2 = charArr;
		list.add("" + charArr2[0]);
		for (int i = 0; i < charArr2.length - 1; i++) {
			if (charArr2[i] != charArr2[i + 1]) {
				list.add("" + charArr2[i + 1]);
			}
		}
	}
	
	static void check() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i; j < list.size() - 1 ; j++) {
				if (list.get(i).equals(list.get(j + 1))) {
					count++;
				}
			}
		}
		if (count == 0) {
			groupNum ++;
		}
		count = 0;
		list.clear();
	}
	
	public static void main(String[] args) throws IOException {
		
		String howMany = br.readLine().trim();
		for (int i = 0; i < Integer.parseInt(howMany); i++) {
			input = br.readLine();
			charArr = input.toCharArray();
			addList(charArr);
			check();
		
		}
		bw.write("" + groupNum);
		bw.flush();
		bw.close();
	}
}
