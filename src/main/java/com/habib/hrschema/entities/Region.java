package com.habib.hrschema.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "regions", schema = "main_schema")
public class Region {

	private Long id;
	private String name;

	public Region() {
	}

	public Region(String name) {
		this.name = name;
	}

	public Region(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "region_id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "region_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
