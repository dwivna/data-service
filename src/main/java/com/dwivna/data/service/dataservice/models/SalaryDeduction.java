package com.dwivna.data.service.dataservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "salary_deduction_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalaryDeduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "person_id", nullable = false)
    private String personId;

    @Column(name = "fy_id", nullable = false)
    private String financialYearId;

    @Column(name = "month_id", nullable = false)
    private String monthId;

    @Column(name = "deduction_for", nullable = false)
    private String deductionFor;

    @Column(name = "deduction_amount", nullable = false)
    private Double deductionAmount;

}
