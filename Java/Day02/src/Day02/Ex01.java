// 변수 : 데이터를 저장하는 공간
// 자료형 : 데이터 어떤 값인지에 따라 사용하는 값
 
// - int : 정수를 표현 : 4byte
// - float / double : 실수를 표현 : 4 / 8byte
// - char : 문자 표현 : 2byte
// - boolean : true 또는 false 표현 : 1byte

// 변수 생성
// - 자료형 변수명;
// - 자료형 변수명 = 값;
// * 변수 생성시 보고 무엇인지 알 수 있도록 명시해주는 것이 좋음

// 변수의 이름 생성 규칙
// 1. 변수의 이름은 영문자(대소문자), 숫자, 언더스코어(_), 달러($)로만 구성할 수 있다.
// 2. 변수의 이름은 숫자로 시작할 수 없다.
// 3. 변수의 이름 사이에는 공백을 포함할 수 없다.
// 4. 변수의 이름으로 자바에서 미리 정의된 키워드(keyword)는 사용할 수 없다.


package Day02;

public class Ex01 {

	public static void main(String[] args) {

		int age = 50;
		float height = 150;
		double weight = 20.0;
		
		System.out.println("나의 나이는 " + age + "살 입니다.");
		System.out.println("" + age + "살 홍길동 입니다.");
		System.out.println("" + age + "살이지만 만으로는 " + (age-1) + "살입니다.");
		System.out.println();

		System.out.println("나의 나이는 50살 입니다.");
		System.out.println("나의 나이는 " + age + "살입니다.");
		System.out.println("나의 키는 " + height + "(cm)입니다.");
		System.out.println("나의 몸무게는 " + weight + "(kg)입니다.");
	
	
	
	
	
	
	
	
	
	}
}
