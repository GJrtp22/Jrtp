package com.phonebook.beans;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER_TBL")
public class User {
	@Id
	private int id;
	private String userName;
	private String password;
	private String email;
	
	
	
	
	
	
	
	
	
	

}
