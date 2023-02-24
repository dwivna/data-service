package com.dwivna.data.service.dataservice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "en_savings_scheme_t")
@Getter
@Setter
public class SavingsScheme {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
}
