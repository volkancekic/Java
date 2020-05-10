package com.Entity.E;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
@Component
@Scope("singleton")
@SessionScope
@Entity
@Table(name="LOGIN")
public class Login {
	@Id
	@SequenceGenerator(name = "login_seq", sequenceName = "LOGIN_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login_seq")
	@Column(name = "id")
	private Integer id;
	
	@NotEmpty(message="E-Posta Alaný Boþ Býrakýlamaz.")	
	@Column(name="email")
	private String email;
	
	@NotEmpty(message="Þifre Alaný Boþ Býrakýlamaz.")
	@Column(name="sifre")
	private String sifre;

	public Login(String email, String sifre) {
		super();
		this.email = email;
		this.sifre = sifre;
	}

	public Login() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
}
