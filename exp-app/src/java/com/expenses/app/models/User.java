/**
 *
 */
package com.expenses.app.models;

import java.lang.reflect.Field;
import java.security.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.websocket.ClientEndpoint;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    private String name;
    @Column(unique = true)
    private String email;

    @Column(name = "pass_hash")
    private String passHash;

    private String mobile;
    private Boolean validated;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    public Long id() {
        return id;
    }

    public User id(Long id) {
        this.id = id;
        return this;
    }

    public String email() {
        return email;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public String passHash() {
        return passHash;
    }

    public User passHash(String passHash) {
        this.passHash = passHash;
        return this;
    }

    public Timestamp createdAt() {
        return createdAt;
    }

    public User createdAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public boolean isValidated() {
        return validated;
    }

    public User validated(boolean validated) {
        this.validated = validated;
        return this;
    }

    public Timestamp updatedAt() {
        return updatedAt;
    }

    public User updatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String name() {
        return name;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public String mobile() {
        return mobile;
    }

    public User mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    // @Override
    // public String toString() {
    // StringBuilder sb = new StringBuilder();
    // Class claz = this.getClass();
    // for (Field f : claz.getFields()) {
    // Object type = f.getType();
    //
    // // sb.append(f.getName()).append(": ").append();
    // }
    // // TODO Auto-generated method stub
    // return super.toString();
    // }
}
