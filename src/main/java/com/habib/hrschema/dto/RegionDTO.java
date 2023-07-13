package com.habib.hrschema.dto;

import java.util.Objects;

public class RegionDTO {

	private Long id;
	private String name;

	public RegionDTO() {
	}

	public RegionDTO(Long id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegionDTO other = (RegionDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	

}
