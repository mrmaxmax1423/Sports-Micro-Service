package app.controller;

import app.model.Player;
import app.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @RequestMapping("/")
    public String index() {return "start";}

    @GetMapping("/getAllPlayers")
    public Collection<Player> getAll() {
        return playerService.getAllPlayers();
    }

    @PostMapping("/savePlayer")
    public Player savePlayer(@RequestBody Player player) {

        return playerService.savePlayer(player);
    }

    @GetMapping("/getPlayer/{playerLastName}/")
    public List<Player> getPlayerByLastName(@PathVariable("playerLastName") String inPlayerName){

        return playerService.findPlayerByLastName(inPlayerName);
    }

}
