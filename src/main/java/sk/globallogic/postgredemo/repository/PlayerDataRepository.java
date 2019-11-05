package sk.globallogic.postgredemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.globallogic.postgredemo.entity.PlayerData;

@Repository
public interface PlayerDataRepository extends JpaRepository<PlayerData, Long> {

	List<PlayerData> findByFirstName(String firstName);

	List<PlayerData> findByLastName(String lastName);

	List<PlayerData> findByAge(int age);

	List<PlayerData> findByNationality(String nationality);

	List<PlayerData> findByTeam(String team);
}
