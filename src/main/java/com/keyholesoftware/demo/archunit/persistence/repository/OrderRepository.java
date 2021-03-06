package com.keyholesoftware.demo.archunit.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.keyholesoftware.demo.archunit.domain.Order;

@Repository
public class OrderRepository implements DomainObjectRepository<Order, Long> {
  
  public OrderRepository() {
    super();
  }

  public List<Order> findAll(Iterable<Long> ids) {

    return null;
  }

  public <S extends Order> List<S> save(Iterable<S> entities) {

    return null;
  }

  @Override
  public void flush() {

    
  }

  @Override
  public <S extends Order> S saveAndFlush(S entity) {

    return null;
  }

  @Override
  public void deleteInBatch(Iterable<Order> entities) {

    
  }

  @Override
  public void deleteAllInBatch() {

    
  }

  @Override
  public Order getOne(Long id) {

    return null;
  }

  @Override
  public <S extends Order> List<S> findAll(Example<S> example) {

    return null;
  }

  @Override
  public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {

    return null;
  }

  @Override
  public <S extends Order> S save(S entity) {

    return null;
  }

  public Order findOne(Long id) {

    return null;
  }

  public boolean exists(Long id) {

    return false;
  }

  public void delete(Long id) {

    
  }

  public void delete(Iterable<? extends Order> entities) {

    
  }

  @Override
  public void deleteAll() {

    
  }

  @Override
  public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {

    return null;
  }

  @Override
  public <S extends Order> long count(Example<S> example) {

    return 0;
  }

  @Override
  public <S extends Order> boolean exists(Example<S> example) {

    return false;
  }

  @Override
  public List<Order> findAll(Sort sort) {

    return null;
  }

  @Override
  public Page<Order> findAll(Pageable pageable) {

    return null;
  }

  @Override
  public Optional<Order> findById(Long primaryKey) {

    return null;
  }

  @Override
  public List<Order> findAll() {

    return null;
  }

  @Override
  public long count() {

    return 0;
  }

  @Override
  public void delete(Order entity) {

    
  }

  @Override
  public boolean existsById(Long primaryKey) {

    return false;
  }

  @Override
  public List<Order> findAllById(Iterable<Long> ids) {
    return null;
  }

  @Override
  public <S extends Order> List<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public void deleteAll(Iterable<? extends Order> arg0) {
    
  }

  @Override
  public void deleteById(Long arg0) {
    
  }

  @Override
  public <S extends Order> Optional<S> findOne(Example<S> arg0) {
    return null;
  }


}