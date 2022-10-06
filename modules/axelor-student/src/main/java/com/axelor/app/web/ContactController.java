package com.axelor.app.web;
import com.axelor.app.service.ContactService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.student.db.Contact;

public class ContactController {
	
	public void testMethod(ActionRequest request, ActionResponse response) {
		Contact contact=request.getContext().asType(Contact.class);		
		 String firstName=Beans.get(ContactService.class).setName(contact);
		if(firstName !="Hello") {
			response.setValue("lastName", firstName);
		}
		 
	}

}
