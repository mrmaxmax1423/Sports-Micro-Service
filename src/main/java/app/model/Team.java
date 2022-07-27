package app.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Team {
    private String teamName;
    private int wins;
    private int losses;
    private int ties;
}
