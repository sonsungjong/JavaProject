package day09;

public class Class2 {
	public static void main(String[] args) {
		StarGangnam sg = new StarGangnam();
		StarSinchon ss = new StarSinchon();
		StarBupyeong sb = new StarBupyeong();
		
		sg.makeCoffee();
		sg.sellCoffee();
		
		ss.makeCoffee();
		ss.sellCoffee();
		
		sb.makeCoffee();
		sb.sellCoffee();
		
		// 다형성 : 객체화를 할 때 자료형을 상속한 인터페이스의 이름으로 통일
		starbucks star1 = new StarGangnam();
		starbucks star2 = new StarSinchon();
		starbucks star3 = new StarBupyeong();
		starbucks star[] = new starbucks[30];
		
		star[0] = new StarGangnam();
		star[1] = new StarSinchon();
		
		star[0].makeCoffee();		// 강남점
		star[1].makeCoffee();		// 신촌점
		
		star[0] = new StarBupyeong();
		star[0].makeCoffee();			// 부평점
		
		star1.sellCoffee();    		// 강남점
		star1 = new StarBupyeong();
		star1.sellCoffee(); 		// 부평점
		
		//sg = new StarBupyeong();		안됨    	// StarGangnam sg = new StarBupyeong();
		// starbucks star1 = new StarBupyeong();     가능
		// starbucks star1 = new StarSinchon();      가능
		
		// 다형성 : 코드수정을 줄이고 재사용 비율을 늘린다.
	}
}

// 스타벅스
interface starbucks{
	void makeCoffee();	// 커피를 만든다
	void sellCoffee();	// 커피를 판다
}
// 스타벅스 강남점
class StarGangnam implements starbucks{
	public void makeCoffee() {
		System.out.println("강남점 커피만들기");
	}
	public void sellCoffee() {
		System.out.println("강남점 커피 판매");
	}
}
// 스타벅스 신촌점
class StarSinchon implements starbucks{
	public void makeCoffee() {
		System.out.println("신촌점 커피만들기");
	}
	public void sellCoffee() {
		System.out.println("신촌점 커피 판매");
	}
}
// 스타벅스 부평점
class StarBupyeong implements starbucks{
	public void makeCoffee() {
		System.out.println("부평점 커피만들기");
	}
	public void sellCoffee() {
		System.out.println("부평점 커피 판매");
	}
}

