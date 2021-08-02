package com.slokam.edu.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.edu.learning.entity.Subject;
@Repository
public interface ISub_Repo extends JpaRepository<Subject, Integer> {

}
