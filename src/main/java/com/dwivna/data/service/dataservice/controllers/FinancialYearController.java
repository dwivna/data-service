package com.dwivna.data.service.dataservice.controllers;

import com.dwivna.data.service.dataservice.services.IFYService;
import com.dwivna.data.service.dataservice.vo.FinancialYearVO;
import com.dwivna.data.service.dataservice.vo.OptionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/financial/year")
public class FinancialYearController {

    @Autowired
    private IFYService fyService;

    @GetMapping
    public List<OptionVO> getFinancialYearOption() {
        return fyService.getFinancialYearCombo();
    }

    @GetMapping(path = "/{fyId}")
    public FinancialYearVO getFinancialYearDetail(@PathVariable("fyId") String fyId) {
        return fyService.getFinancialYear(fyId);
    }

    @PostMapping
    public FinancialYearVO addFinancialYearDetail(@RequestParam("financialYear") String financialYear) {
        return fyService.addFinancialYear(financialYear);
    }

    @DeleteMapping
    public String deleteFinancialYearDetail(@RequestParam("fyId") String fyId) {
        return fyService.deleteFinancialYear(fyId);
    }

}
