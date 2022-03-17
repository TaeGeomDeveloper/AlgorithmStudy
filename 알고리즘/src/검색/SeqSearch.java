package 검색;

import java.util.Scanner;

/*
 * 				자바 알고리즘 공부
 * 										윤태검
 * 				
 * 				요솟수가 n인 배열 a에서 Key와 같은 요소를 선형 검색 합니다.
 */

class SeqSearch {

	static int seqSerch(int a[], int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1;	// 검색 실패 (-1을 반환)
			if(a[i] == key)
				return i;	// 검색 성공{ 인덱스를 반환)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdin.nextInt();
		int x[] = new int[num];			// 요솟수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdin.nextInt();
		}
		
		System.out.println("검색할 값 : ");	// 키 값을 입력
		int ky =stdin.nextInt();
		int idx = seqSerch(x, num, ky);	// 배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은 X["+idx+"]에 있습니다.");
	}

}
