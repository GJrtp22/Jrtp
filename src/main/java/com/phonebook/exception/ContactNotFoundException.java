package com.phonebook.exception;


public class ContactNotFoundException  extends RuntimeException {
	
	private static final long serialVersionUID=1l;
	
	public ContactNotFoundException()
	{
		super();
	}
	
	public ContactNotFoundException(String message)
	{
		super(message);
	}

}
