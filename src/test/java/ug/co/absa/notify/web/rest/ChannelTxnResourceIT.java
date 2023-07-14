/*
package ug.co.absa.notify.web.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import ug.co.absa.notify.IntegrationTest;
import ug.co.absa.notify.domain.ChannelTxn;
import ug.co.absa.notify.repository.ChannelTxnRepository;

*/
/**
 * Integration tests for the {@link ChannelTxnResource} REST controller.
 *//*

@IntegrationTest
@AutoConfigureMockMvc
@WithMockUser
class ChannelTxnResourceIT {

    private static final String DEFAULT_ACCOUNT_NO = "AAAAAAAAAA";
    private static final String UPDATED_ACCOUNT_NO = "BBBBBBBBBB";

    private static final String DEFAULT_TXN_DATE = "AAAAAAAAAA";
    private static final String UPDATED_TXN_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_NARRATIVE = "AAAAAAAAAA";
    private static final String UPDATED_NARRATIVE = "BBBBBBBBBB";

    private static final String DEFAULT_AMOUNT = "AAAAAAAAAA";
    private static final String UPDATED_AMOUNT = "BBBBBBBBBB";

    private static final String DEFAULT_TXN_ID = "AAAAAAAAAA";
    private static final String UPDATED_TXN_ID = "BBBBBBBBBB";

    private static final String DEFAULT_UTILITY_REF = "AAAAAAAAAA";
    private static final String UPDATED_UTILITY_REF = "BBBBBBBBBB";

    private static final String DEFAULT_TRANSACTION_ID = "AAAAAAAAAA";
    private static final String UPDATED_TRANSACTION_ID = "BBBBBBBBBB";

    private static final String DEFAULT_M_NO = "AAAAAAAAAA";
    private static final String UPDATED_M_NO = "BBBBBBBBBB";

    private static final String DEFAULT_TXN_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_TXN_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_TXN_STATUS_MNO = "AAAAAAAAAA";
    private static final String UPDATED_TXN_STATUS_MNO = "BBBBBBBBBB";

    private static final String DEFAULT_M_N_TXN_ID = "AAAAAAAAAA";
    private static final String UPDATED_M_N_TXN_ID = "BBBBBBBBBB";

    private static final String DEFAULT_MESSAGE = "AAAAAAAAAA";
    private static final String UPDATED_MESSAGE = "BBBBBBBBBB";

    private static final String DEFAULT_NOTIFIED_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_NOTIFIED_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_DATE_INSERTED = "AAAAAAAAAA";
    private static final String UPDATED_DATE_INSERTED = "BBBBBBBBBB";

    private static final String DEFAULT_RECORD_ID = "AAAAAAAAAA";
    private static final String UPDATED_RECORD_ID = "BBBBBBBBBB";

    private static final String DEFAULT_FINAL_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_FINAL_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_SETTLEMENT_DATE = "AAAAAAAAAA";
    private static final String UPDATED_SETTLEMENT_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_REQUEST_XML = "AAAAAAAAAA";
    private static final String UPDATED_REQUEST_XML = "BBBBBBBBBB";

    private static final String DEFAULT_RESPONSE_XML = "AAAAAAAAAA";
    private static final String UPDATED_RESPONSE_XML = "BBBBBBBBBB";

    private static final String ENTITY_API_URL = "/api/channel-txns";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    private static Random random = new Random();
    private static AtomicLong count = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    @Autowired
    private ChannelTxnRepository channelTxnRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restChannelTxnMockMvc;

    private ChannelTxn channelTxn;

    */
