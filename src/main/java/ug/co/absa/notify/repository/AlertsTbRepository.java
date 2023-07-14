package ug.co.absa.notify.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ug.co.absa.notify.domain.AlertsTb;

/**
 * Spring Data JPA repository for the AlertsTb entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlertsTbRepository extends JpaRepository<AlertsTb, UUID> {
    AlertsTb findOneById(UUID uuid);
}
