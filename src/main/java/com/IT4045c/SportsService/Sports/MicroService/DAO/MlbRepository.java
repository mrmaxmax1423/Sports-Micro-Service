package com.IT4045c.SportsService.Sports.MicroService.DAO;

import com.IT4045c.SportsService.Sports.MicroService.Model.MLB;
import com.IT4045c.SportsService.Sports.MicroService.Model.Player;

import java.util.List;

public class MlbRepository implements Repository {
    @Override
    public List<MLB> findByTeamName(String inTeamName) {
        return null;
    }

    @Override
    public List<Repository> findAll() {
        return null;
    }

    @Override
    public void save(MLB mlb) {

    }

    @Override
    public List<Player> findByPlayerLastName(String inPlayerLastName) {
        return null;
    }
}
