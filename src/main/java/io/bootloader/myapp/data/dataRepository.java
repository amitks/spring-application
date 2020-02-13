package io.bootloader.myapp.data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface dataRepository extends CrudRepository<dataModel, String> {

	 @Query(value = "SELECT * FROM datatable WHERE id = ?1", nativeQuery = true)
	 dataModel findOne(String id);
}
