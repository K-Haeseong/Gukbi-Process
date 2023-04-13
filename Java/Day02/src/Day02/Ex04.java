// 상수 : 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미
//		 But 프로그램이 실행되는 동안 메모리에 저장된 데이터를 변경할 수 없다는 점

// 리터럴(literal) :  그 자체로 값을 의미하는 것

package Day02;

public class Ex04 {

	public static void main(String[] args) {
		
		final int num = 100;
//		num = 200;
		System.out.println(num);
		
		String name = "홍길동";
		System.out.println(name);
		
		final String KOREA = "대한민국";
//		KOREA = "미국";
		System.out.println(KOREA);
		
		boolean bool = true;
		System.out.println(bool);
		
		bool = false;
		System.out.println(bool);
		
		String addr;
		addr = "산골짜기";
		System.out.println(addr);
		
		
		int n1, n2, sum;
		n1 = 10;
		n2 = 20;
		sum = n1 + n2;
		System.out.println(n1 + n2);
		System.out.println(sum);
		
		int num1=0, num2=0, sum2;
		sum2 = num1 + num2;
		System.out.println(sum2);
		
		
		String a = null;
		System.out.println(a);
		
		
	}

}
