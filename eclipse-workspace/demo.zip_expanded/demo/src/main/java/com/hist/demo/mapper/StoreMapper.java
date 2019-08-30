package com.hist.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hist.demo.vo.Review;
import com.hist.demo.vo.Store;

@Mapper
public interface StoreMapper {
	
	public void insertStore(Store store);
	
	public void updateStore(Store store);
	
	public void insertReview(Review review);
	
}