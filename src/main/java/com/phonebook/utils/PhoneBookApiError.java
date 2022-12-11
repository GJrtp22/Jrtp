package com.phonebook.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneBookApiError {
	
	private String errorName;
	private Integer errorCode;
	

}
