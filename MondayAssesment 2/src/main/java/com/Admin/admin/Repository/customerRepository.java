package com.Admin.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Admin.admin.entity.customerEntity;

public interface customerRepository  extends JpaRepository<customerEntity, Integer>{

}
