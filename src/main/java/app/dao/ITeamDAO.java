package app.dao;

import app.model.Team;

import java.util.List;

public interface ITeamDAO {
    List<Team> fetchAllTeams();

    Team findById(int teamId);

    Team save(Team team);
}
