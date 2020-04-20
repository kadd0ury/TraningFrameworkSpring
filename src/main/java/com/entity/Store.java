package com.entity;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="magasin")
public class Store {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	
	@Column(name = "nom")
	private String nom ;
	
	
	@Column(name = "adresse")
	private String adresse ;
	
	@ManyToMany(mappedBy="listeStore")
	private List <Customer>listecustomer ;
	
	public Store () {	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}

	
	
	
	
	
	
	
	

}
