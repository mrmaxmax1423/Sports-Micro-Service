package app.dao;

import app.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IPlayerRepositoryDAO {

    Player savePlayer(Player player) throws Exception;

    List<Player> fetchAllPlayers();

    Player fetchById(int id);
}
