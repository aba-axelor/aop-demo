package com.axelor.apps.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.service.CalcService;
import com.axelor.apps.service.CalcServiceImpl;

public class Module extends AxelorModule{
	@Override
	protected void configure() {
		bind(CalcService.class).to(CalcServiceImpl.class);
	}

}
