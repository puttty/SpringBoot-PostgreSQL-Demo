package sk.globallogic.postgredemo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sk.globallogic.postgredemo.model.UserData;

public interface UserDataRepository extends CrudRepository<UserData, Long> {

	List<UserData> findByFirstName(String firstName);

	List<UserData> findByLastName(String lastName);

	List<UserData> findByAge(int age);
}
