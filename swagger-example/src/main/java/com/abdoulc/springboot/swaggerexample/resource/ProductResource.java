package com.abdoulc.springboot.swaggerexample.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/product")
@Api(value = "Product Resource")
public class ProductResource {
	
	@GetMapping
	@ApiOperation(value = "Return List of products")
	public List<Product> getProducts(){
		//hard coded :)
		return Arrays.asList(
				new Product("p1","cat1",2000L),
				new Product("p2","cat2",500L),
				new Product("p3","cat3",10L)
			);
	}
	
	@GetMapping("/{productName}")
	@ApiOperation(value = "Return given productName)")
	public Product getProduct(@PathVariable String productName) {
		return new Product(productName," ",10L);
	}
}
