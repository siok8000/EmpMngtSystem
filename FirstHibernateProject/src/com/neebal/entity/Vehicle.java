package com.neebal.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="vehicle_type", discriminatorType=DiscriminatorType.STRING)
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	/*@ManyToOne
	@JoinColumn(name="user_id")
	private UserDetails userDetails;
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

/*	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}*/
}
