package com.hmi.school.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Major {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	// အသင့်တော်ဆုံးနည်းလမ်းနဲ့လူပ်ချင်ရင် 
	private Long id;
	
	private String name;
	private String description;
	
	@OneToMany
	private List<Student> students = new ArrayList<>();
	
	public Major() {
	// TODO Auto-generated constructor stub
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
