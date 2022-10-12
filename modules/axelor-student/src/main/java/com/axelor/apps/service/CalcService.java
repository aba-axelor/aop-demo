package com.axelor.apps.service;

import com.axelor.calc.db.Calculator;
import com.ibm.icu.math.BigDecimal;

public interface CalcService {
	public BigDecimal add(Calculator calc);
	public BigDecimal sub(Calculator calc);
	public BigDecimal product(Calculator calc);
	public BigDecimal div(Calculator calc);

}
