package ug.co.absa.notify.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
import ug.co.absa.notify.domain.ChannelTxn;
import ug.co.absa.notify.repository.ChannelTxnRepository;
import ug.co.absa.notify.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.notify.domain.ChannelTxn}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class ChannelTxnResource {

    private final Logger log = LoggerFactory.getLogger(ChannelTxnResource.class);

    private static final String ENTITY_NAME = "channelTxn";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ChannelTxnRepository channelTxnRepository;

    public ChannelTxnResource(ChannelTxnRepository channelTxnRepository) {
        this.channelTxnRepository = channelTxnRepository;
    }

    /**
     * {@code POST  /channel-txns} : Create a new channelTxn.
     *
     * @param channelTxn the channelTxn to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new channelTxn, or with status {@code 400 (Bad Request)} if the channelTxn has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/channel-txns")
    public ResponseEntity<ChannelTxn> createChannelTxn(@Valid @RequestBody ChannelTxn channelTxn) throws URISyntaxException {
        log.debug("REST request to save ChannelTxn : {}", channelTxn);
        if (channelTxn.getId() != null) {
            throw new BadRequestAlertException("A new channelTxn cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ChannelTxn result = channelTxnRepository.save(channelTxn);
        return ResponseEntity
            .created(new URI("/api/channel-txns/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /channel-txns/:id} : Updates an existing channelTxn.
     *
     * @param id the id of the channelTxn to save.
     * @param channelTxn the channelTxn to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated channelTxn,
     * or with status {@code 400 (Bad Request)} if the channelTxn is not valid,
     * or with status {@code 500 (Internal Server Error)} if the channelTxn couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/channel-txns/{id}")
    public ResponseEntity<ChannelTxn> updateChannelTxn(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody ChannelTxn channelTxn
    ) throws URISyntaxException {
        log.debug("REST request to update ChannelTxn : {}, {}", id, channelTxn);
        if (channelTxn.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, channelTxn.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!channelTxnRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        ChannelTxn result = channelTxnRepository.save(channelTxn);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, channelTxn.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /channel-txns/:id} : Partial updates given fields of an existing channelTxn, field will ignore if it is null
     *
     * @param id the id of the channelTxn to save.
     * @param channelTxn the channelTxn to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated channelTxn,
     * or with status {@code 400 (Bad Request)} if the channelTxn is not valid,
     * or with status {@code 404 (Not Found)} if the channelTxn is not found,
     * or with status {@code 500 (Internal Server Error)} if the channelTxn couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/channel-txns/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<ChannelTxn> partialUpdateChannelTxn(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody ChannelTxn channelTxn
    ) throws URISyntaxException {
        log.debug("REST request to partial update ChannelTxn partially : {}, {}", id, channelTxn);
        if (channelTxn.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, channelTxn.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!channelTxnRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<ChannelTxn> result = channelTxnRepository
            .findById(channelTxn.getId())
            .map(existingChannelTxn -> {
                if (channelTxn.getAccountNo() != null) {
                    existingChannelTxn.setAccountNo(channelTxn.getAccountNo());
                }
                if (channelTxn.getTxnDate() != null) {
                    existingChannelTxn.setTxnDate(channelTxn.getTxnDate());
                }
                if (channelTxn.getNarrative() != null) {
                    existingChannelTxn.setNarrative(channelTxn.getNarrative());
                }
                if (channelTxn.getAmount() != null) {
                    existingChannelTxn.setAmount(channelTxn.getAmount());
                }
                if (channelTxn.getTxnID() != null) {
                    existingChannelTxn.setTxnID(channelTxn.getTxnID());
                }
                if (channelTxn.getUtilityRef() != null) {
                    existingChannelTxn.setUtilityRef(channelTxn.getUtilityRef());
                }
                if (channelTxn.getTransactionID() != null) {
                    existingChannelTxn.setTransactionID(channelTxn.getTransactionID());
                }
                if (channelTxn.getmNO() != null) {
                    existingChannelTxn.setmNO(channelTxn.getmNO());
                }
                if (channelTxn.getTxnType() != null) {
                    existingChannelTxn.setTxnType(channelTxn.getTxnType());
                }
                if (channelTxn.getTxnStatusMno() != null) {
                    existingChannelTxn.setTxnStatusMno(channelTxn.getTxnStatusMno());
                }
                if (channelTxn.getmNTxnID() != null) {
                    existingChannelTxn.setmNTxnID(channelTxn.getmNTxnID());
                }
                if (channelTxn.getMessage() != null) {
                    existingChannelTxn.setMessage(channelTxn.getMessage());
                }
                if (channelTxn.getNotifiedStatus() != null) {
                    existingChannelTxn.setNotifiedStatus(channelTxn.getNotifiedStatus());
                }
                if (channelTxn.getDateInserted() != null) {
                    existingChannelTxn.setDateInserted(channelTxn.getDateInserted());
                }
                if (channelTxn.getRecordId() != null) {
                    existingChannelTxn.setRecordId(channelTxn.getRecordId());
                }
                if (channelTxn.getFinalStatus() != null) {
                    existingChannelTxn.setFinalStatus(channelTxn.getFinalStatus());
                }
                if (channelTxn.getSettlementDate() != null) {
                    existingChannelTxn.setSettlementDate(channelTxn.getSettlementDate());
                }
                if (channelTxn.getRequestXml() != null) {
                    existingChannelTxn.setRequestXml(channelTxn.getRequestXml());
                }
                if (channelTxn.getResponseXml() != null) {
                    existingChannelTxn.setResponseXml(channelTxn.getResponseXml());
                }

                return existingChannelTxn;
            })
            .map(channelTxnRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, channelTxn.getId().toString())
        );
    }

    /**
     * {@code GET  /channel-txns} : get all the channelTxns.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of channelTxns in body.
     */
    @GetMapping("/channel-txns")
    public List<ChannelTxn> getAllChannelTxns() {
        log.debug("REST request to get all ChannelTxns");
        return channelTxnRepository.findAll();
    }

    /**
     * {@code GET  /channel-txns/:id} : get the "id" channelTxn.
     *
     * @param id the id of the channelTxn to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the channelTxn, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/channel-txns/{id}")
    public ResponseEntity<ChannelTxn> getChannelTxn(@PathVariable Long id) {
        log.debug("REST request to get ChannelTxn : {}", id);
        Optional<ChannelTxn> channelTxn = channelTxnRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(channelTxn);
    }

    /**
     * {@code DELETE  /channel-txns/:id} : delete the "id" channelTxn.
     *
     * @param id the id of the channelTxn to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/channel-txns/{id}")
    public ResponseEntity<Void> deleteChannelTxn(@PathVariable Long id) {
        log.debug("REST request to delete ChannelTxn : {}", id);
        channelTxnRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
            .build();
    }
}
