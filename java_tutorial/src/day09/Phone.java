package day09;

public class Phone {
	public static void main(String[] args) {
		KPhone galaxy2 = new _2GPhone();
		KPhone galaxy3 = new Phone3G();
		KPhone galaxy4 = new Phone4G();
		KPhone galaxy5 = new Phone5G();			// 다형성
		galaxy2.call(010);
		galaxy2.msg(0, "");
		((Phone3G)galaxy3).net();
		((Phone4G)galaxy4).lte();
		((Phone5G)galaxy5).bigData();				// 인터페이스에 없는 메서드이면 형변환이 필요
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
class Phone3G implements KPhone{
	public void net() {
		System.out.println("인터넷 사용");
	}

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
// 4G폰 : 전화 + 문자 + 인터넷 + 속도(LTE)
class Phone4G implements KPhone{
	public void lte() {
		System.out.println("빠른 속도");
	}
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

// 5G폰 : 전화 + 문자 + 인터넷 + 속도 + 빅데이터
class Phone5G implements KPhone{
	public void bigData() {
		System.out.println("빅데이터 활용");
	}
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



