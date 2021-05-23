package com.myapp.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Access")
public class Access {
	
	@Id 
    @Column(nullable = false)
    private int id;
     
    @Column(name="Email" ,nullable = false, unique = true, length = 45)
    private String email;
     
    @Column(name="Password" ,nullable = false, length = 64)
    private String password;
    
    @Column(name="Role")
    private String Role;
    
    @Column(name="Active")
    private boolean active;
    
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

	
    
	public Access(int id, String email, String password, String role, boolean active, String firstName,
			String lastName) {
		this.id = id;
		this.email = email;
		this.password = password;
		Role = role;
		this.active = active;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return Role;
	}



	public void setRole(String role) {
		Role = role;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Access() {}
    
    

}
