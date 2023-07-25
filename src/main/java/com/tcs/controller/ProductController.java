package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.binding.ProductEntity;
import com.tcs.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	@GetMapping(value="/product",produces = {"application/json"} )
	public ProductEntity getProductBasedonId(@RequestParam("pid") String pid) {
		
		return service.findById(Integer.parseInt(pid));
		
	}

}
