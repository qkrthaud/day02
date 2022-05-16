package day02;

import java.util.Scanner;

public class QuizTest02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name=input.next();
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		System.out.print("IQ 입력 : ");
		int iq = input.nextInt();
		
		if (age < 20) {
			System.out.println(name+"님은 어린이이며 ");
		}
		if (age >= 20 && age < 30) {
			System.out.println(name+"님은 젊은이이며");
		}
		if (age > 30) {
			System.out.println(name+"님은 늙은이이며");
		}
		if (iq < 100) {
			System.out.println("바보입니다");
		}
		if (iq > 100 && iq < 140) {
			System.out.println("평범합니다");
		}
		if (iq > 140) {
			System.out.println("천재입니다");
		}
		
	}

}
