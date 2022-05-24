package com.IT4045c.SportsService.Sports.MicroService.Model;

import lombok.Data;

@Data
public class Player {
    private String firstName;
    private String lastName;
    private String hometown;
    private String dob;
    private String teamPlayingFor;
}
