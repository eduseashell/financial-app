package com.kwon.financialapp.webservice.test;

import com.kwon.financialapp.webservice.fincal.interest.simple.SimpleInterestCalculator;

public class TestSimpleInterest {
	
	public static void main(String[] args) {
//		testCalculate(SimpleInterestCalculator::fv);
		testCalculate(SimpleInterestCalculator::pv);
	}
	
	private static void testCalculate(Calculator calator) {
		double pv = 110;
		double n = 1;
		double r = -1;
		
		String msg = "param pv: " + pv + " n: " + n + " r: " + r + " = ";
		System.out.println(msg + calator.calculate(pv, n, r));
		
		n = 0;
		msg = "param pv: " + pv + " n: " + n + " r: " + r + " = ";
		System.out.println(msg + calator.calculate(pv, n, r));
		
		n = 2;
		r = - 0.2;
		msg = "param pv: " + pv + " n: " + n + " r: " + r + " = ";
		System.out.println(msg + calator.calculate(pv, n, r));
		
		r = 0.0000000001;
		msg = "param pv: " + pv + " n: " + n + " r: " + r + " = ";
		System.out.println(msg + calator.calculate(pv, n, r));
	}
	
	@FunctionalInterface
	interface Calculator {
		
		double calculate(double v1, double v2, double v3);
		
	}

}
