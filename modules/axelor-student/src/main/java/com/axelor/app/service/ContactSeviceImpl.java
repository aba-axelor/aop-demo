package com.axelor.app.service;

import com.axelor.student.db.Contact;

public class ContactSeviceImpl implements ContactService{
	
	@Override
	public String setName(Contact contact) {
		String firstName=contact.getFirstName();
		return firstName;
	}

}