/**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*

    public static ChannelTxn createEntity(EntityManager em) {
        ChannelTxn channelTxn = new ChannelTxn()
            .accountNo(DEFAULT_ACCOUNT_NO)
            .txnDate(DEFAULT_TXN_DATE)
            .narrative(DEFAULT_NARRATIVE)
            .amount(DEFAULT_AMOUNT)
            .txnID(DEFAULT_TXN_ID)
            .utilityRef(DEFAULT_UTILITY_REF)
            .transactionID(DEFAULT_TRANSACTION_ID)
            .mNO(DEFAULT_M_NO)
            .txnType(DEFAULT_TXN_TYPE)
            .txnStatusMno(DEFAULT_TXN_STATUS_MNO)
            .mNTxnID(DEFAULT_M_N_TXN_ID)
            .message(DEFAULT_MESSAGE)
            .notifiedStatus(DEFAULT_NOTIFIED_STATUS)
            .dateInserted(DEFAULT_DATE_INSERTED)
            .recordId(DEFAULT_RECORD_ID)
            .finalStatus(DEFAULT_FINAL_STATUS)
            .settlementDate(DEFAULT_SETTLEMENT_DATE)
            .requestXml(DEFAULT_REQUEST_XML)
            .responseXml(DEFAULT_RESPONSE_XML);
        return channelTxn;
    }

    */
