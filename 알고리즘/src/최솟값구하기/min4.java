package 최솟값구하기;
/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				네 값의 최소 값
 */

import java.util.Scanner;

class min4 {
	// 4개의 최숫값을 입력하고 최소값을 구합니다.

	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println(" 네 정수의 최솟값을 구합니다. ");
	System.out.print("a 의 값은 : ");	int a = stdIn.nextInt();
	System.out.print("b 의 값은 : ");	int b = stdIn.nextInt();
	System.out.print("c 의 값은 : ");	int c = stdIn.nextInt();
	System.out.print("d 의 값은 : ");	int d = stdIn.nextInt();
	
	int min = a;
	if(b < min) min = b;
	if(c < min) min = c;
	if(d < min)	min = d;
	
	System.out.println("네 정수의 최솟값은 : "+min+" 입니다.");
	}
}
