package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Data_Type.Entity_demo;
import com.example.demo.Service.Service_demo;

@RestController
@RequestMapping("demo-v1")
public class Controller_demo {
	@Autowired
	Service_demo sd;
//git commitするためにコメント追加
	@GetMapping("/get/{name}")
	public String getData(@PathVariable("name") String name,
			@RequestParam(name = "score", value = "score", defaultValue = "スコア", required = false) Integer score) {
		return name + "さんの点数は" + score + "です。";
	}

	@GetMapping("/get_user/{name}")
	public List<Entity_demo> getUserData(@PathVariable("name") String name,
			@RequestParam(name = "id", value = "id", defaultValue = "ID", required = false) Long id) {

		return sd.finddata();
	}

	@GetMapping("/get_id/{name}")
	public List<Entity_demo> getIdData(@PathVariable("name") String name,
			@RequestParam(name = "id", value = "id", defaultValue = "ID", required = false) Long id) {

		return sd.finddata_id(id);
	}

	@GetMapping("/insert_user/{name}")
	public String insertUserData(@PathVariable("name") String name,
			@RequestParam(name = "data", value = "data", defaultValue = "Data", required = false) String[] data) {
		Long point = Long.parseLong(data[3]);
		sd.insertData(name, data[0], data[1], data[2], point);
		return name + "さんの" + point + "格納されました!!";
	}

	@GetMapping("/update_user/{name}")
	public String updateUserData(@PathVariable("name") String name,
			@RequestParam(name = "data", value = "data", defaultValue = "Data", required = false) String[] data) {
		Long ID = Long.parseLong(data[0]);
		Long point = Long.parseLong(data[4]);
		sd.updateData(ID, name, data[1], data[2], data[3], point);
		return name + "さんの" + point + "は変更されました!!";
	}

	@GetMapping("/delete_user/{name}")
	public String deleteUserData(@PathVariable("name") String name,
			@RequestParam(name = "id", value = "id", defaultValue = "ID", required = false) Long id) {
		sd.deleteData(id);
		return name + "さんのデータを削除しました。";
	}

	@GetMapping("/post/{name}")
	public List<String> insertData(@PathVariable("name") String name,
			@RequestParam(name = "score", value = "score", defaultValue = "スコア", required = false) Integer score) {

		List<String> list = new ArrayList<>();
		for (int i = 0; i < score; i++) {
			if (i / name.length() == score / 10) {
				list.add(name + i);
			} else {

			}
		}

		return list;
	}

	@GetMapping("/patch/{name}")
	public Map<String, List<String>> updateData(@PathVariable("name") String name,
			@RequestParam(name = "key", value = "key", defaultValue = "キー", required = false) String[] key) {
		Map<String, List<String>> api = new HashMap<>();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < name.length(); i++) {
			list.add(name + i);
			api.put(key[i], list);
		}
		return api;
	}

	@GetMapping("/delete/{name}")
	public String deleteData(@PathVariable("name") String name,
			@RequestParam(name = "id", value = "id", defaultValue = "スコア", required = false) Long id) {

		return name + "のデータは消しまーーーすwwwwwww";
	}
}
