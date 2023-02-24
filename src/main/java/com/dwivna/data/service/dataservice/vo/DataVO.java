package com.dwivna.data.service.dataservice.vo;

import com.dwivna.data.service.dataservice.models.Data;
import com.dwivna.data.service.dataservice.models.Month;
import com.dwivna.data.service.dataservice.models.SavingsScheme;
import com.dwivna.data.service.dataservice.models.Storage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataVO {

    private List<Month> months;
    private List<SavingsScheme> savingsSchemes;
    private List<Storage> storage;
    private List<Data> data;
}
