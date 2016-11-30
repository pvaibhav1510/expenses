package com.expenses.app.models;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    private Long id;
    @Column(name = "cuatomer_id")
    private Long customerId;
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "subCategory_id")
    private Long subCategoryId;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp date;
    private Double amount;

    @Lob // text datatype in db
    private String description;

    public Long id() {
        return id;
    }

    public Expense id(Long id) {
        this.id = id;
        return this;
    }

    public Long customerId() {
        return customerId;
    }

    public Expense customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Timestamp date() {
        return date;
    }

    public Expense date(Timestamp date) {
        this.date = date;
        return this;
    }

    public Double amount() {
        return amount;
    }

    public Expense amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Long categoryId() {
        return categoryId;
    }

    public Expense categoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long subCategoryId() {
        return subCategoryId;
    }

    public Expense subCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
        return this;
    }
}
