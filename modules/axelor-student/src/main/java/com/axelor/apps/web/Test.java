package com.axelor.apps.web;

import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.student.db.Contact;

public class Test {
	public void testMethod(ActionRequest request, ActionResponse response) {
		 Contact contact=request.getContext().asType(Contact.class);
		 String firstName=contact.getFirstName();
		 response.setValue("lastName", firstName);
	}

}
