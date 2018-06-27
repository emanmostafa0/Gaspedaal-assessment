package Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)

@SuiteClasses({   
	CarJunit.class,
	SelfDrivingCarAccidentJunit.class,
	SelfDrivingCarDirectionJunit.class,
	SelfDrivingCarForwardJunit.class,
	SelfDrivingCarMoveJunit.class
})
public class Suite {
	
}
