package com.microservice.example.forex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCYCODE")
public class CurrencyCodes {

	@Id
	private int id;
	@Column
	private String Code;

	public CurrencyCodes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyCodes(int id, String code) {
		super();
		this.id = id;
		Code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

}
