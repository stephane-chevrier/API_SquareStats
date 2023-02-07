package campus.api_squarestats;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The type Dto game part web.
 */
@Getter
@Setter
public class DtoGamePartWeb {
    // creation des proprietes de l'objet
    private Long idGamepart;
    private String gameId;
    private String gameStatus;
    private Long currentPlayer;
    private List<DtoPlayerPartWeb> players;
}


