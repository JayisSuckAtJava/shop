package com.shop.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;
@Entity
@Data
public class Customer {

	@Id
	@Column(length=20)
	String id;
	@Column(length = 10)
	String name, grade;
	@Nullable
	String job;
	@Nullable
	Integer age,point;
	
	@ToString.Exclude
	@JsonIgnore
	@OneToMany(mappedBy = "customers",fetch = FetchType.EAGER)
	List<Order> orders;
	
}
