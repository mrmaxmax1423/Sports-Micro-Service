package app.service;

import app.dao.ITeamDAO;
import app.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService{

    @Autowired
    private ITeamDAO teamDAO;

    public TeamService(){}

    public TeamService(ITeamDAO teamRepositoryDAO) {this.teamDAO = teamRepositoryDAO; }

    public List<Team> fetchAllTeams() { return null;
    }
}
