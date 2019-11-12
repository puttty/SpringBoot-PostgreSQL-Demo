package sk.globallogic.postgredemo.service.player;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.globallogic.postgredemo.entity.PlayerData;
import sk.globallogic.postgredemo.repository.PlayerDataRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerDataRepository playerDataRepository;

	@Override
	public List<PlayerData> getAllPlayerData() {
		return playerDataRepository.findAll();
	}

	@Override
	public Optional<PlayerData> getPlayerData(Long id) {
		return playerDataRepository.findById(id);
	}

	@Override
	public PlayerData addPlayerData(String firstName, String LastName, LocalDate birthDay) {

		return null;
	}

	@Override
	public void updatePlayerData(Long id, PlayerData player) {

	}

	@Override
	public void deletePlayerData(Long id) {

	}
}
