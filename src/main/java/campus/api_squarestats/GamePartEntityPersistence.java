package campus.api_squarestats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Entity game part persistence.
 */
@Entity(name = "gamepart")
@Getter
@Setter
public class GamePartEntityPersistence {
    @OneToMany(fetch = FetchType.EAGER,
            targetEntity = GamePartPlayerEntityPersistence.class,
            mappedBy = "gamePartEntityPersistence",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<GamePartPlayerEntityPersistence> gamePartPlayerEntityPersistences = new ArrayList<>();

    // creation des proprietes de l'objet
    @Id
    private Long id;

    private String game_id;

    private String game_status;

    private Long current_player;

}
