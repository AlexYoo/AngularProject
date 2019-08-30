package com.hist.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hist.demo.mapper.ReviewMapper;
import com.hist.demo.vo.Review;

@Component
public class ReviewService {
	
	@Autowired
	ReviewMapper reviewMapper;
	
	public void insertReview(Review review) {
		review.setUptId(review.getRegId());
		reviewMapper.insertReview(review);
	}
	
	public void updateReview(Review review) {
		review.setUptId(review.getRegId());
		reviewMapper.updateReview(review);
	}
	
	public List<Review> selectReview(){
		return reviewMapper.selectReview();
	}
}
