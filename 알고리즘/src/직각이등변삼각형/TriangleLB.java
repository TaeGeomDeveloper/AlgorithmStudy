package 직각이등변삼각형;

import java.util.Scanner;

/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				왼쪽 아래가 직각인 이등변 삼각형을 출력합ㄴ디ㅏ.
 */

class TriangleLB {
	
	static void triangleLB(int n) {					// 왼쪽 아래가 직각인 이등변 삼각형을 출력
		for(int i = 1; i <= n; i++) {
			for( int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {					// 왼쪽 위가 직각인 이등변 삼각형을 출력
		for(int i = 1; i <= n; i++) {
			for( int j = n; j >= i; j--)
				System.out.print('*');
			System.out.println();
		}
	}
	static void triangleRU(int n) {					// 오른쪽 위가 직각인 이등변 삼각형을 출력
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k < i; k++)
				System.out.print(' ');
			for( int j = n; j >= i; j--)
				System.out.print('*');
			System.out.println();
		}
	}
	static void triangleRB(int n) {					// 오른쪽 아래가 직각인 이등변 삼각형을 출력
		for(int i = 1; i <= n; i++) {
			for(int k = n; k > i; k--)
				System.out.print(' ');
			for( int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n;
		
		System.out.println("직각인 이등변 삼각형을 출력합니다.");
		
		do{
			System.out.print("몇 단 삼각형 입니까 : "); n = stdin.nextInt();
		}while(n<=0);
		
		triangleLB(n);
		System.out.println();
		
		triangleLU(n);
		System.out.println();
		
		triangleRU(n);
		System.out.println();

		triangleRB(n);
		System.out.println();

	}
}
