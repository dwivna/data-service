package com.dwivna.data.service.dataservice.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalaryVO {
    private Double basicPay;

    private Double specialAllowance;

    private Double houseRentAllowance;

    private Double otherAllowance;

    private List<DeductionVO> deductions;
}
