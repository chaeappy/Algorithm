package A8.String;
//문제
//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
//
//입력
//첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
//
//단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
//
//출력
//입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

// "dz=" 문자때문에 시간 많이 소비함.
// 'd' 부분에 'dz=' 넣어서 에러남 --> switch 'z' 부분에 기입해 해결함.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;

		String str = br.readLine().trim();

		char[] charArr = str.toCharArray();
		if (charArr.length != 1)
			for (int i = 0; i < charArr.length; i++) {
				if (i != charArr.length - 1)
					switch (charArr[i]) {
					case 'c':
						if (charArr[i + 1] == '=' || charArr[i + 1] == '-') {
							count++;
						}
						break;
					case 'd':
						if (charArr[i + 1] == '-') {
							count++;
						} 
						break;
					case 'l':
						if (charArr[i + 1] == 'j') {
							count++;
						}
						break;
					case 'n':
						if (charArr[i + 1] == 'j') {
							count++;
						}
						break;
					case 's':
						if (charArr[i + 1] == '=') {
							count++;
						}
						break;
					case 'z':
						if (i == 0 && charArr[i + 1] == '=') {
							count++;
						} else if (i != 0 && charArr[i + 1] == '=' && charArr[i - 1] != 'd') {
							count++;
						} else if (i != 0 && charArr[i + 1] == '=' && charArr[i - 1] == 'd') {
							count += 2;
						}
						break;
					default:
						break;
					}
			}
		bw.write("" + (charArr.length - count));
		bw.flush();
		bw.close();
	}

}
