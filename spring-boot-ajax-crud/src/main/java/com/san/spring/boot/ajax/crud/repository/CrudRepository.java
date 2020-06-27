package com.san.spring.boot.ajax.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.san.spring.boot.ajax.crud.entity.Company;

public interface CrudRepository extends JpaRepository<Company, Integer> {

}
