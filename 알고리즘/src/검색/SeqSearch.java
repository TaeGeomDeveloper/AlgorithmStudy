package �˻�;

import java.util.Scanner;

/*
 * 				�ڹ� �˰��� ����
 * 										���°�
 * 				
 * 				��ڼ��� n�� �迭 a���� Key�� ���� ��Ҹ� ���� �˻� �մϴ�.
 */

class SeqSearch {

	static int seqSerch(int a[], int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1;	// �˻� ���� (-1�� ��ȯ)
			if(a[i] == key)
				return i;	// �˻� ����{ �ε����� ��ȯ)
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdin.nextInt();
		int x[] = new int[num];			// ��ڼ��� num�� �迭
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdin.nextInt();
		}
		
		System.out.println("�˻��� �� : ");	// Ű ���� �Է�
		int ky =stdin.nextInt();
		int idx = seqSerch(x, num, ky);	// �迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"�� X["+idx+"]�� �ֽ��ϴ�.");
	}

}
