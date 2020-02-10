package io.bootloader.myapp.data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@RequestMapping("/data")
	public String data_function() {
		return "some random data!";
	}

}
