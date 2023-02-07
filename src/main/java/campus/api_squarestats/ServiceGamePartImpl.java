package campus.api_squarestats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceGamePartImpl {

    // Creation de l'objet DaoGamePartPersistence
    @Autowired
    private DaoGamePartPersistence daoGamePart;

    /**
     * Gets game part info.
     *
     * @param gamePartId the game part id
     * @return the game part info
     */
    public DtoGamePartWeb getGamePartInfo(Long gamePartId) {

        // recuperation de l'enregistrement correspondant a gamePartId
        Optional<GamePartEntityPersistence> objet = daoGamePart.findById(gamePartId);

        // creation de l'objet de retour
        DtoGamePartWeb dtoGamePartWeb = new DtoGamePartWeb();

        final var game = objet.orElse(null);

        if (game == null) {
            //TODO
            return null;
        }
        // initialisation de l'objet de retour avec l'enregistrement recupere
        dtoGamePartWeb.setGameStatus(game.getGame_status());
        dtoGamePartWeb.setGameId(game.getGame_id());
        dtoGamePartWeb.setCurrentPlayer(game.getCurrent_player());
        dtoGamePartWeb.setIdGamepart(game.getId());
        dtoGamePartWeb.setPlayers(game.getGamePartPlayerEntityPersistences().stream().map(player -> {
            var playerDto = new DtoPlayerPartWeb();
            playerDto.setId(player.getId());
            playerDto.setPlayer(player.getPlayer());
            return playerDto;
        }).collect(Collectors.toList()));

        return dtoGamePartWeb;
    }
}
