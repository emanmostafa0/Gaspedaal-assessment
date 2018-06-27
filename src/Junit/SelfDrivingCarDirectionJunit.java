package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import GasPedaalSelfDriving.Car;
import GasPedaalSelfDriving.SelfDrivingCar;

public class SelfDrivingCarDirectionJunit {

	//change direction left
	@Test
	public void testLeftN() {
		Car movingCar = new Car(5,5,'N');
		movingCar = SelfDrivingCar.changeDirectionLeft(movingCar);
		assertEquals('W', movingCar.getDirection());
	}
	
	@Test
	public void testLeftW() {
		Car movingCar = new Car(5,5,'W');
		movingCar = SelfDrivingCar.changeDirectionLeft(movingCar);
		assertEquals('S', movingCar.getDirection());
	}
	@Test
	public void testLeftS() {
		Car movingCar = new Car(5,5,'S');
		movingCar = SelfDrivingCar.changeDirectionLeft(movingCar);
		assertEquals('E', movingCar.getDirection());
	}
	@Test
	public void testLeftE() {
		Car movingCar = new Car(5,5,'E');
		movingCar = SelfDrivingCar.changeDirectionLeft(movingCar);
		assertEquals('N', movingCar.getDirection());
	}
	
	//change direction left
	@Test
	public void testRightN() {
		Car movingCar = new Car(5,5,'N');
		movingCar = SelfDrivingCar.changeDirectionRight(movingCar);
		assertEquals('E', movingCar.getDirection());
	}
	@Test
	public void testRightE() {
		Car movingCar = new Car(5,5,'E');
		movingCar = SelfDrivingCar.changeDirectionRight(movingCar);
		assertEquals('S', movingCar.getDirection());
	}
	@Test
	public void testRightS() {
		Car movingCar = new Car(5,5,'S');
		movingCar = SelfDrivingCar.changeDirectionRight(movingCar);
		assertEquals('W', movingCar.getDirection());
	}
	@Test
	public void testRightW() {
		Car movingCar = new Car(5,5,'W');
		movingCar = SelfDrivingCar.changeDirectionRight(movingCar);
		assertEquals('N', movingCar.getDirection());
	}

}
