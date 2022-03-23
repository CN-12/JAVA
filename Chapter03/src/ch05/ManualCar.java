package ch05;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("기어봉을 P->D");
		System.out.println("엑설을 밟는다");
		System.out.println("핸을을 조향한다");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟는다");
		System.out.println("기어봉을 D->P");
	}

}
