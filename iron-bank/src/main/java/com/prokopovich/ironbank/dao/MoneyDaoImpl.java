package com.prokopovich.ironbank.dao;

import com.prokopovich.ironbank.model.Bank;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MoneyDaoImpl implements MoneyDao {

    @Override
    public List<Bank> findAll() {
        return null;
    }

    @Override
    public List<Bank> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Bank> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Bank> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Bank bank) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Bank> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Bank> S save(S s) {
        return null;
    }

    @Override
    public <S extends Bank> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Bank> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Bank> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Bank> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Bank> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Bank getOne(String s) {
        return null;
    }

    @Override
    public Bank getById(String s) {
        return null;
    }

    @Override
    public <S extends Bank> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Bank> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Bank> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Bank> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Bank> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Bank> boolean exists(Example<S> example) {
        return false;
    }
}
