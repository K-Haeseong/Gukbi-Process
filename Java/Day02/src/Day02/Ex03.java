// 자료형 변환
//	- 특정 자료형을 다른 자료형으로 변환하는 것



package Day02;

public class Ex03 {
	
	public static void main(String[] args) {
	
		char ch = 'a';
		int num = 65;
		System.out.println(ch);
		System.out.println(num);
		
		char ch02 = (char)num;		// 강제 형 변환
		int num02 =ch;				// 자동 형 변환
		System.out.println(ch02);  
		System.out.println(num02); 	
		
		
		
	}

}
