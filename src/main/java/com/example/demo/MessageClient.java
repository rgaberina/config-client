/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author berina
 *
 */
@RefreshScope
@RestController
public class MessageClient {
	
	@Value("${message}")
	private String message;
	
	@RequestMapping("/")
	public String getMessage(@RequestParam(value="name", defaultValue="World")String name) {
		return String.format(this.message, name);
	}

}
