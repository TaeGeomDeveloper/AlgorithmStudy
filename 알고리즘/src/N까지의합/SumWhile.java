package N��������;

import java.util.Scanner;

/*
 * 				�ڹ� �˰��� ����
 * 										���°�
 * 				
 * 				1���� n ������ ��
 */


public class SumWhile {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");  int n = stdin.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(" 1���� "+ n +"������ ���� "+ sum + "�Դϴ�.");
	}

}
