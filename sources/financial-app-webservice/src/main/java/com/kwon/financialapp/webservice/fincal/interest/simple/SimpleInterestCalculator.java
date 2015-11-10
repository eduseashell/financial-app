package com.kwon.financialapp.webservice.fincal.interest.simple;


/**
 * A calculator for Simple Interest
 * @author SEASHELL
 */
public class SimpleInterestCalculator {
	
	/**
	 * Calculate the present value (PV) of a future value
	 * given the number of periods, frequency, and annual interest rate (IR).
	 * @param param - The calculation parameters periods, frequency, and ir
	 * @return
	 */
	public static double pv(double fv, double n, double r) {
		double df = discountFactor(n, r);
		return df == 0 ? df : fv / df;
	}
	
	/**
	 * Calculate the future value (PV) of a present value
	 * given the number of periods, frequency, and annual interest rate (IR).
	 * @param param - The calculation parameters periods, frequency, and ir
	 * @return
	 */
	public static double fv(double pv, double n, double r) {
		return pv * discountFactor(n, r);
	}
	
	/**
	 * Calculate the Discount factor "1 + n * r"
	 * wherer n = number of period, r = annual interest rate
	 * @param n
	 * @param r
	 * @return
	 */
	public static double discountFactor(double n, double r) {
		if (n < 0) {
			throw new IllegalArgumentException("Number of period cannot be less than zero");
		}
		return 1 + n * r;
	}
	
	/**
	 * Calculate the period
	 * @param pv
	 * @param fv
	 * @param r
	 * @return
	 */
	public static double period(double pv, double fv, double r) {
		// TODO check this formula: simple interest: period
		return (fv / pv - 1) / r;
	}
	
	/**
	 * Calculate the interest rate
	 * @param pv
	 * @param fv
	 * @param n
	 * @return
	 */
	public static double rate(double pv, double fv, double n) {
		// TODO check this formula: simple interest: rate
		return (fv / pv - 1) / n;
	}

}
