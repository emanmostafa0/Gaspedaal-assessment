package Junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import GasPedaalSelfDriving.Car;

public class CarJunit {

	@Test
	public void testX() {
		Car car=new Car(5,6,'N');
		assertEquals(5, car.getX());
	}
	
	@Test
	public void testY() {
		Car car=new Car(5,7,'N');
		assertEquals(7, car.getY());
	}
	@Test
	public void testDirection() {
		Car car=new Car(5,5,'S');
		assertEquals('S', car.getDirection());
	}

}
