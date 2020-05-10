package com.vEntity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OGRETMEN")
public class Ogretmen {

	@Id
	@SequenceGenerator(name = "ogr_seq", sequenceName = "OGRETMEN_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ogr_seq")
	@Column(name = "id")
	private Integer id;

	@OneToMany(fetch = FetchType.EAGER, mappedBy="ogretmen", cascade = CascadeType.ALL)
	private List<Kurs> kurslar;
	
	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "email")
	private String email;

	public Ogretmen(String firstname, String lastname, String email) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public Ogretmen() {

	}

	public Integer getId() {
		return id;
	}

	public List<Kurs> getKurslar() {
		return kurslar;
	}

	public void setKurslar(List<Kurs> kurslar) {
		this.kurslar = kurslar;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void addKurs(Kurs kurs) {
		if(kurslar==null) {
			kurslar=new ArrayList<Kurs>();			
		}
		kurslar.add(kurs);
		kurs.setOgretmen(this);
	}

	@Override
	public String toString() {
		return "Ogretmen [id=" + id + ",  firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + "]";
	}
	
}
