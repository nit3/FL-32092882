package com.arbac.oursystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User extends com.arbac.oursystem.models.Entity {

    @Getter
    @Setter
    @Column(name = "FULL_NAME")
    private String fullName;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "OWNER_ID", nullable = false)
    private Owner owner;

    @Getter
    @Setter
    @Column(name = "EMAIL")
    private String email;

    @Getter
    @Setter
    @Column(name = "VERIFIED")
    private Boolean verified;
}
