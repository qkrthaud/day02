package day02;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�� �� �Է� : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.print(" + - * / �� �ϳ��� ��ȣ �Է� : ");
		String s=input.next();
		String a,b,c,d;
		a="+";
		b="-";
		c="*";
		d="/";
		if (s==a) {
			System.out.println(s+"="+(num1+num2));
		}
		if (s==b) {
			System.out.println(s+"="+(num1-num2));
		}
		if (s==c) {
			System.out.println(s+"="+(num1*num2));
		}
		if (s==d) {
			System.out.println(s+"="+(num1/num2));
		}
		if (s!=a&&s!=b&&s!=c&&s!=d) {
			System.out.println("�߸��� �Է��Դϴ�");
			
		}
		
//		System.out.print("���� ���� �Է� : ");
//		int kor=input.nextInt();
//		System.out.print("���� ���� �Է� : ");
//		int eng=input.nextInt();
//		System.out.print("���� ���� �Է� : ");
//		int math=input.nextInt();
//		double avg=(kor+eng+math)/3.0;
//		if (avg>=60&&kor>=60&&eng>=60&&math>=60) {
//			System.out.println("���");
//		}
//		if (avg<60) {
//			System.out.println("���հ�");
//		}
//		if (kor<60) {
//			System.out.println("���� �����");
//		}
//		if (eng<60) {
//			System.out.println("���� �����");
//		}
//		if (math<60) {
//			System.out.println("���� �����");
//		}
//		
//		System.out.print("���� �Է� : ");
//		int su1=input.nextInt();
//		if (su1%5==0) {
//			System.out.println("5�� ���");
//			
//		}
//		if (su1%5!=0) {
//			System.out.println("5�� ��� �ƴ�");
//			
//		}
	}

}
