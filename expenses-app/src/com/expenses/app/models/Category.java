package com.expenses.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	private Long id;
	@Column(name = "user_id")
	private Long userId;
	private String label;

	public Long id() {
		return id;
	}

	public Category id(Long id) {
		this.id = id;
		return this;
	}

	public Long userId() {
		return userId;
	}

	public Category userId(Long userId) {
		this.userId = userId;
		return this;
	}

	public String label() {
		return label;
	}

	public Category label(String label) {
		this.label = label;
		return this;
	}
}
