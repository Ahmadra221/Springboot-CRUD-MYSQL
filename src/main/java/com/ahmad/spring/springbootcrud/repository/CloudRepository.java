package com.ahmad.spring.springbootcrud.repository;


import com.ahmad.spring.springbootcrud.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudRepository extends JpaRepository<CloudVendor,String> {
}
