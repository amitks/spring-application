package io.bootloader.myapp.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@RequestMapping("/data")
	public List<dataModule> data_function() {

		return Arrays.asList(
				new dataModule("100", "john", "manager"),
				new dataModule("101", "sam", "director"),
				new dataModule("102", "matt", "engineer")
				);

		//return "some random data!";
	}

}
