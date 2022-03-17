package 최대값구하기;

/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				세 값의 최대 값
 */

import java.util.Scanner;


// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println(" 세 정수의 최댓값을 구합니다. ");
		System.out.print("a 의 값은 : ");	int a = stdIn.nextInt();
		System.out.print("b 의 값은 : ");	int b = stdIn.nextInt();
		System.out.print("c 의 값은 : ");	int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println(" 최대값은 "+max + "입니다.");
	}

}
