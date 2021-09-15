package com.prokopovich.ironbank.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferMoneyServiceImpl implements TransferMoneyService {

    private final ProphetService prophetService;

    @Override
    public long transfer(String name, long amount) {

        return prophetService.willSurvive(name) ? amount : 0;
    }
}
