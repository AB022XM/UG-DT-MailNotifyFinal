package ug.co.absa.notify.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;
import ug.co.absa.notify.domain.AlertsHistoryTb;
import ug.co.absa.notify.repository.AlertsHistoryTbRepository;
import ug.co.absa.notify.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.notify.domain.AlertsHistoryTb}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class AlertsHistoryTbResource {

    private final Logger log = LoggerFactory.getLogger(AlertsHistoryTbResource.class);

    private static final String ENTITY_NAME = "alertsHistoryTb";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final AlertsHistoryTbRepository alertsHistoryTbRepository;

    public AlertsHistoryTbResource(AlertsHistoryTbRepository alertsHistoryTbRepository) {
        this.alertsHistoryTbRepository = alertsHistoryTbRepository;
    }

    /**
     * {@code POST  /alerts-history-tbs} : Create a new alertsHistoryTb.
     *
     * @param alertsHistoryTb the alertsHistoryTb to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new alertsHistoryTb, or with status {@code 400 (Bad Request)} if the alertsHistoryTb has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/alerts-history-tbs")
    public ResponseEntity<AlertsHistoryTb> createAlertsHistoryTb(@RequestBody AlertsHistoryTb alertsHistoryTb) throws URISyntaxException {
        log.debug("REST request to save AlertsHistoryTb : {}", alertsHistoryTb);
        if (alertsHistoryTb.getId() != null) {
            throw new BadRequestAlertException("A new alertsHistoryTb cannot already have an ID", ENTITY_NAME, "idexists");
        }
        AlertsHistoryTb result = alertsHistoryTbRepository.save(alertsHistoryTb);
        return ResponseEntity
            .created(new URI("/api/alerts-history-tbs/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /alerts-history-tbs/:id} : Updates an existing alertsHistoryTb.
     *
     * @param id the id of the alertsHistoryTb to save.
     * @param alertsHistoryTb the alertsHistoryTb to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated alertsHistoryTb,
     * or with status {@code 400 (Bad Request)} if the alertsHistoryTb is not valid,
     * or with status {@code 500 (Internal Server Error)} if the alertsHistoryTb couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/alerts-history-tbs/{id}")
    public ResponseEntity<AlertsHistoryTb> updateAlertsHistoryTb(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody AlertsHistoryTb alertsHistoryTb
    ) throws URISyntaxException {
        log.debug("REST request to update AlertsHistoryTb : {}, {}", id, alertsHistoryTb);
        if (alertsHistoryTb.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, alertsHistoryTb.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!alertsHistoryTbRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        AlertsHistoryTb result = alertsHistoryTbRepository.save(alertsHistoryTb);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, alertsHistoryTb.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /alerts-history-tbs/:id} : Partial updates given fields of an existing alertsHistoryTb, field will ignore if it is null
     *
     * @param id the id of the alertsHistoryTb to save.
     * @param alertsHistoryTb the alertsHistoryTb to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated alertsHistoryTb,
     * or with status {@code 400 (Bad Request)} if the alertsHistoryTb is not valid,
     * or with status {@code 404 (Not Found)} if the alertsHistoryTb is not found,
     * or with status {@code 500 (Internal Server Error)} if the alertsHistoryTb couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/alerts-history-tbs/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<AlertsHistoryTb> partialUpdateAlertsHistoryTb(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody AlertsHistoryTb alertsHistoryTb
    ) throws URISyntaxException {
        log.debug("REST request to partial update AlertsHistoryTb partially : {}, {}", id, alertsHistoryTb);
        if (alertsHistoryTb.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, alertsHistoryTb.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!alertsHistoryTbRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<AlertsHistoryTb> result = alertsHistoryTbRepository
            .findById(alertsHistoryTb.getId())
            .map(existingAlertsHistoryTb -> {
                if (alertsHistoryTb.getHistoryAlertId() != null) {
                    existingAlertsHistoryTb.setHistoryAlertId(alertsHistoryTb.getHistoryAlertId());
                }
                if (alertsHistoryTb.getHistoryAlertTemId() != null) {
                    existingAlertsHistoryTb.setHistoryAlertTemId(alertsHistoryTb.getHistoryAlertTemId());
                }
                if (alertsHistoryTb.getHistoryAlertType() != null) {
                    existingAlertsHistoryTb.setHistoryAlertType(alertsHistoryTb.getHistoryAlertType());
                }
                if (alertsHistoryTb.getHistoryAlertStatus() != null) {
                    existingAlertsHistoryTb.setHistoryAlertStatus(alertsHistoryTb.getHistoryAlertStatus());
                }
                if (alertsHistoryTb.getHistoryAlertMessage() != null) {
                    existingAlertsHistoryTb.setHistoryAlertMessage(alertsHistoryTb.getHistoryAlertMessage());
                }
                if (alertsHistoryTb.getHistoryAlertDate() != null) {
                    existingAlertsHistoryTb.setHistoryAlertDate(alertsHistoryTb.getHistoryAlertDate());
                }
                if (alertsHistoryTb.getHistoryAlertRetries() != null) {
                    existingAlertsHistoryTb.setHistoryAlertRetries(alertsHistoryTb.getHistoryAlertRetries());
                }
                if (alertsHistoryTb.getHistoryAlertTimestamp() != null) {
                    existingAlertsHistoryTb.setHistoryAlertTimestamp(alertsHistoryTb.getHistoryAlertTimestamp());
                }
                if (alertsHistoryTb.getHistoryAlertPostedBy() != null) {
                    existingAlertsHistoryTb.setHistoryAlertPostedBy(alertsHistoryTb.getHistoryAlertPostedBy());
                }
                if (alertsHistoryTb.getHistoryAlertPostedDate() != null) {
                    existingAlertsHistoryTb.setHistoryAlertPostedDate(alertsHistoryTb.getHistoryAlertPostedDate());
                }
                if (alertsHistoryTb.getHistoryAlertInternalErrorcode() != null) {
                    existingAlertsHistoryTb.setHistoryAlertInternalErrorcode(alertsHistoryTb.getHistoryAlertInternalErrorcode());
                }
                if (alertsHistoryTb.getHistoryAlertRawRequest() != null) {
                    existingAlertsHistoryTb.setHistoryAlertRawRequest(alertsHistoryTb.getHistoryAlertRawRequest());
                }
                if (alertsHistoryTb.getHistoryAlertRawResponse() != null) {
                    existingAlertsHistoryTb.setHistoryAlertRawResponse(alertsHistoryTb.getHistoryAlertRawResponse());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField1() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField1(alertsHistoryTb.getHistoryAlertFreeField1());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField2() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField2(alertsHistoryTb.getHistoryAlertFreeField2());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField3() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField3(alertsHistoryTb.getHistoryAlertFreeField3());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField4() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField4(alertsHistoryTb.getHistoryAlertFreeField4());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField5() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField5(alertsHistoryTb.getHistoryAlertFreeField5());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField6() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField6(alertsHistoryTb.getHistoryAlertFreeField6());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField7() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField7(alertsHistoryTb.getHistoryAlertFreeField7());
                }
                if (alertsHistoryTb.getHistoryAlertFreeField8() != null) {
                    existingAlertsHistoryTb.setHistoryAlertFreeField8(alertsHistoryTb.getHistoryAlertFreeField8());
                }
                if (alertsHistoryTb.getCreatedAt() != null) {
                    existingAlertsHistoryTb.setCreatedAt(alertsHistoryTb.getCreatedAt());
                }
                if (alertsHistoryTb.getUpdatedAt() != null) {
                    existingAlertsHistoryTb.setUpdatedAt(alertsHistoryTb.getUpdatedAt());
                }
                if (alertsHistoryTb.getHistoryStatus() != null) {
                    existingAlertsHistoryTb.setHistoryStatus(alertsHistoryTb.getHistoryStatus());
                }

                return existingAlertsHistoryTb;
            })
            .map(alertsHistoryTbRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, alertsHistoryTb.getId().toString())
        );
    }

    /**
     * {@code GET  /alerts-history-tbs} : get all the alertsHistoryTbs.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of alertsHistoryTbs in body.
     */
    @GetMapping("/alerts-history-tbs")
    public List<AlertsHistoryTb> getAllAlertsHistoryTbs() {
        log.debug("REST request to get all AlertsHistoryTbs");
        return alertsHistoryTbRepository.findAll();
    }

    /**
     * {@code GET  /alerts-history-tbs/:id} : get the "id" alertsHistoryTb.
     *
     * @param id the id of the alertsHistoryTb to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the alertsHistoryTb, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/alerts-history-tbs/{id}")
    public ResponseEntity<AlertsHistoryTb> getAlertsHistoryTb(@PathVariable Long id) {
        log.debug("REST request to get AlertsHistoryTb : {}", id);
        Optional<AlertsHistoryTb> alertsHistoryTb = alertsHistoryTbRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(alertsHistoryTb);
    }

    /**
     * {@code DELETE  /alerts-history-tbs/:id} : delete the "id" alertsHistoryTb.
     *
     * @param id the id of the alertsHistoryTb to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/alerts-history-tbs/{id}")
    public ResponseEntity<Void> deleteAlertsHistoryTb(@PathVariable Long id) {
        log.debug("REST request to delete AlertsHistoryTb : {}", id);
        alertsHistoryTbRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
            .build();
    }
}
