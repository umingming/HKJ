package chap08.sec02.exam04;

import chap08.sec02.exam03.*;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
