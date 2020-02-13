package io.bootloader.myapp.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dataService {

	@Autowired
	private dataRepository data_repository;

	public List<dataModel> get_data(){
		List<dataModel> user_data = new ArrayList<>(); 
		data_repository.findAll().forEach(user_data::add);
		return user_data;
	}

	public dataModel get_data_id(String id) {
		return data_repository.findOne(id);
	}

	public void add_data(dataModel data) {
		data_repository.save(data);
	}

	public void delete_data(String id) {
		data_repository.deleteById(id);
	}

	public void update_data(String id, dataModel new_data) {
//		for (int i=0; i < user_data.size(); i++) {
//			dataModel data = user_data.get(i);
//			if (data.getId().equals(id)) {
//				user_data.set(i, new_data);
//				return;
//			}
//		}
//		return;
		data_repository.save(new_data);
	}

}
