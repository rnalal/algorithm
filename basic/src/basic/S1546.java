package basic;

import java.util.Scanner;

public class S1546 {
	public static void main(String args[]) {
		// 백준 1546
		// 평균 구하는 문제
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long sum = 0; int max = 0;
		
		for(int i=0; i<N; i++) {
			int score = sc.nextInt();
			if(score>max) max=score;
			sum = sum + score;
		}
		System.out.println(sum*100.0/max/N);
	}
}
