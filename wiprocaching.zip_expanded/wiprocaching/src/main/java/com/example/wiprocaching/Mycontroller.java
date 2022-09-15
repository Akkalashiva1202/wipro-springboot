package com.example.wiprocaching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Mycontroller {

	@Cacheable("mycachemem")
	@GetMapping
	public String getdata()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hello from Api";
	}
	
	
	@CacheEvict("mycachemem")
	@PostMapping
	public String postdata()
	{
		return "new data added";
	}
	

}
