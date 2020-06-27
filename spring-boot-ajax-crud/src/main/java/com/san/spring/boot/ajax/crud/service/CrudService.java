package com.san.spring.boot.ajax.crud.service;

import java.util.List;

import com.san.spring.boot.ajax.crud.entity.Company;
import com.san.spring.boot.ajax.crud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {

	@Autowired
	private CrudRepository crudRepository;

	public List<Company> getCompanyList() {
		return crudRepository.findAll();
	}

	public Company getCompanyById(Integer id) {
		return crudRepository.findById(id).get();
	}

	public void saveOrUpdateCompany(Company company) {
		crudRepository.save(company);
	}
	
	public void deleteCompany(Integer id) {
		crudRepository.deleteById(id);
	}

}
