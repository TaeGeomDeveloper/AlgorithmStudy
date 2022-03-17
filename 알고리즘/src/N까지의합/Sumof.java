package N까지의합;

import java.util.Scanner;

/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				1부터 n 까지의 합
 */

class Sumof {

	static int sumof(int a, int b)
	{
		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("정수 A부터 B까지의 합을 구합니다.");
		System.out.print("A 의 값 : "); int a = stdin.nextInt();
		System.out.print("B 의 값 : "); int b = stdin.nextInt();
		
		
		System.out.println(a+" 부터 " + b + "까지의 합은 " + sumof(a,b) + "입니다.");
	}

}
