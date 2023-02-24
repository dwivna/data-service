package com.dwivna.data.service.dataservice.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonthDisplayVO {

    private Integer monthId;
    private Integer displayOrder;
    private String monthName;
    private String monthCode;
}
