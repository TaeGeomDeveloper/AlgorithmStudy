package N��������;

import java.util.Scanner;

/*
 * 				�ڹ� �˰��� ����
 * 										���°�
 * 				
 * 				1���� n ������ ��
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

		System.out.println("���� A���� B������ ���� ���մϴ�.");
		System.out.print("A �� �� : "); int a = stdin.nextInt();
		System.out.print("B �� �� : "); int b = stdin.nextInt();
		
		
		System.out.println(a+" ���� " + b + "������ ���� " + sumof(a,b) + "�Դϴ�.");
	}

}
