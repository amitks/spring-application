package io.bootloader.myapp.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Autowired
	private dataService data_service;

	@RequestMapping("/data")
	public List<dataModule> get_data() {
		return data_service.get_data();
	}

	@RequestMapping("/data/{id}")
	public dataModule get_data_id(@PathVariable String id) {
		return data_service.get_data_id(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/data")
	public void post_data(@RequestBody dataModule data) {
		data_service.add_data(data);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/data/{id}")
	public void post_data(@RequestBody dataModule data, @PathVariable String id) {
		data_service.update_data(id, data);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/data/{id}")
	public void delete_data(@PathVariable String id) {
		data_service.delete_data(id);
	}

}
