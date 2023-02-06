package campus.api_squarestats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceGamePart {

    @Autowired
    private DaoGamePartPersistence daoGamePart;

    public Object getGamePartInfo(int gamePartId) {
        return daoGamePart.findById(gamePartId);
    }
}
