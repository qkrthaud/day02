package day02;

import java.util.Scanner;

public class QuizTest02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name=input.next();
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		System.out.print("IQ �Է� : ");
		int iq = input.nextInt();
		
		if (age < 20) {
			System.out.println(name+"���� ����̸� ");
		}
		if (age >= 20 && age < 30) {
			System.out.println(name+"���� �������̸�");
		}
		if (age > 30) {
			System.out.println(name+"���� �������̸�");
		}
		if (iq < 100) {
			System.out.println("�ٺ��Դϴ�");
		}
		if (iq > 100 && iq < 140) {
			System.out.println("����մϴ�");
		}
		if (iq > 140) {
			System.out.println("õ���Դϴ�");
		}
		
	}

}
