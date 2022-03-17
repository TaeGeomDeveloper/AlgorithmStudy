package N단피라미드;

import java.util.Scanner;

/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				N단의 피라미드
 */

 class nPira {

	static void spira(int n)
	{
		for(int i = 1; i <= n; i++) {
			for(int k = n; k > i; k--)
				System.out.print(' ');
			for( int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void npira(int n) {
		int num = 1;
		for(int i = 1; i <= n; i++) {
			for(int k = n; k > i; k--)
				System.out.print(' ');
			for( int j = 1; j <= 2*i-1; j++)
				System.out.print(num);
			num++;
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
		
		spira(n);
		System.out.println();
		npira(n);
		System.out.println();
	}
}
