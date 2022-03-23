package ch05;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 시작합니다");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 자율적으로 멈춥니다");
	}
	
}
