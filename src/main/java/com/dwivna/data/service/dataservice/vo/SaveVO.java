package com.dwivna.data.service.dataservice.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveVO {
    Map<Integer, List<StorageVO>> personalStorages;
    Map<Integer, List<DeductionVO>> personalDeductions;
}
