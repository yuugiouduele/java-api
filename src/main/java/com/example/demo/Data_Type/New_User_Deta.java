package com.example.demo.Data_Type;

import java.io.Serializable;

import lombok.Data;

@Data
public class New_User_Deta implements Serializable{

	private Long id;

	private String name;

	private String address;

	private String tel;

	private String email;

	private Long point;
}
