package App.Controller;

import App.DAO.PlayerRepository;
import App.Model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository repository;


    public long getNextID() {
        return repository.count() + 1;
    }

    @GetMapping("/getAllPlayers")
    public List<Player> getAll() {return repository.findAll();}

    @PostMapping("/savePlayer")
    public String savePlayer(@RequestBody Player player) {
            //player.setId(getNextID());
        repository.save(player);
        return player.getFirstName() + " " + player.getLastName() + " was added to the " + player.getTeamPlayingFor() + " lineup";
    }

    @GetMapping("/getPlayer/{playerLastName}")
    public List<Player> getPlayerByLastName(@PathVariable String inPlayerName){
        return repository.findPlayerByLastName(inPlayerName);
    }
}
