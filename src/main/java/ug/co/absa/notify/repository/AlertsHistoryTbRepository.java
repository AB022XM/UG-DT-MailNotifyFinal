package ug.co.absa.notify.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ug.co.absa.notify.domain.AlertsHistoryTb;

/**
 * Spring Data JPA repository for the AlertsHistoryTb entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AlertsHistoryTbRepository extends JpaRepository<AlertsHistoryTb, Long> {}
