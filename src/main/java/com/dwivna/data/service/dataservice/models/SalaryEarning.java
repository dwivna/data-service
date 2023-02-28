package com.dwivna.data.service.dataservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "salary_earning_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalaryEarning {

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

    @Column(name = "basic_pay", nullable = false)
    private Double basicPay;

    @Column(name = "special_allowance", nullable = false)
    private Double specialAllowance;

    @Column(name = "house_rent_allowance", nullable = false)
    private Double houseRentAllowance;

    @Column(name = "other_allowance")
    private Double otherAllowance;
}
