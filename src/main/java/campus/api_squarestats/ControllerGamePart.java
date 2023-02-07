package campus.api_squarestats;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
public class ControllerGamePart {

    private final ServiceGamePartImpl serviceGamePartImpl;

    @GetMapping("/gamepart/{gamePartId}/info")
    public DtoGamePartWeb infoGamePart(@PathVariable("gamePartId") Long gameId) throws SQLException {
        return serviceGamePartImpl.getGamePartInfo(gameId);
    }

}
