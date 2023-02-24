package com.dwivna.data.service.dataservice.services;

import com.dwivna.data.service.dataservice.models.Month;
import com.dwivna.data.service.dataservice.models.SavingsScheme;

import java.util.List;

public interface IEnDataService {

    List<Month> getMonths();

    List<SavingsScheme> getSavingsScheme();
}
