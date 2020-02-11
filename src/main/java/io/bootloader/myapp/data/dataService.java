package io.bootloader.myapp.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class dataService {

	private List<dataModule> user_data = new ArrayList<dataModule>(Arrays.asList(
		new dataModule("100", "john", "manager"),
		new dataModule("101", "sam", "director"),
		new dataModule("102", "matt", "engineer")
		));

	public List<dataModule> get_data(){
		return user_data;
	}

	public dataModule get_data_id(String id) {
		for (int i=0 ; i < user_data.size(); i++ ) {
			dataModule data = user_data.get(i);
			if (data.getId().equals(id))
				return data;
		}
		return new dataModule();
	}

	public void add_data(dataModule data) {
		user_data.add(data);
	}

	public void delete_data(String id) {
		for (int i=0; i < user_data.size(); i++) {
			dataModule data = user_data.get(i);
			if (data.getId().equals(id)) {
				user_data.remove(i);
				return;
			}
		}
		return;
	}

	public void update_data(String id, dataModule new_data) {
		for (int i=0; i < user_data.size(); i++) {
			dataModule data = user_data.get(i);
			if (data.getId().equals(id)) {
				user_data.set(i, new_data);
				return;
			}
		}
		return;
	}

}
