package com.prokopovich.ironbank.controller;

import com.prokopovich.ironbank.dao.MoneyDao;
import com.prokopovich.ironbank.service.TransferMoneyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class IronBankController {

    private final TransferMoneyService transferMoneyService;
    private final MoneyDao moneyDao;

    @GetMapping("/credit")
    public String credit(@RequestParam String name, @RequestParam long amount) {

        long resultedDeposit = transferMoneyService.transfer(name, amount);

        if (resultedDeposit > 0) {
            return "</i>Credit approved for " + name + "</i> <br/>Current bank balance: <b> " + resultedDeposit + "</b>";
        }

        return "Rejected</br>" + name + "<b>will not</b> survive this winter";
    }

    @GetMapping("/state")
    public long currentState() {
        return moneyDao.findAll().get(0).getTotalAmount();
    }
}
