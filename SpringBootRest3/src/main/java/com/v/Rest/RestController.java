package com.v.Rest;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api3")
public class RestController {
	@RequestMapping("/test")
	public int test() {
		return 1;
	}
}
