package test;

class Contract{
	String name;
	String phone;
	String address;
	Contract(String name){ //메소드 오버로딩,다중생성자
		// 여기서 생성자란 메소드랑 다르다. 반환값을 가지지 않는다. 중복으로 생성할 수 있다 괄호 안 인자 차이 (다중생성자)
		this.name = name;
	}
	Contract(String name,String phone){ // contract 함수
		this.name = name;
		this.phone = phone;
	}
	void printContract() { //print 함수
		System.out.println(name);
		System.out.println(phone);
	}
}
// EContract는 Contract로 부터 상속받아 address 필드를 추가함.	
class EContract extends Contract{
	EContract(){
		super("홍길동","12341234"); //Super로 Contract class의 오버로딩된 생성자의 매개변수를 맞춰줘서 부모 클래스의 내용을 사용
		//오버로딩된 생성자에 맞춰 super()의 인자를 맞춰줌
	}
	String address;
	//메쏘드 오버라이딩 , 상위클래스가 하위클래스에 그대로 가져오는것(재정의)
	//부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위
	void printContract() {//print 함수
		System.out.println(name);
		System.out.println(phone);
		System.out.println(address);
	}
}

public class test {
	public static void main(String[] args) {
		EContract e1 = new EContract();
		e1.printContract();
	}
}
