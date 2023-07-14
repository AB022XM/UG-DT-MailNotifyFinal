package ug.co.absa.notify.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ug.co.absa.notify.domain.AlertsTemplateTb;

/**
 * Spring Data JPA repository for the AlertsTemplateTb entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlertsTemplateTbRepository extends JpaRepository<AlertsTemplateTb, UUID> {}
