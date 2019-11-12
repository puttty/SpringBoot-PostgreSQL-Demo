package sk.globallogic.postgredemo.service.coach;

import java.util.List;
import sk.globallogic.postgredemo.entity.PlayerData;

public interface CoachService {

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
	PlayerData getPlayerData(Long id);

	/**
	 * Method for saving Player to database
	 *
	 * @param player
	 * @return
	 */
	PlayerData addPlayerData(PlayerData player);

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
