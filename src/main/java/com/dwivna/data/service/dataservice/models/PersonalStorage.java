package com.dwivna.data.service.dataservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "personal_storage_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonalStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "person_id", nullable = false)
    private String personId;

    @Column(name = "fy_id", nullable = false)
    private String financialYearId;

    @Column(name = "month_id", nullable = false)
    private String monthId;

    @Column(name = "store_in", nullable = false)
    private String storeIn;

    @Column(name = "store_amount", nullable = false)
    private Double storeAmount;

}
