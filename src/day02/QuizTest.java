package day02;

import java.util.Scanner;

public class QuizTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("커피");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 에스프레소");
		System.out.println("4. 헤이즐넛");
		System.out.print("선택 : ");
		int num=input.nextInt();
		if(num == 1) {
			System.out.println("아메리카노 나왔습니다");
		}
		if(num == 2) {
			System.out.println("카페라떼 나왔습니다");
		}
		if(num == 3) {
			System.out.println("에스프레소 나왔습니다");
		}
		if(num == 4) {
			System.out.println("헤이즐넛 나왔습니다");
		}
		if(num != 1 && num != 2 && num != 3 && num != 4) {
			System.out.println("잘못된 선택입니다");
		}
		
	}

}
