package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import GasPedaalSelfDriving.Car;
import GasPedaalSelfDriving.SelfDrivingCar;

public class SelfDrivingCarForwardJunit {

	//car moving Forward check apublic voiding accident while moving
	@Test
	public void testAccidentWhileMovingN() {
		Car movingCar = new Car(5,5,'N');
		Car landingCar = new Car(5,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}

	@Test
	public void testAccidentWhileMovingE() {
		Car movingCar = new Car(5,5,'E');
		Car landingCar = new Car(6,5,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}

	@Test
	public void testAccidentWhileMovingS() {
		Car movingCar = new Car(5,5,'S');
		Car landingCar = new Car(5,4,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}
	@Test
	public void testAccidentWhileMovingW() {
		Car movingCar = new Car(5,5,'W');
		Car landingCar = new Car(4,5,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}

	@Test
	public void testNotAccidentWhileMoving() {
		Car movingCar = new Car(5,5,'W');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(4, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}
	
	//car moving Forward check apublic voiding exceeding the borders while moving to the max y
	
	@Test
	public void testExceedYMaxWhileMoving() {
		Car movingCar = new Car(5,20,'N');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(20, movingCar.getY());
	}
	@Test
	public void testNotExceedYMaxWhileMoving() {
		Car movingCar = new Car(5,19,'N');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(20, movingCar.getY());
	}
	
	//car moving Forward check apublic voiding exceeding the borders while moving to  min y
	@Test
	public void testExceedYMinWhileMoving() {
		Car movingCar = new Car(5,0,'S');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(0, movingCar.getY());
	}
	@Test
	public void testNotExceedYMinWhileMoving() {
		Car movingCar = new Car(5,1,'S');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(5, movingCar.getX());
		assertEquals(0, movingCar.getY());
	}
	//car moving Forward check apublic voiding exceeding the borders while moving to  max X
	@Test
	public void testExceedXMaxWhileMoving() {
		Car movingCar = new Car(20,5,'E');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(20, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}
	@Test
	public void testNotExceedXMaxWhileMoving() {
		Car movingCar = new Car(19,5,'E');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(20, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}
	//car moving Forward check apublic voiding exceeding the borders while moving to  min x
	@Test
	public void testExceedXMinWhileMoving() {
		Car movingCar = new Car(0,5,'W');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(0, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}
	@Test
	public void testNotExceedXMinWhileMoving() {
		Car movingCar = new Car(1,5,'W');
		Car landingCar = new Car(4,6,'N');
		movingCar = SelfDrivingCar. moveForwardCar(movingCar,landingCar,20,20);
		assertEquals(0, movingCar.getX());
		assertEquals(5, movingCar.getY());
	}
}
