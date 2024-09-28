package com.example.demo.Data_Type;

import java.io.Serializable;

import lombok.Data;

@Data
public class Entity_demo implements Serializable{

	private Long id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private String tel;
	
	private Long point;
}
