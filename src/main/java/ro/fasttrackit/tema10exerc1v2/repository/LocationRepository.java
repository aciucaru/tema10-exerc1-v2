package ro.fasttrackit.tema10exerc1v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.tema10exerc1v2.model.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Long>
{

}
