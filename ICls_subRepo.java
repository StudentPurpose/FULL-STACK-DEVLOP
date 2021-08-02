package com.slokam.edu.learning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.edu.learning.entity.Cls_Sub;
@Repository
public interface ICls_subRepo extends JpaRepository<Cls_Sub, Integer> {

	
}
