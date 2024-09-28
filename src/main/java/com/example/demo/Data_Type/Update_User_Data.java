package com.example.demo.Data_Type;

import java.io.Serializable;

import lombok.Data;

@Data
public class Update_User_Data implements Serializable{

	private Long id;

	private String name;

	private String address;

	private String tel;

	private String email;

	private Long point;
}
