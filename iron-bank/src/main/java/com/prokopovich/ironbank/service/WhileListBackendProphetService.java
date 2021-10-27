package com.prokopovich.ironbank.service;

import com.prokopovich.starter.config.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ProfileConstants.ЗИМА_ТУТА")
@RequiredArgsConstructor
public class WhileListBackendProphetService implements ProphetService {

    private final ProphetProperties prophetProperties;

    @Override
    public boolean willSurvive(String name) {
        return prophetProperties.getТеКтоВозвращаютДолги().contains(name);
    }
}
