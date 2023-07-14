package ug.co.absa.notify.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;
import ug.co.absa.notify.domain.AlertsTb;
import ug.co.absa.notify.repository.AlertsTbRepository;
import ug.co.absa.notify.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.notify.domain.AlertsTb}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class AlertsTbResource {

    private final Logger log = LoggerFactory.getLogger(AlertsTbResource.class);

    private static final String ENTITY_NAME = "alertsTb";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final AlertsTbRepository alertsTbRepository;

    public AlertsTbResource(AlertsTbRepository alertsTbRepository) {
        this.alertsTbRepository = alertsTbRepository;
    }

    /**
     * {@code POST  /alerts-tbs} : Create a new alertsTb.
     *
     * @param alertsTb the alertsTb to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new alertsTb, or with status {@code 400 (Bad Request)} if the alertsTb has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/alerts-tbs")
    public ResponseEntity<AlertsTb> createAlertsTb(@Valid @RequestBody AlertsTb alertsTb) throws URISyntaxException {
        log.debug("REST request to save AlertsTb : {}", alertsTb);
        if (alertsTb.getId() != null) {
            throw new BadRequestAlertException("A new alertsTb cannot already have an ID", ENTITY_NAME, "idexists");
        }
        AlertsTb result = alertsTbRepository.save(alertsTb);
        return ResponseEntity
            .created(new URI("/api/alerts-tbs/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /alerts-tbs/:id} : Updates an existing alertsTb.
     *
     * @param id the id of the alertsTb to save.
     * @param alertsTb the alertsTb to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated alertsTb,
     * or with status {@code 400 (Bad Request)} if the alertsTb is not valid,
     * or with status {@code 500 (Internal Server Error)} if the alertsTb couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/alerts-tbs/{id}")
    public ResponseEntity<AlertsTb> updateAlertsTb(
        @PathVariable(value = "id", required = false) final UUID id,
        @Valid @RequestBody AlertsTb alertsTb
    ) throws URISyntaxException {
        log.debug("REST request to update AlertsTb : {}, {}", id, alertsTb);
        if (alertsTb.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, alertsTb.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!alertsTbRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        AlertsTb result = alertsTbRepository.save(alertsTb);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, alertsTb.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /alerts-tbs/:id} : Partial updates given fields of an existing alertsTb, field will ignore if it is null
     *
     * @param id the id of the alertsTb to save.
     * @param alertsTb the alertsTb to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated alertsTb,
     * or with status {@code 400 (Bad Request)} if the alertsTb is not valid,
     * or with status {@code 404 (Not Found)} if the alertsTb is not found,
     * or with status {@code 500 (Internal Server Error)} if the alertsTb couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/alerts-tbs/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<AlertsTb> partialUpdateAlertsTb(
        @PathVariable(value = "id", required = false) final UUID id,
        @NotNull @RequestBody AlertsTb alertsTb
    ) throws URISyntaxException {
        log.debug("REST request to partial update AlertsTb partially : {}, {}", id, alertsTb);
        if (alertsTb.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, alertsTb.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!alertsTbRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<AlertsTb> result = alertsTbRepository
            .findById(alertsTb.getId())
            .map(existingAlertsTb -> {
                if (alertsTb.getAlertId() != null) {
                    existingAlertsTb.setAlertId(alertsTb.getAlertId());
                }
                if (alertsTb.getAlertTemId() != null) {
                    existingAlertsTb.setAlertTemId(alertsTb.getAlertTemId());
                }
                if (alertsTb.getAlertType() != null) {
                    existingAlertsTb.setAlertType(alertsTb.getAlertType());
                }
                if (alertsTb.getAlertStatus() != null) {
                    existingAlertsTb.setAlertStatus(alertsTb.getAlertStatus());
                }
                if (alertsTb.getAlertMessage() != null) {
                    existingAlertsTb.setAlertMessage(alertsTb.getAlertMessage());
                }
                if (alertsTb.getAlertDate() != null) {
                    existingAlertsTb.setAlertDate(alertsTb.getAlertDate());
                }
                if (alertsTb.getAlertRetries() != null) {
                    existingAlertsTb.setAlertRetries(alertsTb.getAlertRetries());
                }
                if (alertsTb.getAlertTimestamp() != null) {
                    existingAlertsTb.setAlertTimestamp(alertsTb.getAlertTimestamp());
                }
                if (alertsTb.getAlertPostedBy() != null) {
                    existingAlertsTb.setAlertPostedBy(alertsTb.getAlertPostedBy());
                }
                if (alertsTb.getAlertPostedDate() != null) {
                    existingAlertsTb.setAlertPostedDate(alertsTb.getAlertPostedDate());
                }
                if (alertsTb.getAlertInternalErrorcode() != null) {
                    existingAlertsTb.setAlertInternalErrorcode(alertsTb.getAlertInternalErrorcode());
                }
                if (alertsTb.getRawRequest() != null) {
                    existingAlertsTb.setRawRequest(alertsTb.getRawRequest());
                }
                if (alertsTb.getRawResponse() != null) {
                    existingAlertsTb.setRawResponse(alertsTb.getRawResponse());
                }
                if (alertsTb.getAlertFreeField1() != null) {
                    existingAlertsTb.setAlertFreeField1(alertsTb.getAlertFreeField1());
                }
                if (alertsTb.getAlertFreeField2() != null) {
                    existingAlertsTb.setAlertFreeField2(alertsTb.getAlertFreeField2());
                }
                if (alertsTb.getAlertFreeField3() != null) {
                    existingAlertsTb.setAlertFreeField3(alertsTb.getAlertFreeField3());
                }
                if (alertsTb.getAlertFreeField4() != null) {
                    existingAlertsTb.setAlertFreeField4(alertsTb.getAlertFreeField4());
                }
                if (alertsTb.getAlertFreeField5() != null) {
                    existingAlertsTb.setAlertFreeField5(alertsTb.getAlertFreeField5());
                }
                if (alertsTb.getAlertFreeField6() != null) {
                    existingAlertsTb.setAlertFreeField6(alertsTb.getAlertFreeField6());
                }
                if (alertsTb.getAlertFreeField7() != null) {
                    existingAlertsTb.setAlertFreeField7(alertsTb.getAlertFreeField7());
                }
                if (alertsTb.getAlertFreeField8() != null) {
                    existingAlertsTb.setAlertFreeField8(alertsTb.getAlertFreeField8());
                }
                if (alertsTb.getCreatedAt() != null) {
                    existingAlertsTb.setCreatedAt(alertsTb.getCreatedAt());
                }
                if (alertsTb.getUpdatedAt() != null) {
                    existingAlertsTb.setUpdatedAt(alertsTb.getUpdatedAt());
                }
                if (alertsTb.getStatus() != null) {
                    existingAlertsTb.setStatus(alertsTb.getStatus());
                }

                return existingAlertsTb;
            })
            .map(alertsTbRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, alertsTb.getId().toString())
        );
    }

    /**
     * {@code GET  /alerts-tbs} : get all the alertsTbs.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of alertsTbs in body.
     */
    @GetMapping("/alerts-tbs")
    public List<AlertsTb> getAllAlertsTbs() {
        log.debug("REST request to get all AlertsTbs");
        return alertsTbRepository.findAll();
    }

    /**
     * {@code GET  /alerts-tbs/:id} : get the "id" alertsTb.
     *
     * @param id the id of the alertsTb to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the alertsTb, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/alerts-tbs/{id}")
    public ResponseEntity<AlertsTb> getAlertsTb(@PathVariable UUID id) {
        log.debug("REST request to get AlertsTb : {}", id);
        Optional<AlertsTb> alertsTb = alertsTbRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(alertsTb);
    }

    /**
     * {@code DELETE  /alerts-tbs/:id} : delete the "id" alertsTb.
     *
     * @param id the id of the alertsTb to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/alerts-tbs/{id}")
    public ResponseEntity<Void> deleteAlertsTb(@PathVariable UUID id) {
        log.debug("REST request to delete AlertsTb : {}", id);
        alertsTbRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
            .build();
    }
}
