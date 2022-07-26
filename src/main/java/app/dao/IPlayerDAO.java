package app.dao;

import app.model.Player;

import java.util.List;


public interface IPlayerDAO {

    Player savePlayer(Player player) throws Exception;

    List<Player> fetchAllPlayers();

    Player fetchById(int id);
}
