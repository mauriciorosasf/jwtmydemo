package com.test.jwt.jwtdemo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

	public Role() {
	
	}
	public Role(Long id, String name) {
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
}
