package com.tcs.service;

import org.springframework.stereotype.Service;

import com.tcs.binding.ProductEntity;
import com.tcs.exception.NoProductFoundException;
@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public ProductEntity findById(Integer pid) {
if(pid==101) {
		return new ProductEntity(101,"Mouse",100.0);
}else {
	throw new NoProductFoundException("No Product found ");
}
	}
}
