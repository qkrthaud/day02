package day02;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		num1=input.nextInt();
		String su1= (num1%2==0)?"짝수":"홀수";
		String su2= (num1%3==0)?"3의 배수이다":"3의 배수가 아니다";
		
		System.out.println(num1+" = "+su1);
		System.out.println(num1+" = "+su2);
		System.out.print("두 수 입력 : ");
		num2=input.nextInt();
		num3=input.nextInt();
		System.out.println("num1 : "+num2+", num2 : "+num3);
		String su3=(num2>num3)?"num1가 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(su3);
		
		
	}

}
