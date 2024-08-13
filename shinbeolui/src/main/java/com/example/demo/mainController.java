package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class mainController {
	private static final Logger logger = Logger.getLogger(mainController.class.getName());
	
	@GetMapping("/hello")
    public Map<String, String> getHello() {
		logger.info("SUCCESS");
        Map<String, String> response = new HashMap<>();
        response.put("message", "spring boot mapping test success main");
        return response;
    }
}
