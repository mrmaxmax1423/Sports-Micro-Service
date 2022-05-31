package app.dao;

import app.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    List<Player> findPlayerByLastName(String inPlayerName);

    List<Player> findPlayerBySport(String inSportName);

}
