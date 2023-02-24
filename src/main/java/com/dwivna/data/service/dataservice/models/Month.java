package com.dwivna.data.service.dataservice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "en_month_t")
@Getter
@Setter
public class Month {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "display", nullable = false)
    private String display;
    @Column(name = "order", nullable = false)
    private Integer order;
}
