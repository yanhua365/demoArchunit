package com.keyholesoftware.demo.archunit.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.keyholesoftware.demo.archunit.domain.Customer;

@Repository
public class CustomerRepository implements DomainObjectRepository<Customer, Long> {

  public CustomerRepository() {
    super();
  }

  @Override
  public List<Customer> findAll(Iterable<Long> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Customer> List<S> save(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void flush() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Customer> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteInBatch(Iterable<Customer> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllInBatch() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Customer getOne(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Customer> List<S> findAll(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Customer> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Customer findOne(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean exists(Long id) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void delete(Iterable<? extends Customer> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Customer> S findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Customer> long count(Example<S> example) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public <S extends Customer> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<Customer> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Page<Customer> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Customer> findById(Long primaryKey) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Customer> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void delete(Customer entity) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean existsById(Long primaryKey) {
    // TODO Auto-generated method stub
    return false;
  }
   
    
   /* @Query(value = "SELECT C FROM CUSTOMERS C WHERE C.EMAIL_ADDRESS = :emailAddress", nativeQuery = true)
    Customer findByEmailAddress(String emailAddress);
    
    @Query("SELECT C FROM CUSTOMERS C WHERE C.FIRSTNAME = :firstName OR C.LASTNAME = :lastName")
    Customer findByLastNameOrFirstName(@Param("lastName") String lastName, @Param("firstName") String firstName);

    List<Customer> findByLastName(String lastName);*/
  
}