package com.dwivna.data.service.dataservice.services.impl;

import com.dwivna.data.service.dataservice.exceptions.ResourceNotFoundException;
import com.dwivna.data.service.dataservice.models.FinancialYear;
import com.dwivna.data.service.dataservice.repositories.FinancialYearRepository;
import com.dwivna.data.service.dataservice.services.IFYService;
import com.dwivna.data.service.dataservice.vo.FinancialYearVO;
import com.dwivna.data.service.dataservice.vo.OptionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class FYService implements IFYService {

    @Autowired
    private FinancialYearRepository financialYearRepository;

    @Override
    public List<OptionVO> getFinancialYearCombo() {
        List<OptionVO> options = new ArrayList<>();
        Sort sort = Sort.by(Sort.DEFAULT_DIRECTION, "financialYear");
        StreamSupport.stream(financialYearRepository.findAll(sort).spliterator(), false).forEach(x -> {
            options.add(new OptionVO(x.getId(), x.getFinancialYear()));
        });
        return options;
    }

    @Override
    public FinancialYearVO getFinancialYear(String financialYearId) {
        Optional<FinancialYear> financialYearOption = financialYearRepository.findById(financialYearId);
        if (financialYearOption.isPresent()) {
            FinancialYear financialYear = financialYearOption.get();
            return new FinancialYearVO(financialYear.getId(), financialYear.getFinancialYear());
        } else {
            throw new ResourceNotFoundException("financialYearId", financialYearId);
        }
    }

    @Override
    public FinancialYearVO addFinancialYear(String financialYear) {
        FinancialYear financialYearEntity = new FinancialYear();
        financialYearEntity.setFinancialYear(financialYear);
        financialYearEntity = financialYearRepository.save(financialYearEntity);
        return new FinancialYearVO(financialYearEntity.getId(), financialYearEntity.getFinancialYear());
    }

    @Override
    public String deleteFinancialYear(String financialYearId) {
        FinancialYearVO financialYearVO = getFinancialYear(financialYearId);
        financialYearRepository.delete(new FinancialYear(financialYearVO.getId(), financialYearVO.getFinancialYear()));
        return "Deleted financial year id " + financialYearId;
    }

}
