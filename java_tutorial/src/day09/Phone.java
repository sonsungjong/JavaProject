package day09;

public class Phone {
	public static void main(String[] args) {
		Phone5G galaxy22 = new Phone5G();
		galaxy22.call(010);
		galaxy22.msg(0, "");
		galaxy22.net();
		galaxy22.lte();
		galaxy22.bigData();
	}
}

// 인터페이스1 : 상속을 여러개 하기 위해서
// 인터페이스2 : 반드시 만들어줘야하는 함수를 정해놓기 위해서
// 인터페이스3 : 다형성

interface KPhone{
	// 전화, 문자 함수 만들기를 강요
	void call(int num);					// 전화
	void msg(int num, String str);		// 문자
}

// 2G : 전화 + 문자
class _2GPhone implements KPhone{
	// 2G폰을 만드는 사람은 전화와 문자기능을 빼놓을 수 없음
	@Override
	public void call(int num) {
		// 반드시 만들어줘야하는 기능1
		System.out.println(num+"에 전화합니다.");
	}

	@Override
	public void msg(int num, String str) {
		// 반드시 만들어줘야하는 기능2
		System.out.println(num+"에 문자를 보냅니다."+str);
	}
}

// 3G폰 : 전화 + 문자 + 인터넷
class Phone3G extends _2GPhone implements KPhone{
	public void net() {
		System.out.println("인터넷 사용");
	}
}
// 4G폰 : 전화 + 문자 + 인터넷 + 속도(LTE)
class Phone4G extends Phone3G{
	public void lte() {
		System.out.println("빠른 속도");
	}
}

// 5G폰 : 전화 + 문자 + 인터넷 + 속도 + 빅데이터
class Phone5G extends Phone4G{
	public void bigData() {
		System.out.println("빅데이터 활용");
	}
}



