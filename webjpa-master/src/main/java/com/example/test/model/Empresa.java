package com.example.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA", schema="agenda")

public class Empresa {
	
	@Id
	@Column(name="SEQ_EMPRESA")
	private Long id;
	
	@Column(name="NOM_FANTASIA")
	private String name;
	
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

}
