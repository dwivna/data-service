package com.dwivna.data.service.dataservice.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonVO {

    private String personId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String financialYear;

    private Map<Integer, SalaryVO> monthSalary;

    private SaveVO savings;

    private Map<Integer, List<NeedVO>> monthNeeds;

    private Map<Integer, List<WantVO>> monthWants;
}
