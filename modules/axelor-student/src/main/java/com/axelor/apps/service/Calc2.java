package com.axelor.apps.service;

import com.axelor.calc.db.Calculator;
import com.google.inject.Inject;
import com.ibm.icu.math.BigDecimal;

public class Calc2 {
	@Inject CalcService calservice;
	
	public void name(Calculator calc) {
		 BigDecimal addresult=calservice.add(calc);
	}

}
