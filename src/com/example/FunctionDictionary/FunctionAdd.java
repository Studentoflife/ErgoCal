package com.example.FunctionDictionary;

public final class FunctionAdd implements BareFunction2Arg {

	@Override
	public double calculate(double arg1, double arg2) {
		return arg1 + arg2;
	}

}
