package com.hist.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hist.demo.vo.JwtUser;
import com.hist.demo.vo.Store;

@Mapper
public interface StoreMapper {
	public void insertStore(Store store);
	
	public void updateStore(Store store);
}
