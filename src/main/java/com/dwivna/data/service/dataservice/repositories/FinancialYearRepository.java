package com.dwivna.data.service.dataservice.repositories;

import com.dwivna.data.service.dataservice.models.FinancialYear;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialYearRepository extends PagingAndSortingRepository<FinancialYear, String>, CrudRepository<FinancialYear, String> {
    FinancialYear findAllByFinancialYear(String financialYear);
}
