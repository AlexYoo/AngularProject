package com.hist.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hist.demo.mapper.JwtMapper;
import com.hist.demo.mapper.StoreMapper;
import com.hist.demo.service.StoreService;
import com.hist.demo.vo.JwtUser;
import com.hist.demo.vo.Store;

@RestController()
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	//@RequestParam(value="name", defaultValue = "world") String name
	@PostMapping("/store/insert")
	public void insertStore(@RequestBody Store store) {
		storeService.insertStore(store);
	}
	
	@PostMapping("/store/update")
	public void updateStore(@RequestBody Store store) {
		storeService.udpateStore(store);
	}
	
}
