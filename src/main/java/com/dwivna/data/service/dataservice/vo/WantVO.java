package com.dwivna.data.service.dataservice.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WantVO {
    private String category;
    private String wantFor;
    private Double wantAmount;
}
