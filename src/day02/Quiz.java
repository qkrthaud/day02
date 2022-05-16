package day02;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.print(" + - * / 중 하나의 기호 입력 : ");
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
			System.out.println("잘못된 입력입니다");
			
		}
		
//		System.out.print("국어 점수 입력 : ");
//		int kor=input.nextInt();
//		System.out.print("영어 점수 입력 : ");
//		int eng=input.nextInt();
//		System.out.print("수학 점수 입력 : ");
//		int math=input.nextInt();
//		double avg=(kor+eng+math)/3.0;
//		if (avg>=60&&kor>=60&&eng>=60&&math>=60) {
//			System.out.println("통과");
//		}
//		if (avg<60) {
//			System.out.println("불합격");
//		}
//		if (kor<60) {
//			System.out.println("국어 재시험");
//		}
//		if (eng<60) {
//			System.out.println("영어 재시험");
//		}
//		if (math<60) {
//			System.out.println("수학 재시험");
//		}
//		
//		System.out.print("정수 입력 : ");
//		int su1=input.nextInt();
//		if (su1%5==0) {
//			System.out.println("5의 배수");
//			
//		}
//		if (su1%5!=0) {
//			System.out.println("5의 배수 아님");
//			
//		}
	}

}
