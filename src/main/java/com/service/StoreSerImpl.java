package com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.entity.Store;
import com.repositories.StoreRepository;


@Service
public class StoreSerImpl implements StoreSer {
	
	@Qualifier("StoreRepository")
	@Autowired
	private StoreRepository storerep ;

	@Override
	@Transactional
	public List<Store> getAllStores() {
		return  storerep.findAll();
	}

	@Override
	@Transactional
	public void saveStore(Store store) {
		
		storerep.save(store);
		
	
		
	}

	@Override
	@Transactional
	public Store getStore(int storeId) {
		
		return storerep.findById(storeId).get();
		
	}

	@Override
	@Transactional
	public void deleteStore(int storeId) {
		storerep.deleteById(storeId);
	
	}
	
	
	

}
