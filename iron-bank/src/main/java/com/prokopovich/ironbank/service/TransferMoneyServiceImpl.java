package com.prokopovich.ironbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferMoneyServiceImpl implements TransferMoneyService {

    private final ProphetService prophetService;

    @Autowired
    public TransferMoneyServiceImpl(ProphetService prophetService) {
        this.prophetService = prophetService;
    }

    @Override
    public long transfer(String name, long amount) {

        return prophetService.willSurvive(name) ? amount : 0;
    }
}
