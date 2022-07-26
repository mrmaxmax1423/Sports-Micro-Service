package app.model;

import lombok.Data;

import java.util.Date;

@Data
public class Team {
    private String teamName;
    private int wins;
    private int losses;
    private int ties;
    private Date date;
}
