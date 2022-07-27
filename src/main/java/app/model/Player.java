package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Player {

    private int id;
    private String firstName;
    private String lastName;
    private String hometown;
    private String teamPlayingFor;
    private String sport;

}
