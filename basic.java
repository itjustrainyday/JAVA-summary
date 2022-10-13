package test;
//package (이름) 패키지안에 자바 파일을 넣는다.
//패키지를 사용하면 비슷한 성격의 클래스들끼리 묶을 수 있어 클래스의 분류가 용이
//패키지명이 다르면 클래스명이 동일해도 충돌없이 사용할 수 있다
import java.util.Scanner; // 스캐너를 사용하기 위해 Scanner를 import
// 자바는 객체 지향 프로그램
public class Main {

	public static void main(String[] args) { // 자바의 메인문 
/*public : 메소드의 접근제어자, public은 누구나 이 메소드에 접근할 수 있다는 의미이다.
static : 메소드에 static 이 지정되어 있는 경우 이 메소드는 인스턴스 생성(객체 생성)없이 실행 할 수 있음을 의미한다.
String[] : 문자열을 나타내는 자바의 자료형이다. ([]가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열임을 의미한다.)
args : String[] 자료형에 대한 변수명이다. */
		Scanner sc = new Scanner(System.in); // Scanner 객체 sc 생성,System.in => InputStream(콘솔입력)을 필요로 한다.
		System.out.println(sc.nextLine());//Scanner 객체의 next()메소드는 단어 하나(token)을 읽어드린다.
		//객체이름.next() => 문자(단어) .nextLine => 문자이지만 공백(엔터)를 치면 공백을 인정하고 입력된 걸로 해준다. 이 부분이 next()와의 차이점
		//nextInt() => 정수를 입력
		String[] weeks = new String[7]; // 배열 접근 방법, 배열 길이에 접근 하기 위해 사용해야 할 new, 배열의 길이 흝을 때 for(i=0;i<week.length;i++)을 사용
		System.out.println("Hello World!"); //자바의 문자출력 ex)c언어 printf와 같은 것 println => 출력 나오고 줄을 바꿈
		System.out.println("안녕");
	}
}
