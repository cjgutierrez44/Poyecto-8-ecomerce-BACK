package com.tig.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tig.ecomerce.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
