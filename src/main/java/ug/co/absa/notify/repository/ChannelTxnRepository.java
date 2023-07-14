package ug.co.absa.notify.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ug.co.absa.notify.domain.ChannelTxn;

/**
 * Spring Data JPA repository for the ChannelTxn entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ChannelTxnRepository extends JpaRepository<ChannelTxn, Long> {}
