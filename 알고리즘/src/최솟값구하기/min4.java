package �ּڰ����ϱ�;
/*
 * 				�ڹ� �˰��� ����
 * 										���°�
 * 				
 * 				�� ���� �ּ� ��
 */

import java.util.Scanner;

class min4 {
	// 4���� �ּ����� �Է��ϰ� �ּҰ��� ���մϴ�.

	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println(" �� ������ �ּڰ��� ���մϴ�. ");
	System.out.print("a �� ���� : ");	int a = stdIn.nextInt();
	System.out.print("b �� ���� : ");	int b = stdIn.nextInt();
	System.out.print("c �� ���� : ");	int c = stdIn.nextInt();
	System.out.print("d �� ���� : ");	int d = stdIn.nextInt();
	
	int min = a;
	if(b < min) min = b;
	if(c < min) min = c;
	if(d < min)	min = d;
	
	System.out.println("�� ������ �ּڰ��� : "+min+" �Դϴ�.");
	}
}
