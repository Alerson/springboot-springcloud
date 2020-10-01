package com.in28minutes.rest.webservices.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private Integer id;
	private String name;
	private Date birthDate;

}
