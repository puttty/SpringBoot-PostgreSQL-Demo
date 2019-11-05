package sk.globallogic.postgredemo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.globallogic.postgredemo.entity.LeagueData;

@Repository
public interface LeagueDataRepository extends JpaRepository<LeagueData, Long> {

	List<LeagueData> findByName(String name);

	List<LeagueData> findByNation(String nation);

}
