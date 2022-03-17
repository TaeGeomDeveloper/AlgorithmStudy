package �����̵�ﰢ��;

import java.util.Scanner;

/*
 * 				�ڹ� �˰��� ����
 * 										���°�
 * 				
 * 				���� �Ʒ��� ������ �̵ �ﰢ���� ����դ���.
 */

class TriangleLB {
	
	static void triangleLB(int n) {					// ���� �Ʒ��� ������ �̵ �ﰢ���� ���
		for(int i = 1; i <= n; i++) {
			for( int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {					// ���� ���� ������ �̵ �ﰢ���� ���
		for(int i = 1; i <= n; i++) {
			for( int j = n; j >= i; j--)
				System.out.print('*');
			System.out.println();
		}
	}
	static void triangleRU(int n) {					// ������ ���� ������ �̵ �ﰢ���� ���
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k < i; k++)
				System.out.print(' ');
			for( int j = n; j >= i; j--)
				System.out.print('*');
			System.out.println();
		}
	}
	static void triangleRB(int n) {					// ������ �Ʒ��� ������ �̵ �ﰢ���� ���
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
		
		System.out.println("������ �̵ �ﰢ���� ����մϴ�.");
		
		do{
			System.out.print("�� �� �ﰢ�� �Դϱ� : "); n = stdin.nextInt();
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
