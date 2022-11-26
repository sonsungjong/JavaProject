package _05_extends;

// 비슷한 종류의 기능을 가진 클래스를 묶는다.
public interface Pet {
	void eat();
	void sound();
	// 모든 애완동물은 먹기도, 울기도 한다.
	// 따라서, 모든 애완동물은 eat과 sound가 있어야한다. 
}
