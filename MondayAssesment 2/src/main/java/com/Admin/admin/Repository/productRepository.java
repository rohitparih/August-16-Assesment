package com.Admin.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Admin.admin.entity.productEntity;

public interface productRepository extends JpaRepository<productEntity, Integer> {

}
