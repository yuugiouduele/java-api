package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Data_Type.Delete_User_Deta;
import com.example.demo.Data_Type.Entity_demo;
import com.example.demo.Data_Type.New_User_Deta;
import com.example.demo.Data_Type.Update_User_Data;
import com.example.demo.dao.Mapper_demo;

@Service
public class Service_demo {
@Autowired
Mapper_demo md;
	public List<Entity_demo>finddata(){
		return md.findAll();
	}
	
	public List<Entity_demo>finddata_id(Long id){
		
		return md.findById(id);
	}
	
	public void insertData(String name,String address,String email,String tel,Long point) {
		New_User_Deta nd=new New_User_Deta();
		nd.setAddress(address);
		nd.setEmail(email);
		nd.setName(name);
		nd.setTel(tel);
		nd.setPoint(point);
		
		md.insert(nd);
	}
	
	public void updateData(Long id,String name,String address,String email,String tel,Long point) {
		Update_User_Data ud=new Update_User_Data();
		ud.setId(id);
		ud.setAddress(address);
		ud.setEmail(email);
		ud.setName(name);
		ud.setTel(tel);
		ud.setPoint(point);
		
		md.update(ud);
	}
	
	public void deleteData(Long id) {
		Delete_User_Deta dd=new Delete_User_Deta();
		dd.setId(id);
		md.delete(dd);
	}
}
