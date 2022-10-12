package com.axelor.apps.web;

import java.util.Map;
//import java.util.Map.Entry;

import com.axelor.apps.service.CalcService;
import com.axelor.calc.db.Calculator;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.ibm.icu.math.BigDecimal;

public class CalcController {
	@SuppressWarnings("unchecked")
	public void calculate(ActionRequest request, ActionResponse response) {

		Map<String, Object> context = request.getData();
		Map<String, Object> contextMap = (Map<String, Object>) context.get("context");
		
		String btnSource = contextMap.get("_source").toString();
		Calculator calc = request.getContext().asType(Calculator.class);
		BigDecimal result = BigDecimal.ZERO;
		if(btnSource.equals("btnAdd")) {
			 result = Beans.get(CalcService.class).add(calc);
		}else if(btnSource.equals("btnSubtract")) {
			 result = Beans.get(CalcService.class).sub(calc);
		}else if(btnSource.equals("btnMultiply")) {
			 result = Beans.get(CalcService.class).product(calc);
		}else if(btnSource.equals("btnDivide")) {
			 result = Beans.get(CalcService.class).div(calc);
		}
		response.setValue("result", result);

	}

}
