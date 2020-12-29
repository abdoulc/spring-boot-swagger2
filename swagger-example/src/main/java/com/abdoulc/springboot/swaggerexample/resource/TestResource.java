package com.abdoulc.springboot.swaggerexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/test")
@Api(value = "Test Resource")
public class TestResource {
	
	@ApiOperation(value = "Return Hello World")
	@ApiResponses(
			value = {
					@ApiResponse(code = 103, message = "testing 103 message"),
					@ApiResponse(code = 200, message = "successful  Hello world"),
					
			}
	)
	@GetMapping
	public String test() {
		return "Hello World";
	}
	
	@ApiOperation(value = "Return given String")
	@PostMapping("/post")
	public String testPost(@RequestBody String test) {
		return test;
	}
	
	@ApiOperation(value = "Return Hgiven String")
	@PutMapping("/put")
	public String testPut(@RequestBody String test) {
		return test;
	}
}
