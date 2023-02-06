package campus.api_squarestats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class ControllerGamePart {

    @Autowired
    private ServiceGamePart serviceGamePart;

    @GetMapping("/gamepart/{gamepartId}/info")
    public Object infoGame(@PathVariable("gamepartId") int gamePartId) throws SQLException {
        return serviceGamePart.getGamePartInfo(gamePartId);
    }
}
