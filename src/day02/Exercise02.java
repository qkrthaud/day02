package day02;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner input = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		num1=input.nextInt();
		String su1= (num1%2==0)?"¦��":"Ȧ��";
		String su2= (num1%3==0)?"3�� ����̴�":"3�� ����� �ƴϴ�";
		
		System.out.println(num1+" = "+su1);
		System.out.println(num1+" = "+su2);
		System.out.print("�� �� �Է� : ");
		num2=input.nextInt();
		num3=input.nextInt();
		System.out.println("num1 : "+num2+", num2 : "+num3);
		String su3=(num2>num3)?"num1�� num2���� ũ��":"num2�� num1���� ũ��";
		System.out.println(su3);
		
		
	}

}
