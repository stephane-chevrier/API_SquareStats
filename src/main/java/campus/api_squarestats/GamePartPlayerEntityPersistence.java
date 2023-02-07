package campus.api_squarestats;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Entity game part player persistence.
 */
@Entity(name = "gamepartplayer")
@Getter
@Setter
public class GamePartPlayerEntityPersistence {

    @Id
    private Long id;

    private Long player;

    // creation des proprietes de l'objet
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private GamePartEntityPersistence gamePartEntityPersistence;
}
