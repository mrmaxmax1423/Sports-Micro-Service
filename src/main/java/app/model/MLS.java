package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MLS {
    private String sport;
    private String team;
    private String wins;
    private String losses;
    private String nextGame;
}
