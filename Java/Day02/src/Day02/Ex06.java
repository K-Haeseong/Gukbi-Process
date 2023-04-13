package Day02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		String name;
		int lang;
		int english;
		int math;
		int sum;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? : ");
		name = sc.next();
		
		System.out.print( name + "님의 국어 점수 : ");
		lang = sc.nextInt();
		
		System.out.print( name + "님의 영어 점수 : ");
		english = sc.nextInt();
		
		System.out.print( name + "님의 수학 점수 : ");
		math = sc.nextInt();		
		
		sum = lang + english + math;
				
		System.out.println("=================");
		System.out.println("이름 : " + name);
		System.out.println("=================");
		System.out.println("국 어 : " + name);
		System.out.println("영 어 : " + name);
		System.out.println("수 학 : " + name);
		System.out.println("=================");
		System.out.println("합 계 : " + sum);
		
		
	}

}
