package com.IT4045c.SportsService.Sports.MicroService.DAO;

import com.IT4045c.SportsService.Sports.MicroService.Model.MLB;
import com.IT4045c.SportsService.Sports.MicroService.Model.Player;

import java.util.List;

public interface Repository {
    List<MLB> findByTeamName(String inTeamName);

    List<Repository> findAll();

    void save(MLB mlb);

    List<Player> findByPlayerLastName(String inPlayerLastName);
}
