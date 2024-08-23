package ex0726.ex03;

public class Exam03Main {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOffLight();
		
		System.out.println("---------");
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();

	}

}
