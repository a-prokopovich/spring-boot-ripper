package com.prokopovich.ironbank.dao;

import com.prokopovich.ironbank.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyDao extends JpaRepository<Bank, String> {
}
