package app.controller;

import app.model.Player;
import app.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;


@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping("/")
    public String index(Model model){
        Player player = new Player()
            .setFirstName("Chris")
            .setLastName("Johannemann")
            .setHometown("Union, KY")
            .setSport("Curling")
            .setTeamPlayingFor("USA");
        model.addAttribute(player);
        return "index";
    }

    @GetMapping("/player")
    @ResponseBody
    public List<Player> fetchAllPlayers(){
        return playerService.fetchAllPlayers();
    }

    @RequestMapping("/savePlayer")
    public String savePlayer(Player player) {
        try {
            playerService.savePlayer(player);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

    @PostMapping(value = "/player", consumes = "application/json", produces = "application/json")
    public Player createPlayer(@RequestBody Player player) {
        Player newPlayer = null;
        try {
            playerService.savePlayer(player);
        }catch (Exception e){
            e.printStackTrace();
        }
        return newPlayer;
    }
}
