package guru.sfg.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created By Luca Moro on 27/02/2021 17:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidateOrderResult {

    private UUID orderId;
    private Boolean isValid;
}
