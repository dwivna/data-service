package com.dwivna.data.service.dataservice.controllers;

import com.dwivna.data.service.dataservice.models.Data;
import com.dwivna.data.service.dataservice.models.Month;
import com.dwivna.data.service.dataservice.models.SavingsScheme;
import com.dwivna.data.service.dataservice.models.Storage;
import com.dwivna.data.service.dataservice.services.IEnDataService;
import com.dwivna.data.service.dataservice.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/en/data")
public class EnDataController {

    @Autowired
    private IEnDataService dataService;

    @GetMapping(path = "")
    public DataVO getData() {
        List<Month> months = dataService.getMonths();
        List<SavingsScheme> savingsSchemes = dataService.getSavingsScheme();
        List<Storage> storages = dataService.getStorage();
        List<Data> data = dataService.getData();
        return new DataVO(months, savingsSchemes,storages,data);
    }
}
