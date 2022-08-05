package com.example.demo.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FormerRepository.FormerRepository;
import com.example.demo.dao.DaoFor;
import com.example.demo.pojo.Former;
@Service
public class FormerImpl implements DaoFor {
     @Autowired
	private  FormerRepository repository;

	@Override
	public List<Former> getAllProducts() {

		List<Former> lst = new ArrayList<>();
		
		try {
			repository.findAll().forEach(lst::add);
			return lst;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Former searchProduct(int pid) {
try {
			
			Optional<Former> opt = repository.findById(pid); 
			
			if(opt.isPresent()) {
				Former pr = opt.get();
				return pr;
			}
			else
				return null;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean insertProduct(Former former) {
		try {
			repository.save(former);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Former former) {

		try {
			Optional<Former> opt = repository.findById(former.getId());
			
			if(opt.isPresent()) {
				repository.save(former);
				return true;
			}
			else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int pid) {
		try {
			Optional<Former> opt = repository.findById(pid);
			
			if(opt.isPresent()) {
				repository.deleteById(pid);
				return true;
			}
			else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
     
}
