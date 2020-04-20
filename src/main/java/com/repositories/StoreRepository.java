package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Store;



@Repository("StoreRepository")
public interface StoreRepository  extends JpaRepository<Store, Integer>{

}
