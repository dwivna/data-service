package com.dwivna.data.service.dataservice.services.impl;

import com.dwivna.data.service.dataservice.models.Data;
import com.dwivna.data.service.dataservice.models.Month;
import com.dwivna.data.service.dataservice.models.SavingsScheme;
import com.dwivna.data.service.dataservice.models.Storage;
import com.dwivna.data.service.dataservice.repositories.DataRepository;
import com.dwivna.data.service.dataservice.repositories.MonthRepository;
import com.dwivna.data.service.dataservice.repositories.SavingsSchemeRepository;
import com.dwivna.data.service.dataservice.repositories.StorageRepository;
import com.dwivna.data.service.dataservice.services.IEnDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EnDataService implements IEnDataService {
    @Autowired
    private MonthRepository monthRepository;
    @Autowired
    private SavingsSchemeRepository savingsSchemeRepository;
    @Autowired
    private StorageRepository storageRepository;
    @Autowired
    private DataRepository dataRepository;

    @Override
    @Cacheable("months")
    public List<Month> getMonths() {
        Sort sort = Sort.by(Sort.DEFAULT_DIRECTION, "order");
        return StreamSupport.stream(monthRepository.findAll(sort).spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable("savingsScheme")
    public List<SavingsScheme> getSavingsScheme() {
        Sort sort = Sort.by(Sort.DEFAULT_DIRECTION, "name");
        return StreamSupport.stream(savingsSchemeRepository.findAll(sort).spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable("storage")
    public List<Storage> getStorage() {
        Sort sort = Sort.by(Sort.DEFAULT_DIRECTION, "name");
        return StreamSupport.stream(storageRepository.findAll(sort).spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable("data")
    public List<Data> getData() {
        Sort sort = Sort.by(Sort.DEFAULT_DIRECTION, "data");
        return StreamSupport.stream(dataRepository.findAll(sort).spliterator(), false)
                .collect(Collectors.toList());
    }
}
