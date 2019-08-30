package com.hist.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hist.demo.vo.JwtUser;
import com.hist.demo.vo.Review;
import com.hist.demo.vo.Store;

@Mapper
public interface ReviewMapper {
	public void insertReview(Review review);	
	public void updateReview(Review Review);
	public List<Review> selectReview();
}
