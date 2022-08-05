package com.example.demo.dao;

import java.util.List;

import com.example.demo.pojo.Former;

public interface DaoFor {
	//query operations
		List<Former> getAllProducts();
		Former searchProduct(int pid);
		
		
		//crud operations
		boolean insertProduct(Former former);
		boolean updateProduct(Former former);
		boolean deleteProduct(int pid);

}
