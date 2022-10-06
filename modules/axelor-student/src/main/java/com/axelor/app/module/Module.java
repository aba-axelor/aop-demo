package com.axelor.app.module;

import com.axelor.app.AxelorModule;
import com.axelor.app.service.ContactService;
import com.axelor.app.service.ContactSeviceImpl;

public class Module extends AxelorModule{
	
	@Override
	protected void configure() {
		bind(ContactService.class).to(ContactSeviceImpl.class);
	}
}
