package day02;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Ŀ��");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. ����������");
		System.out.println("4. �������");
		System.out.print("���� : ");
		int num=input.nextInt();
		if(num == 1) {
			System.out.println("�Ƹ޸�ī�� ���Խ��ϴ�");
		}
		if(num == 2) {
			System.out.println("ī��� ���Խ��ϴ�");
		}
		if(num == 3) {
			System.out.println("���������� ���Խ��ϴ�");
		}
		if(num == 4) {
			System.out.println("������� ���Խ��ϴ�");
		}
		if(num != 1 && num != 2 && num != 3 && num != 4) {
			System.out.println("�߸��� �����Դϴ�");
		}
		
	}

}
