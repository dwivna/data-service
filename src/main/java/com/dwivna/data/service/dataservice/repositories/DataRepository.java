package com.dwivna.data.service.dataservice.repositories;

import com.dwivna.data.service.dataservice.models.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends PagingAndSortingRepository<Data, String>, CrudRepository<Data, String> {

}
