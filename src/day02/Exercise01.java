package day02;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, math;
		System.out.print("����� �̸��� �����Դϱ�?");
		name = input.next();
		System.out.print(name+"���� ���� ���� : ");
		kor=input.nextInt();
		System.out.print(name+"���� ���� ���� : ");
		eng=input.nextInt();
		System.out.print(name+"���� ���� ���� : ");
		math=input.nextInt();
		System.out.println("====================");
		System.out.println("�̸� : "+name);
		System.out.println("====================");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("====================");
		System.out.println("�հ� : "+(kor+eng+math));
		System.out.println("====================");
	}

}
