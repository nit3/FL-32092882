package com.arbac.oursystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Owner extends com.arbac.oursystem.models.Entity {

    @Getter
    @Setter
    @Column(name = "NAME",unique = true)
    private String name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "owner")
    private Set<Role> roles;

    @Getter
    @Setter
    @OneToMany(mappedBy = "owner")
    private Set<User> users;

    @Getter
    @Setter
    @Column(name = "ENCRYPTED_SK")
    private String encryptedSK;

}
