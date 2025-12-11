package com.stream.hard2;

import java.time.LocalDate;

public class Transaction {
	
	private String id;
	private LocalDate date;
	private double amount;
	public Transaction(String id, LocalDate date, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
