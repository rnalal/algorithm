package basic;

import java.util.Scanner;

public class S11720 {

	public static void main(String[] args) {
		// 백준 11720
		// 숫자의 합 구하기
		Scanner sc = new Scanner(System.in);	// 먼저 scanner로 값 입력받기
		int N = sc.nextInt();					// N 값 입력하기
		String snum = sc.next();				// 길이 N의 숫자 입력하기 > snum에 저장
		char[] cnum = snum.toCharArray();		// 입력받은 숫자 snum을 char[]형 변수 cnum에 저장
		int sum = 0;							// sum값 초기화
		for(int i=0; i<cnum.length; i++) {		// i는 0부터 cnum 길이만큼 반복해 더하기
			sum += cnum[i] - '0';				// 배열의 자릿값을 아스키코드를 이용해 정수형으로 변환하고 sum에 더해 누적하기
		}
		System.out.println(sum);				// sum 출력
	}

}
