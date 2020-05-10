package com.v.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "ENABLED")
	private Integer enabled;
	//eager sayesinde authority nin deðerleride sorgulanacak
	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="username")
	private List<Authority> roles;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public List<Authority> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Authority> roles) {
		this.roles = roles;
	}

	public void addListRole(Authority authority) {
		if(roles==null) {
			roles=new ArrayList<Authority>();			
		}
		authority.setUsername(this.userName);
		roles.add(authority);
		
	}
	
	
}
