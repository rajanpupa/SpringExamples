package com.gontuseries.calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="demoWebService")
public class Calculator {
	
	@WebMethod(operationName="calculate")
	public int calculate(int val1, int val2){
		return val1 + val2;
	}
}
