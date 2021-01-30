package guru.springframework.msscbeerservice.services.inventory;

import java.util.UUID;

/**
 * Created By Luca Moro on 30/01/2021
 */
public interface BeerInventoryService {

    Integer getOnhandInventory(UUID beerId);
}
