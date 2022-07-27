package app.dao;

import app.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerDAO implements IPlayerDAO {

    List<Player> playerCollection = new ArrayList<>();

    @Override
    public Player savePlayer(Player player) throws Exception {
        playerCollection.add(player);
        return player;
    }

    @Override
    public List<Player> fetchAllPlayers() {
        return playerCollection;
    }

    @Override
    public Player fetchById(int id) {
        return null;
    }
}
