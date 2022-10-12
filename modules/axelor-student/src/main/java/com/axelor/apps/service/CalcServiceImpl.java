package com.axelor.apps.service;

import com.axelor.calc.db.Calculator;
import com.ibm.icu.math.BigDecimal;

public class CalcServiceImpl implements CalcService{
	
	

	@Override
	public BigDecimal add(Calculator calc) {
		BigDecimal firstInput = BigDecimal.ZERO;
		BigDecimal secondInput= BigDecimal.ZERO;
		if (!calc.getInputOne().isEmpty() && !calc.getInputTwo().isEmpty()) {
			 firstInput = BigDecimal.valueOf(Double.valueOf(calc.getInputOne()));
			 secondInput = BigDecimal.valueOf(Double.valueOf(calc.getInputTwo()));
			 return firstInput.add(secondInput);
		}
		return BigDecimal.ZERO;
	}

	@Override
	public BigDecimal sub(Calculator calc) {
		BigDecimal firstInput = BigDecimal.ZERO;
		BigDecimal secondInput = BigDecimal.ZERO;
		if(!calc.getInputOne().isEmpty() && !calc.getInputTwo().isEmpty()) {
			firstInput = BigDecimal.valueOf(Double.valueOf(calc.getInputOne()));
			secondInput = BigDecimal.valueOf(Double.valueOf(calc.getInputTwo()));
			return firstInput.subtract(secondInput);
		}
		return BigDecimal.ZERO;
	}

	@Override
	public BigDecimal product(Calculator calc) {
		BigDecimal firstInput = BigDecimal.ZERO;
		BigDecimal secondInput = BigDecimal.ZERO;
		if(!calc.getInputOne().isEmpty() && !calc.getInputTwo().isEmpty()) {
			firstInput = BigDecimal.valueOf(Double.valueOf(calc.getInputOne()));
			secondInput = BigDecimal.valueOf(Double.valueOf(calc.getInputTwo()));
			return firstInput.multiply(secondInput);
		}
		return BigDecimal.ZERO;
	}

	@Override
	public BigDecimal div(Calculator calc) {
		BigDecimal firstInput = BigDecimal.ZERO;
		BigDecimal secondInput = BigDecimal.ZERO;
			if(!calc.getInputOne().isEmpty() && !calc.getInputTwo().isEmpty()) {
				firstInput = BigDecimal.valueOf(Double.valueOf(calc.getInputOne()));
				secondInput = BigDecimal.valueOf(Double.valueOf(calc.getInputTwo()));
				if(!secondInput.equals(BigDecimal.ZERO)) {
				return firstInput.divide(secondInput);
			}

		}
		return BigDecimal.ZERO;
	}

}
