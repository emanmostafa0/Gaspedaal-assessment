package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import GasPedaalSelfDriving.Car;
import GasPedaalSelfDriving.SelfDrivingCar;

public class SelfDrivingCarAccidentJunit {
	//car accident
	@Test
	public void testAccident() {
		Car landingCar = new Car(5,5,'N');
		boolean accident = SelfDrivingCar.checkCarAccident(5,5,landingCar);
		assertEquals(true, accident);
	}

	@Test
	public void testNotAccident() {
		Car landingCar = new Car(5,5,'N');
		boolean accident = SelfDrivingCar.checkCarAccident(5,6,landingCar);
		assertEquals(false, accident);
	}

}
