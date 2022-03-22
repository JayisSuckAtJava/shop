package com.shop.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.Nullable;

import lombok.Data;

@Data
@Entity
public class Order {

	@Id
	@GeneratedValue
	Integer id;
	

	@ManyToOne
	@JoinColumn(name="customer_id",referencedColumnName = "id")
	Customer customers;
	// 상대방 객체명_PK명 name 지정 공식 - 상대 테이블_컬럼 에도 이렇게 표시해야함.
	// cutomer_id 이렇게 된다.
	
	// 이런것 처럼 nullable 을 Column 으로 지정 가능.
	@Column(length = 30,nullable = true)
	String name,dest;
	
	@Nullable
	Integer count;
	
	@Nullable
	@Temporal(TemporalType.DATE)
	Date ordDate;
}
