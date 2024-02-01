package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S11659 {

	public static void main(String[] args) throws IOException {
		// 백준 11659
		// 구간합 구하기
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  // 숫자를 많이 입력 받을 때는 bufferedreader가 유리
		StringTokenizer st = new StringTokenizer(bf.readLine()); // bufferedreader는 개행문자로 받아옴. 한줄 공백문자로 바꾸고 싶으면 stringTokenizer 사용
		
		int suno = Integer.parseInt(st.nextToken()); // bufferedreader는 무조건 string형으로 저장되므로 int로 사용하려면 변환과정 거쳐야함
		int quizno = Integer.parseInt(st.nextToken());
		
		long[]s = new long[suno + 1]; // 배열선언, idx 1부터 시작하기 위해 +1 해줌
		st = new StringTokenizer(bf.readLine()); // 2번째줄은 한줄로 받아오기 위해서 사용
		
		// 합 배열 생성하기 ([s[i] = S[i-1] + A[i])
		for(int i=1; i<=suno; i++) {
			s[i] = s[i-1] + Integer.parseInt(st.nextToken());
		}
		
		// 질의범위 받고, 구간합 출력하기
		for(int q=0; q<quizno; q++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(s[j]-s[i-1]);
		}

	}

}
