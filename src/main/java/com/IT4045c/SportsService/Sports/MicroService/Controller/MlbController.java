package com.IT4045c.SportsService.Sports.MicroService.Controller;

import com.IT4045c.SportsService.Sports.MicroService.DAO.Repository;
import com.IT4045c.SportsService.Sports.MicroService.Model.MLB;
import com.IT4045c.SportsService.Sports.MicroService.Model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class MlbController {
@Autowired
    private Repository repository;

    @GetMapping("/getAll")
    public List<Repository> getAll() {return repository.findAll();}

    @PostMapping("/insertNextGame")
    public String insertNextGame(@RequestBody MLB mlb) {
        repository.save(mlb);
        return "Next game on the schedule is: " + mlb.getNextGame();
    }

    @GetMapping("/getPlayerStats/{playerLastName}")
    public List<Player> getPlayerByLastName(@PathVariable String inPlayerLastName) {
        return repository.findByPlayerLastName(inPlayerLastName);
    }
}
