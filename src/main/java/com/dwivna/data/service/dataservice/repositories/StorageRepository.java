package com.dwivna.data.service.dataservice.repositories;

import com.dwivna.data.service.dataservice.models.Storage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends PagingAndSortingRepository<Storage, String>, CrudRepository<Storage, String> {

}
