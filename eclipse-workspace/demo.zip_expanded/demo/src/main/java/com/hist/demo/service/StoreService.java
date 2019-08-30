package com.hist.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hist.demo.mapper.StoreMapper;
import com.hist.demo.vo.Review;
import com.hist.demo.vo.Store;


@Component
public class StoreService {
	
	@Autowired
	StoreMapper storeMapper;
	
	public void insertStore(Store store) {
		store.setUptId(store.getRegId());
		storeMapper.insertStore(store);
	}

	public void updateStore(Store store) {
		store.setUptId(store.getRegId());
		storeMapper.updateStore(store);
	}
	
	public void insertReview(Review review) {
		review.setUptId(review.getRegId());
		storeMapper.insertReview(review);
	}
	
	

	
}