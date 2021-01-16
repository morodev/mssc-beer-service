package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created By Luca Moro on 16/01/2021 15:25
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
