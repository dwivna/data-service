package com.dwivna.data.service.dataservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "financial_year_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FinancialYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "financial_year", nullable = false)
    private String financialYear;

}
