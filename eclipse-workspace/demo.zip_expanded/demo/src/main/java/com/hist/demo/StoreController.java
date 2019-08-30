package com.hist.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hist.demo.service.StoreService;
import com.hist.demo.vo.Review;
import com.hist.demo.vo.Store;

@RestController()
public class StoreController {

	@Autowired
	StoreService storeService;

	@PostMapping("/store/insert")
	public void insertStore(@RequestBody Store store) {
		storeService.insertStore(store);
	}
	
	@PostMapping("/store/update")
	public void updateStore(@RequestBody Store store) {
		storeService.updateStore(store);
	}
	
	@PostMapping("/review/insert")
	public void insertReview(@RequestBody Review review) {
		storeService.insertReview(review);
	}
	
	
}
