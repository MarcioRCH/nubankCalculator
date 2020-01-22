package entities;

import util.Tax;

public class Calculator {

	public double ptax;
	public double dollar;
	public double real;

	public double calcSpread() {
		return (ptax * Tax.SPREAD) + ptax;
	}
	public double converterDollar() {
		return dollar * calcSpread();
	}
	public double calcIOF() {
		return (converterDollar() * Tax.IOF) + converterDollar();
	}
}