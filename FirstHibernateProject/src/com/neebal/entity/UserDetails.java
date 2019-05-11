package com.neebal.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@OneToMany
	private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	/*@ElementCollection
	@JoinTable(name="address", joinColumns=@JoinColumn(name="user_id") )
	@GenericGenerator(name="mygen", strategy="sequence")
	@CollectionId(columns={@Column(name="id") }, generator="mygen", type=@Type(type="long"))
	private Collection<Address> addresses = new HashSet<Address>();*/
 	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	

/*	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}*/
	
	

}
