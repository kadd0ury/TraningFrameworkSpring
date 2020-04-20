package com.service;

import java.util.List;

import com.entity.Store;


public interface  StoreSer {
	
	
	

	public List < Store > getAllStores();

    public void saveStore(Store store);

    public Store getStore(int storeId);

    public void deleteStore(int storeId);
	
	
	
	
	

}
