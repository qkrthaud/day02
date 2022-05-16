package day02;

import java.util.Scanner;

public class Test01 {
	public static void main (String[] args) {
		final String KOREA="대한민국";
		System.out.println(KOREA);
		//korea="케나다";
		//System.out.println(korea);
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name=input.next();
		int age;
		System.out.println("나이 입력 : ");
		age = input.nextInt();
		System.out.println(name+"님의 나이는 "+age);
	}

}
