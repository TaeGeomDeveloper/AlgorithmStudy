package N까지의합;

import java.util.Scanner;

/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				1부터 n 까지의 합
 */


public class SumWhile {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");  int n = stdin.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(" 1부터 "+ n +"까지의 합은 "+ sum + "입니다.");
	}

}
