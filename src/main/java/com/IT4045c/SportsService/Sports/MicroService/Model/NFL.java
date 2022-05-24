package com.IT4045c.SportsService.Sports.MicroService.Model;

import lombok.Data;

@Data
public class NFL {
    private String sport;
    private String team;
    private String wins;
    private String losses;
    private String nextGame;
}
