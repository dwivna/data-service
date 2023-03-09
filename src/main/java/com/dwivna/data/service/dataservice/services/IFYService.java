package com.dwivna.data.service.dataservice.services;

import com.dwivna.data.service.dataservice.vo.FinancialYearVO;
import com.dwivna.data.service.dataservice.vo.OptionVO;

import java.util.List;

public interface IFYService {

    List<OptionVO> getFinancialYearCombo();

    FinancialYearVO getFinancialYear(String financialYearId);

    FinancialYearVO addFinancialYear(String financialYear);

    String deleteFinancialYear(String financialYearId);
}
