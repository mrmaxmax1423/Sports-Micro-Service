package app.service;

import app.dao.IPlayerDAO;
import app.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayerService implements IPlayerService{

    @Autowired
    private IPlayerDAO playerDAO;

    public PlayerService(){}

    public PlayerService(IPlayerDAO playerRepository){
        this.playerDAO = playerRepository;
    }

    @Override
    public Player fetchById(int id) {
        Player foundPlayer = playerDAO.fetchById(id);
        return foundPlayer;
    }

    @Override
    public List<Player> fetchAllPlayers() {
        return playerDAO.fetchAllPlayers();
    }

    @Override
    public Player savePlayer(Player player)  {
        try {
            playerDAO.savePlayer(player);
        } catch (Exception e) {
            //ToDO Add logging later..
        }
        return player;
    }
}
