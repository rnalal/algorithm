package basic;

import java.util.Scanner;

public class S2018 {
	// 백준 2018
	// 수들의 합 - 투포인터
	// 투포인터 : 2개의 알고리즘의 시간 복잡도를 최적화함
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index!=N) {
			if(sum==N) {
				count++; end_index++; sum = sum + end_index;
			}else if(sum>N) {
				sum = sum - start_index;
				start_index++;
			}else {
				end_index++; sum = sum + end_index;
			}
			System.out.println(count);
		}
		
	}
}
