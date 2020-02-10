package io.bootloader.myapp.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Autowired
	private dataService data_service;
	
	@RequestMapping("/data")
	public List<dataModule> data_function() {

		return data_service.get_data();

		//return "some random data!";
	}

}
