package N���Ƕ�̵�;

import java.util.Scanner;

/*
 * 				�ڹ� �˰��� ����
 * 										���°�
 * 				
 * 				N���� �Ƕ�̵�
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
	System.out.println("������ �̵ �ﰢ���� ����մϴ�.");
		
		do{
			System.out.print("�� �� �ﰢ�� �Դϱ� : "); n = stdin.nextInt();
		}while(n<=0);
		
		spira(n);
		System.out.println();
		npira(n);
		System.out.println();
	}
}
