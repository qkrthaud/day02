package day02;

import java.util.Scanner;

public class Test01 {
	public static void main (String[] args) {
		final String KOREA="���ѹα�";
		System.out.println(KOREA);
		//korea="�ɳ���";
		//System.out.println(korea);
		Scanner input = new Scanner(System.in);
		System.out.println("�̸� �Է� : ");
		String name=input.next();
		int age;
		System.out.println("���� �Է� : ");
		age = input.nextInt();
		System.out.println(name+"���� ���̴� "+age);
	}

}
