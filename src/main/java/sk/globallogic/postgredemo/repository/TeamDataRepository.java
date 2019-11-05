package sk.globallogic.postgredemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.globallogic.postgredemo.entity.TeamData;
import sk.globallogic.postgredemo.model.Coach;

@Repository
public interface TeamDataRepository extends JpaRepository<TeamData, Long> {

	List<TeamData> findByFirstName(String firstName);

	List<TeamData> findBySecondName(String secondName);

	List<TeamData> findByThirdName(String thirdName);

	List<TeamData> findByNation(String nation);

	List<TeamData> findByCity(String city);

	List<TeamData> findByLeague(String league);

	List<TeamData> findByCoach(Coach coach);

}
