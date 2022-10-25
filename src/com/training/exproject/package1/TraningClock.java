package com.training.exproject.package1;

public class TraningClock {

	public static void main(String[] args) {
		Clock cl = new Clock(12, 00, 00);
		cl.print();
		System.out.println();
		//cl.increase(72, 29, 45);
		//cl.increaseSec(-13, 25, 45);
		//cl.print();
		cl.change(5, 25, 5);
		System.out.println();
		cl.print();
	}

}
