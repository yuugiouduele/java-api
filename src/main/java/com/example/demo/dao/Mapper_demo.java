package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Data_Type.Delete_User_Deta;
import com.example.demo.Data_Type.Entity_demo;
import com.example.demo.Data_Type.New_User_Deta;
import com.example.demo.Data_Type.Update_User_Data;

@Mapper
public interface Mapper_demo {
/**
 * 
 * @param
 * @return
 */
	List<Entity_demo>findAll();
	/**
	 * 
	 * @param id
	 * @return
	 */
	List<Entity_demo>findById(Long id);
	/**
	 * 
	 * @param sd
	 */
	
	void update(Update_User_Data sd);
	/**
	 * 
	 * @param nd
	 */
	void insert(New_User_Deta nd);
	/**
	 * 
	 * @param dd
	 */
	void delete(Delete_User_Deta dd);
}
