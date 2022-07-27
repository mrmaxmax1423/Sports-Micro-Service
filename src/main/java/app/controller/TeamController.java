package app.controller;

import app.model.Team;
import app.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping("/teams")
    public String team(Model model){
        Team team = new Team()
            .setTeamName("Cincinnati")
            .setLosses(55)
            .setTies(0)
            .setWins(8);
        model.addAttribute(team);
        return "teams";
    }

    @GetMapping("/team")
    @ResponseBody
    public List<Team> fetchAllTeams(){
        return teamService.fetchAllTeams();
    }
}
