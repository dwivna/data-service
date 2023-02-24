package com.dwivna.data.service.dataservice.repositories;

import com.dwivna.data.service.dataservice.models.SavingsScheme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsSchemeRepository extends PagingAndSortingRepository<SavingsScheme, String>, CrudRepository<SavingsScheme, String> {

}
