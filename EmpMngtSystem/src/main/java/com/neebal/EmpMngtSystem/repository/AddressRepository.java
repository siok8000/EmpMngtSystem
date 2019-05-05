package com.neebal.EmpMngtSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neebal.EmpMngtSystem.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
