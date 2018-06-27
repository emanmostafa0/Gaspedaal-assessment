package Junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Suite.class);
		System.out.println("Running " + result.getRunCount() + " tests...");
		for (Failure failure : result.getFailures()) {
			System.out.println("[ERROR] " + failure.toString());
		}
		System.out.println((result.wasSuccessful() ? "Success" : "Fail") + " (" + result.getRunTime() + " ms.)");
	}
}
