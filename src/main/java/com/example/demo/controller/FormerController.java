package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DaoFor;
import com.example.demo.pojo.Former;

@RestController
public class FormerController {
	@Autowired
   private DaoFor obj;
	@GetMapping(value = "/getallproducts")
	public List<Former> returnAllProducts() {
	
		List<Former> lst = obj.getAllProducts();
		return lst;
	}
	@PostMapping(value = "/addnew")
	public HashMap<String, String> addProduct(@RequestBody Former former) 
	{
		HashMap<String, String> hmap = new HashMap<>();
		
		if(obj.insertProduct(former))
			hmap.put("msg", "successful product insertion");
		else
			hmap.put("msg", "product insertion failed");
		
		return hmap;
	}
}
