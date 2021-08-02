package com.slokam.edu.learning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.slokam.edu.learning.entity.Cls;
import com.slokam.edu.learning.entity.Subject;

@Repository
public interface IClsRepo extends JpaRepository<Cls, Integer>{
    
	@Query("select cs.sub from Cls_Sub cs join cs.cls c where c.name=?1 ")
	public List<Subject> getSubjectsByClassName(String claName);
	
	@Query("select cs.sub from Cls_Sub cs join cs.cls c where c.id=?1 ")
	public List<Subject> getSubjectsByClassid(Integer class_id);
	
	@Query("select cs.sub from Cls_Sub cs join cs.cls c where cs.id=?1 ")
	public List<Subject> getSubjectsBySubectid(Integer id);
	
	@Query("from Cls ")
	public abstract List<Subject> getAll();

	
	
	
}
