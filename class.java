package test;

class Contract{ //class => 객체를 만드는 껍데기
	String name; //객체 변수
	String phone;
	void Contract(String name,String phone){ // contract 함수 => 자바에선 메소드라고 함 //String name, String phone은 매개변수
		this.name = name; //this.name => class안의 지역 변수 this.name = name (Contract 함수의 매개변수)
		this.phone = phone;
	}
	void Contract() { //입력항목(ex 매개변수)이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩(method overloading)
		System.out.println("이것이 오버로딩");
	}
	void printContract() { //print 함수
		System.out.println(name);
		System.out.println(phone);
	}
}
public class test {
	public static void main(String[] args) {
		Contract o1 = new Contract(); //Contract class의 객체 o1 생성 => o1, Contract의 인스턴스, 메소드를 static으로 선언하면 이런 작업 안해도 됌 ,
		//new => 객체를 생성할 떄 만드는 키워드
		//o1.Contract("홍길동","12341234"); //메소드 오버로딩이란 한개의 클래스에 동일한 이름의 메소드가 있을 때, 그 메소드의 괄호안의 매개변수 형태로 불러오는 것을 의미
		o1.Contract("BOBBY","1234");
		o1.Contract();
		o1.printContract();
	}
}
