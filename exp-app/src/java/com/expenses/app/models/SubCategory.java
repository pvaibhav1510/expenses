package com.expenses.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sub_categories")
public class SubCategory {

    @Id
    private Long id;
    @Column(name = "category_id")
    private Long categoryId;
    private String label;

    public Long id() {
        return id;
    }

    public SubCategory id(Long id) {
        this.id = id;
        return this;
    }

    public Long categoryId() {
        return categoryId;
    }

    public SubCategory categoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String label() {
        return label;
    }

    public SubCategory label(String label) {
        this.label = label;
        return this;
    }
}
