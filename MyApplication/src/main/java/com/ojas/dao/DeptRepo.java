package com.ojas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Department;

@Repository
public interface DeptRepo extends CrudRepository<Department, Integer> {
	
	@Query("from Department d where d.id > ?1")
	List<Department> getRecentDepartments(int deptId);
	
	@Query(value = "select avg(length(department_name)) from departments", nativeQuery = true)
	int getAvgLength();
}
