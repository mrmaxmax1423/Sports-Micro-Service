package app.dao;

import app.model.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamDAO implements ITeamDAO {
    List<Team> teamList = new ArrayList<>();

    @Override
    public List<Team> fetchAllTeams() {
        return teamList;
    }

    @Override
    public Team findById(int teamId) {
        return null;
    }

    @Override
    public Team save(Team team) {
        return null;
    }

}
