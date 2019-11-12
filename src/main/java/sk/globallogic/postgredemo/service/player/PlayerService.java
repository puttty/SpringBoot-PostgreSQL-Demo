package sk.globallogic.postgredemo.service.player;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import sk.globallogic.postgredemo.entity.PlayerData;

public interface PlayerService {

	/**
	 * Method for getting all data from table league_data
	 *
	 * @return
	 */
	List<PlayerData> getAllPlayerData();

	/**
	 * Method for getting data for specific id
	 *
	 * @param id
	 * @return
	 */
	Optional<PlayerData> getPlayerData(Long id);

	/**
	 * Method for saving Player to database
	 *
	 * @param player
	 * @return
	 */
	PlayerData addPlayerData(String firstName, String lastName, LocalDate birthDay);

	/**
	 * Method for updating Player Data
	 *
	 * @param player
	 */
	void updatePlayerData(Long id, PlayerData player);

	/**
	 * Method for deleting Player Data
	 *
	 * @param id
	 */
	void deletePlayerData(Long id);


}
