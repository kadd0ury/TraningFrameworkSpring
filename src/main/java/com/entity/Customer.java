package com.entity;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	
	@Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    
    
    
    @ManyToMany 
    @JoinTable(name="customerTomagasin", joinColumns={@JoinColumn(referencedColumnName="id")}
    , inverseJoinColumns={@JoinColumn(referencedColumnName="id")})
    private List <Store>listeStore;
    
    
    public Customer() {

    }

    public List<Store> getListeStore() {
		return listeStore;
	}

	public void setListeStore(List<Store> listeStore) {
		this.listeStore = listeStore;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }

}
