package app.service;

import app.model.Player;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface IPlayerService {

    Player fetchById(int id);

    List<Player> fetchAllPlayers();

    Player savePlayer(Player player) throws Exception;

}
