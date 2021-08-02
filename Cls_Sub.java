package com.slokam.edu.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="class_subject")
public class Cls_Sub {

	@Id
    @GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="class_id")
	private Cls cls;
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject sub;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cls getCls() {
		return cls;
	}
	public void setCls(Cls cls) {
		this.cls = cls;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	
	
}
