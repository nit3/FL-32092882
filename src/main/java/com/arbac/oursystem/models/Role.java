package com.arbac.oursystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Role extends com.arbac.oursystem.models.Entity {

    @Getter
    @Setter
    @Column(name = "NAME", nullable = false)
    private String name;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "OWNER_ID", nullable = false)
    private Owner owner;

}
