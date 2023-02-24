package com.dwivna.data.service.dataservice.services;

import com.dwivna.data.service.dataservice.models.Data;
import com.dwivna.data.service.dataservice.models.Month;
import com.dwivna.data.service.dataservice.models.SavingsScheme;
import com.dwivna.data.service.dataservice.models.Storage;

import java.util.List;

public interface IEnDataService {

    List<Month> getMonths();

    List<SavingsScheme> getSavingsScheme();

    List<Storage> getStorage();

    List<Data> getData();
}
