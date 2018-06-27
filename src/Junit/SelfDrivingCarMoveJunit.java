package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import GasPedaalSelfDriving.Car;
import GasPedaalSelfDriving.SelfDrivingCar;

public class SelfDrivingCarMoveJunit {
	
	/// check the moving car with not exceeding the borders and far away from another car
	@Test
	public void testCarDestination() {
		Car movingCar = new Car(12,9,'E');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar.movingCar(movingCar,"FFFFRFFFLFFFLFRFR",landingCar,20,20);
		assertEquals(20, movingCar.getX());
		assertEquals(7, movingCar.getY());
		assertEquals('S', movingCar.getDirection());
	}
	/// check the moving car with apublic voiding exceeding the borders
	@Test
	public void testCarDestinationExceedMaxX() {
		Car movingCar = new Car(12,9,'E');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar.movingCar(movingCar,"FFFFRFFFLFFFLFRFRFLFLF",landingCar,20,20);
		assertEquals(20, movingCar.getX());
		assertEquals(6, movingCar.getY());
		assertEquals('E', movingCar.getDirection());
	}
	
	/// check the moving car with apublic voiding accident with another car
	@Test
	public void testCarDestinationAccident() {
		Car movingCar = new Car(12,9,'E');
		Car landingCar = new Car(19,7,'N');
		movingCar = SelfDrivingCar.movingCar(movingCar,"FFFFRFFFLFFFLFRFR",landingCar,20,20);
		assertEquals(19, movingCar.getX());
		assertEquals(6, movingCar.getY());
		assertEquals('N', movingCar.getDirection());
	}


}
