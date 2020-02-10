package io.bootloader.myapp.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class dataService {

	private List<dataModule> user_data = Arrays.asList(
		new dataModule("100", "john", "manager"),
		new dataModule("101", "sam", "director"),
		new dataModule("102", "matt", "engineer")
		);

	public List<dataModule> get_data(){
		return user_data;
	}

}
