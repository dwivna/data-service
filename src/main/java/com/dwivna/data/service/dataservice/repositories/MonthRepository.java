package com.dwivna.data.service.dataservice.repositories;

import com.dwivna.data.service.dataservice.models.Month;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends PagingAndSortingRepository<Month, String>, CrudRepository<Month, String> {

}
