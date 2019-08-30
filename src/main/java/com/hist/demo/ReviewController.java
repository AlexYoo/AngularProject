package com.hist.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hist.demo.service.ReviewService;
import com.hist.demo.vo.Review;

@RestController
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@RequestMapping("/review")
	public List<Review> selectReview(){
		return reviewService.selectReview();
	}
	
	@PostMapping("/review/insert")
	public void insertReview(@RequestBody Review review) {
		reviewService.insertReview(review);
	}
	
	@PostMapping("/review/update")
	public void updateReview(@RequestBody Review review) {
		reviewService.updateReview(review);
	}
}