/**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*

    public static ChannelTxn createUpdatedEntity(EntityManager em) {
        ChannelTxn channelTxn = new ChannelTxn()
            .accountNo(UPDATED_ACCOUNT_NO)
            .txnDate(UPDATED_TXN_DATE)
            .narrative(UPDATED_NARRATIVE)
            .amount(UPDATED_AMOUNT)
            .txnID(UPDATED_TXN_ID)
            .utilityRef(UPDATED_UTILITY_REF)
            .transactionID(UPDATED_TRANSACTION_ID)
            .mNO(UPDATED_M_NO)
            .txnType(UPDATED_TXN_TYPE)
            .txnStatusMno(UPDATED_TXN_STATUS_MNO)
            .mNTxnID(UPDATED_M_N_TXN_ID)
            .message(UPDATED_MESSAGE)
            .notifiedStatus(UPDATED_NOTIFIED_STATUS)
            .dateInserted(UPDATED_DATE_INSERTED)
            .recordId(UPDATED_RECORD_ID)
            .finalStatus(UPDATED_FINAL_STATUS)
            .settlementDate(UPDATED_SETTLEMENT_DATE)
            .requestXml(UPDATED_REQUEST_XML)
            .responseXml(UPDATED_RESPONSE_XML);
        return channelTxn;
    }

    @BeforeEach
    public void initTest() {
        channelTxn = createEntity(em);
    }

    @Test
    @Transactional
    void createChannelTxn() throws Exception {
        int databaseSizeBeforeCreate = channelTxnRepository.findAll().size();
        // Create the ChannelTxn
        restChannelTxnMockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(channelTxn)))
            .andExpect(status().isCreated());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeCreate + 1);
        ChannelTxn testChannelTxn = channelTxnList.get(channelTxnList.size() - 1);
        assertThat(testChannelTxn.getAccountNo()).isEqualTo(DEFAULT_ACCOUNT_NO);
        assertThat(testChannelTxn.getTxnDate()).isEqualTo(DEFAULT_TXN_DATE);
        assertThat(testChannelTxn.getNarrative()).isEqualTo(DEFAULT_NARRATIVE);
        assertThat(testChannelTxn.getAmount()).isEqualTo(DEFAULT_AMOUNT);
        assertThat(testChannelTxn.getTxnID()).isEqualTo(DEFAULT_TXN_ID);
        assertThat(testChannelTxn.getUtilityRef()).isEqualTo(DEFAULT_UTILITY_REF);
        assertThat(testChannelTxn.getTransactionID()).isEqualTo(DEFAULT_TRANSACTION_ID);
        assertThat(testChannelTxn.getmNO()).isEqualTo(DEFAULT_M_NO);
        assertThat(testChannelTxn.getTxnType()).isEqualTo(DEFAULT_TXN_TYPE);
        assertThat(testChannelTxn.getTxnStatusMno()).isEqualTo(DEFAULT_TXN_STATUS_MNO);
        assertThat(testChannelTxn.getmNTxnID()).isEqualTo(DEFAULT_M_N_TXN_ID);
        assertThat(testChannelTxn.getMessage()).isEqualTo(DEFAULT_MESSAGE);
        assertThat(testChannelTxn.getNotifiedStatus()).isEqualTo(DEFAULT_NOTIFIED_STATUS);
        assertThat(testChannelTxn.getDateInserted()).isEqualTo(DEFAULT_DATE_INSERTED);
        assertThat(testChannelTxn.getRecordId()).isEqualTo(DEFAULT_RECORD_ID);
        assertThat(testChannelTxn.getFinalStatus()).isEqualTo(DEFAULT_FINAL_STATUS);
        assertThat(testChannelTxn.getSettlementDate()).isEqualTo(DEFAULT_SETTLEMENT_DATE);
        assertThat(testChannelTxn.getRequestXml()).isEqualTo(DEFAULT_REQUEST_XML);
        assertThat(testChannelTxn.getResponseXml()).isEqualTo(DEFAULT_RESPONSE_XML);
    }

    @Test
    @Transactional
    void createChannelTxnWithExistingId() throws Exception {
        // Create the ChannelTxn with an existing ID
        channelTxn.setId(1L);

        int databaseSizeBeforeCreate = channelTxnRepository.findAll().size();

        // An entity with an existing ID cannot be created, so this API call must fail
        restChannelTxnMockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(channelTxn)))
            .andExpect(status().isBadRequest());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    void getAllChannelTxns() throws Exception {
        // Initialize the database
        channelTxnRepository.saveAndFlush(channelTxn);

        // Get all the channelTxnList
        restChannelTxnMockMvc
            .perform(get(ENTITY_API_URL + "?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(channelTxn.getId().intValue())))
            .andExpect(jsonPath("$.[*].accountNo").value(hasItem(DEFAULT_ACCOUNT_NO)))
            .andExpect(jsonPath("$.[*].txnDate").value(hasItem(DEFAULT_TXN_DATE)))
            .andExpect(jsonPath("$.[*].narrative").value(hasItem(DEFAULT_NARRATIVE)))
            .andExpect(jsonPath("$.[*].amount").value(hasItem(DEFAULT_AMOUNT)))
            .andExpect(jsonPath("$.[*].txnID").value(hasItem(DEFAULT_TXN_ID)))
            .andExpect(jsonPath("$.[*].utilityRef").value(hasItem(DEFAULT_UTILITY_REF)))
            .andExpect(jsonPath("$.[*].transactionID").value(hasItem(DEFAULT_TRANSACTION_ID)))
            .andExpect(jsonPath("$.[*].mNO").value(hasItem(DEFAULT_M_NO)))
            .andExpect(jsonPath("$.[*].txnType").value(hasItem(DEFAULT_TXN_TYPE)))
            .andExpect(jsonPath("$.[*].txnStatusMno").value(hasItem(DEFAULT_TXN_STATUS_MNO)))
            .andExpect(jsonPath("$.[*].mNTxnID").value(hasItem(DEFAULT_M_N_TXN_ID)))
            .andExpect(jsonPath("$.[*].message").value(hasItem(DEFAULT_MESSAGE)))
            .andExpect(jsonPath("$.[*].notifiedStatus").value(hasItem(DEFAULT_NOTIFIED_STATUS)))
            .andExpect(jsonPath("$.[*].dateInserted").value(hasItem(DEFAULT_DATE_INSERTED)))
            .andExpect(jsonPath("$.[*].recordId").value(hasItem(DEFAULT_RECORD_ID)))
            .andExpect(jsonPath("$.[*].finalStatus").value(hasItem(DEFAULT_FINAL_STATUS)))
            .andExpect(jsonPath("$.[*].settlementDate").value(hasItem(DEFAULT_SETTLEMENT_DATE)))
            .andExpect(jsonPath("$.[*].requestXml").value(hasItem(DEFAULT_REQUEST_XML)))
            .andExpect(jsonPath("$.[*].responseXml").value(hasItem(DEFAULT_RESPONSE_XML)));
    }

    @Test
    @Transactional
    void getChannelTxn() throws Exception {
        // Initialize the database
        channelTxnRepository.saveAndFlush(channelTxn);

        // Get the channelTxn
        restChannelTxnMockMvc
            .perform(get(ENTITY_API_URL_ID, channelTxn.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(channelTxn.getId().intValue()))
            .andExpect(jsonPath("$.accountNo").value(DEFAULT_ACCOUNT_NO))
            .andExpect(jsonPath("$.txnDate").value(DEFAULT_TXN_DATE))
            .andExpect(jsonPath("$.narrative").value(DEFAULT_NARRATIVE))
            .andExpect(jsonPath("$.amount").value(DEFAULT_AMOUNT))
            .andExpect(jsonPath("$.txnID").value(DEFAULT_TXN_ID))
            .andExpect(jsonPath("$.utilityRef").value(DEFAULT_UTILITY_REF))
            .andExpect(jsonPath("$.transactionID").value(DEFAULT_TRANSACTION_ID))
            .andExpect(jsonPath("$.mNO").value(DEFAULT_M_NO))
            .andExpect(jsonPath("$.txnType").value(DEFAULT_TXN_TYPE))
            .andExpect(jsonPath("$.txnStatusMno").value(DEFAULT_TXN_STATUS_MNO))
            .andExpect(jsonPath("$.mNTxnID").value(DEFAULT_M_N_TXN_ID))
            .andExpect(jsonPath("$.message").value(DEFAULT_MESSAGE))
            .andExpect(jsonPath("$.notifiedStatus").value(DEFAULT_NOTIFIED_STATUS))
            .andExpect(jsonPath("$.dateInserted").value(DEFAULT_DATE_INSERTED))
            .andExpect(jsonPath("$.recordId").value(DEFAULT_RECORD_ID))
            .andExpect(jsonPath("$.finalStatus").value(DEFAULT_FINAL_STATUS))
            .andExpect(jsonPath("$.settlementDate").value(DEFAULT_SETTLEMENT_DATE))
            .andExpect(jsonPath("$.requestXml").value(DEFAULT_REQUEST_XML))
            .andExpect(jsonPath("$.responseXml").value(DEFAULT_RESPONSE_XML));
    }

    @Test
    @Transactional
    void getNonExistingChannelTxn() throws Exception {
        // Get the channelTxn
        restChannelTxnMockMvc.perform(get(ENTITY_API_URL_ID, Long.MAX_VALUE)).andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    void putExistingChannelTxn() throws Exception {
        // Initialize the database
        channelTxnRepository.saveAndFlush(channelTxn);

        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();

        // Update the channelTxn
        ChannelTxn updatedChannelTxn = channelTxnRepository.findById(channelTxn.getId()).get();
        // Disconnect from session so that the updates on updatedChannelTxn are not directly saved in db
        em.detach(updatedChannelTxn);
        updatedChannelTxn
            .accountNo(UPDATED_ACCOUNT_NO)
            .txnDate(UPDATED_TXN_DATE)
            .narrative(UPDATED_NARRATIVE)
            .amount(UPDATED_AMOUNT)
            .txnID(UPDATED_TXN_ID)
            .utilityRef(UPDATED_UTILITY_REF)
            .transactionID(UPDATED_TRANSACTION_ID)
            .mNO(UPDATED_M_NO)
            .txnType(UPDATED_TXN_TYPE)
            .txnStatusMno(UPDATED_TXN_STATUS_MNO)
            .mNTxnID(UPDATED_M_N_TXN_ID)
            .message(UPDATED_MESSAGE)
            .notifiedStatus(UPDATED_NOTIFIED_STATUS)
            .dateInserted(UPDATED_DATE_INSERTED)
            .recordId(UPDATED_RECORD_ID)
            .finalStatus(UPDATED_FINAL_STATUS)
            .settlementDate(UPDATED_SETTLEMENT_DATE)
            .requestXml(UPDATED_REQUEST_XML)
            .responseXml(UPDATED_RESPONSE_XML);

        restChannelTxnMockMvc
            .perform(
                put(ENTITY_API_URL_ID, updatedChannelTxn.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(updatedChannelTxn))
            )
            .andExpect(status().isOk());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
        ChannelTxn testChannelTxn = channelTxnList.get(channelTxnList.size() - 1);
        assertThat(testChannelTxn.getAccountNo()).isEqualTo(UPDATED_ACCOUNT_NO);
        assertThat(testChannelTxn.getTxnDate()).isEqualTo(UPDATED_TXN_DATE);
        assertThat(testChannelTxn.getNarrative()).isEqualTo(UPDATED_NARRATIVE);
        assertThat(testChannelTxn.getAmount()).isEqualTo(UPDATED_AMOUNT);
        assertThat(testChannelTxn.getTxnID()).isEqualTo(UPDATED_TXN_ID);
        assertThat(testChannelTxn.getUtilityRef()).isEqualTo(UPDATED_UTILITY_REF);
        assertThat(testChannelTxn.getTransactionID()).isEqualTo(UPDATED_TRANSACTION_ID);
        assertThat(testChannelTxn.getmNO()).isEqualTo(UPDATED_M_NO);
        assertThat(testChannelTxn.getTxnType()).isEqualTo(UPDATED_TXN_TYPE);
        assertThat(testChannelTxn.getTxnStatusMno()).isEqualTo(UPDATED_TXN_STATUS_MNO);
        assertThat(testChannelTxn.getmNTxnID()).isEqualTo(UPDATED_M_N_TXN_ID);
        assertThat(testChannelTxn.getMessage()).isEqualTo(UPDATED_MESSAGE);
        assertThat(testChannelTxn.getNotifiedStatus()).isEqualTo(UPDATED_NOTIFIED_STATUS);
        assertThat(testChannelTxn.getDateInserted()).isEqualTo(UPDATED_DATE_INSERTED);
        assertThat(testChannelTxn.getRecordId()).isEqualTo(UPDATED_RECORD_ID);
        assertThat(testChannelTxn.getFinalStatus()).isEqualTo(UPDATED_FINAL_STATUS);
        assertThat(testChannelTxn.getSettlementDate()).isEqualTo(UPDATED_SETTLEMENT_DATE);
        assertThat(testChannelTxn.getRequestXml()).isEqualTo(UPDATED_REQUEST_XML);
        assertThat(testChannelTxn.getResponseXml()).isEqualTo(UPDATED_RESPONSE_XML);
    }

    @Test
    @Transactional
    void putNonExistingChannelTxn() throws Exception {
        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();
        channelTxn.setId(count.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restChannelTxnMockMvc
            .perform(
                put(ENTITY_API_URL_ID, channelTxn.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(channelTxn))
            )
            .andExpect(status().isBadRequest());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithIdMismatchChannelTxn() throws Exception {
        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();
        channelTxn.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restChannelTxnMockMvc
            .perform(
                put(ENTITY_API_URL_ID, count.incrementAndGet())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(channelTxn))
            )
            .andExpect(status().isBadRequest());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithMissingIdPathParamChannelTxn() throws Exception {
        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();
        channelTxn.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restChannelTxnMockMvc
            .perform(put(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(channelTxn)))
            .andExpect(status().isMethodNotAllowed());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void partialUpdateChannelTxnWithPatch() throws Exception {
        // Initialize the database
        channelTxnRepository.saveAndFlush(channelTxn);

        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();

        // Update the channelTxn using partial update
        ChannelTxn partialUpdatedChannelTxn = new ChannelTxn();
        partialUpdatedChannelTxn.setId(channelTxn.getId());

        partialUpdatedChannelTxn
            .txnDate(UPDATED_TXN_DATE)
            .amount(UPDATED_AMOUNT)
            .utilityRef(UPDATED_UTILITY_REF)
            .transactionID(UPDATED_TRANSACTION_ID)
            .mNO(UPDATED_M_NO)
            .txnStatusMno(UPDATED_TXN_STATUS_MNO)
            .mNTxnID(UPDATED_M_N_TXN_ID)
            .message(UPDATED_MESSAGE)
            .recordId(UPDATED_RECORD_ID)
            .settlementDate(UPDATED_SETTLEMENT_DATE)
            .requestXml(UPDATED_REQUEST_XML)
            .responseXml(UPDATED_RESPONSE_XML);

        restChannelTxnMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedChannelTxn.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedChannelTxn))
            )
            .andExpect(status().isOk());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
        ChannelTxn testChannelTxn = channelTxnList.get(channelTxnList.size() - 1);
        assertThat(testChannelTxn.getAccountNo()).isEqualTo(DEFAULT_ACCOUNT_NO);
        assertThat(testChannelTxn.getTxnDate()).isEqualTo(UPDATED_TXN_DATE);
        assertThat(testChannelTxn.getNarrative()).isEqualTo(DEFAULT_NARRATIVE);
        assertThat(testChannelTxn.getAmount()).isEqualTo(UPDATED_AMOUNT);
        assertThat(testChannelTxn.getTxnID()).isEqualTo(DEFAULT_TXN_ID);
        assertThat(testChannelTxn.getUtilityRef()).isEqualTo(UPDATED_UTILITY_REF);
        assertThat(testChannelTxn.getTransactionID()).isEqualTo(UPDATED_TRANSACTION_ID);
        assertThat(testChannelTxn.getmNO()).isEqualTo(UPDATED_M_NO);
        assertThat(testChannelTxn.getTxnType()).isEqualTo(DEFAULT_TXN_TYPE);
        assertThat(testChannelTxn.getTxnStatusMno()).isEqualTo(UPDATED_TXN_STATUS_MNO);
        assertThat(testChannelTxn.getmNTxnID()).isEqualTo(UPDATED_M_N_TXN_ID);
        assertThat(testChannelTxn.getMessage()).isEqualTo(UPDATED_MESSAGE);
        assertThat(testChannelTxn.getNotifiedStatus()).isEqualTo(DEFAULT_NOTIFIED_STATUS);
        assertThat(testChannelTxn.getDateInserted()).isEqualTo(DEFAULT_DATE_INSERTED);
        assertThat(testChannelTxn.getRecordId()).isEqualTo(UPDATED_RECORD_ID);
        assertThat(testChannelTxn.getFinalStatus()).isEqualTo(DEFAULT_FINAL_STATUS);
        assertThat(testChannelTxn.getSettlementDate()).isEqualTo(UPDATED_SETTLEMENT_DATE);
        assertThat(testChannelTxn.getRequestXml()).isEqualTo(UPDATED_REQUEST_XML);
        assertThat(testChannelTxn.getResponseXml()).isEqualTo(UPDATED_RESPONSE_XML);
    }

    @Test
    @Transactional
    void fullUpdateChannelTxnWithPatch() throws Exception {
        // Initialize the database
        channelTxnRepository.saveAndFlush(channelTxn);

        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();

        // Update the channelTxn using partial update
        ChannelTxn partialUpdatedChannelTxn = new ChannelTxn();
        partialUpdatedChannelTxn.setId(channelTxn.getId());

        partialUpdatedChannelTxn
            .accountNo(UPDATED_ACCOUNT_NO)
            .txnDate(UPDATED_TXN_DATE)
            .narrative(UPDATED_NARRATIVE)
            .amount(UPDATED_AMOUNT)
            .txnID(UPDATED_TXN_ID)
            .utilityRef(UPDATED_UTILITY_REF)
            .transactionID(UPDATED_TRANSACTION_ID)
            .mNO(UPDATED_M_NO)
            .txnType(UPDATED_TXN_TYPE)
            .txnStatusMno(UPDATED_TXN_STATUS_MNO)
            .mNTxnID(UPDATED_M_N_TXN_ID)
            .message(UPDATED_MESSAGE)
            .notifiedStatus(UPDATED_NOTIFIED_STATUS)
            .dateInserted(UPDATED_DATE_INSERTED)
            .recordId(UPDATED_RECORD_ID)
            .finalStatus(UPDATED_FINAL_STATUS)
            .settlementDate(UPDATED_SETTLEMENT_DATE)
            .requestXml(UPDATED_REQUEST_XML)
            .responseXml(UPDATED_RESPONSE_XML);

        restChannelTxnMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedChannelTxn.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedChannelTxn))
            )
            .andExpect(status().isOk());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
        ChannelTxn testChannelTxn = channelTxnList.get(channelTxnList.size() - 1);
        assertThat(testChannelTxn.getAccountNo()).isEqualTo(UPDATED_ACCOUNT_NO);
        assertThat(testChannelTxn.getTxnDate()).isEqualTo(UPDATED_TXN_DATE);
        assertThat(testChannelTxn.getNarrative()).isEqualTo(UPDATED_NARRATIVE);
        assertThat(testChannelTxn.getAmount()).isEqualTo(UPDATED_AMOUNT);
        assertThat(testChannelTxn.getTxnID()).isEqualTo(UPDATED_TXN_ID);
        assertThat(testChannelTxn.getUtilityRef()).isEqualTo(UPDATED_UTILITY_REF);
        assertThat(testChannelTxn.getTransactionID()).isEqualTo(UPDATED_TRANSACTION_ID);
        assertThat(testChannelTxn.getmNO()).isEqualTo(UPDATED_M_NO);
        assertThat(testChannelTxn.getTxnType()).isEqualTo(UPDATED_TXN_TYPE);
        assertThat(testChannelTxn.getTxnStatusMno()).isEqualTo(UPDATED_TXN_STATUS_MNO);
        assertThat(testChannelTxn.getmNTxnID()).isEqualTo(UPDATED_M_N_TXN_ID);
        assertThat(testChannelTxn.getMessage()).isEqualTo(UPDATED_MESSAGE);
        assertThat(testChannelTxn.getNotifiedStatus()).isEqualTo(UPDATED_NOTIFIED_STATUS);
        assertThat(testChannelTxn.getDateInserted()).isEqualTo(UPDATED_DATE_INSERTED);
        assertThat(testChannelTxn.getRecordId()).isEqualTo(UPDATED_RECORD_ID);
        assertThat(testChannelTxn.getFinalStatus()).isEqualTo(UPDATED_FINAL_STATUS);
        assertThat(testChannelTxn.getSettlementDate()).isEqualTo(UPDATED_SETTLEMENT_DATE);
        assertThat(testChannelTxn.getRequestXml()).isEqualTo(UPDATED_REQUEST_XML);
        assertThat(testChannelTxn.getResponseXml()).isEqualTo(UPDATED_RESPONSE_XML);
    }

    @Test
    @Transactional
    void patchNonExistingChannelTxn() throws Exception {
        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();
        channelTxn.setId(count.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restChannelTxnMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, channelTxn.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(channelTxn))
            )
            .andExpect(status().isBadRequest());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithIdMismatchChannelTxn() throws Exception {
        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();
        channelTxn.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restChannelTxnMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, count.incrementAndGet())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(channelTxn))
            )
            .andExpect(status().isBadRequest());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithMissingIdPathParamChannelTxn() throws Exception {
        int databaseSizeBeforeUpdate = channelTxnRepository.findAll().size();
        channelTxn.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restChannelTxnMockMvc
            .perform(
                patch(ENTITY_API_URL).contentType("application/merge-patch+json").content(TestUtil.convertObjectToJsonBytes(channelTxn))
            )
            .andExpect(status().isMethodNotAllowed());

        // Validate the ChannelTxn in the database
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void deleteChannelTxn() throws Exception {
        // Initialize the database
        channelTxnRepository.saveAndFlush(channelTxn);

        int databaseSizeBeforeDelete = channelTxnRepository.findAll().size();

        // Delete the channelTxn
        restChannelTxnMockMvc
            .perform(delete(ENTITY_API_URL_ID, channelTxn.getId()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<ChannelTxn> channelTxnList = channelTxnRepository.findAll();
        assertThat(channelTxnList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
*/
