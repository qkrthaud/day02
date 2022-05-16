package day02;

public class Test02 {
	public static void main(String[] args) {
		int num1=9,num2=2;
//		System.out.println(num1/num2);
//		System.out.println(num1%num2);
//		System.out.println(num1/(double)num2);
		
//		int a= 10, b=5;
//		a+=b;
//		System.out.println(a);
//		int su1,su2;
//		su1=su2=5;
//		System.out.println(su1+=1);			
//		System.out.println(su1-=1);			
//		System.out.println(su1*=su2);		
//		System.out.println(su1/=su2);		
//		System.out.println(su1%=su2);	
		
//		double do1=3.1,do2=3.0;
//		System.out.println(do1<=do2);
//		System.out.println(do1>=do2);
//		System.out.println(do1==do2);
//		System.out.println(do1!=do2);
		
		int su1=10,su2=20,su3=30;
		System.out.println(su1>su2&&su1>su3);
		System.out.println("==== and ====");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		
		System.out.println("==== or ====");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("==== not ====");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("==== 증감연산자 ====");
		su1=10;
		su1++;
		System.out.println(su1);
		
		su1=10;
		++su1;
		System.out.println(su1);
		
		su1=10;
		su2=su1++;
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		
		su1=10;
		su2=++su1;
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		
		System.out.println("==== 조건연산자 ====");
		/*
		 삼항연산자 (조건연산자)
		 변수  = (식) ? 참 : 거짓;
		  */
		su1=8;
		String s = (su1%2==0)?"짝수":"홀수";
		System.out.println(su1+s);
		
	}

}
