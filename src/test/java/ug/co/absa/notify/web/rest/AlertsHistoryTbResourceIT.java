/*
package ug.co.absa.notify.web.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static ug.co.absa.notify.web.rest.TestUtil.sameInstant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
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
import ug.co.absa.notify.domain.AlertsHistoryTb;
import ug.co.absa.notify.repository.AlertsHistoryTbRepository;

*
 * Integration tests for the {@link AlertsHistoryTbResource} REST controller.


@IntegrationTest
@AutoConfigureMockMvc
@WithMockUser
class AlertsHistoryTbResourceIT {

    private static final String DEFAULT_HISTORY_ALERT_ID = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_ID = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_TEM_ID = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_TEM_ID = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_MESSAGE = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_MESSAGE = "BBBBBBBBBB";

    private static final ZonedDateTime DEFAULT_HISTORY_ALERT_DATE = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_HISTORY_ALERT_DATE = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final Integer DEFAULT_HISTORY_ALERT_RETRIES = 1;
    private static final Integer UPDATED_HISTORY_ALERT_RETRIES = 2;

    private static final ZonedDateTime DEFAULT_HISTORY_ALERT_TIMESTAMP = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_HISTORY_ALERT_TIMESTAMP = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final String DEFAULT_HISTORY_ALERT_POSTED_BY = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_POSTED_BY = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_POSTED_DATE = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_POSTED_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_INTERNAL_ERRORCODE = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_INTERNAL_ERRORCODE = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_RAW_REQUEST = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_RAW_REQUEST = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_RAW_RESPONSE = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_RAW_RESPONSE = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_1 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_1 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_2 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_2 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_3 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_3 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_4 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_4 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_5 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_5 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_6 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_6 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_7 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_7 = "BBBBBBBBBB";

    private static final String DEFAULT_HISTORY_ALERT_FREE_FIELD_8 = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_ALERT_FREE_FIELD_8 = "BBBBBBBBBB";

    private static final ZonedDateTime DEFAULT_CREATED_AT = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_CREATED_AT = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final ZonedDateTime DEFAULT_UPDATED_AT = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_UPDATED_AT = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final String DEFAULT_HISTORY_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_HISTORY_STATUS = "BBBBBBBBBB";

    private static final String ENTITY_API_URL = "/api/alerts-history-tbs";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    private static Random random = new Random();
    private static AtomicLong count = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    @Autowired
    private AlertsHistoryTbRepository alertsHistoryTbRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restAlertsHistoryTbMockMvc;

    private AlertsHistoryTb alertsHistoryTb;

*
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.


    public static AlertsHistoryTb createEntity(EntityManager em) {
        AlertsHistoryTb alertsHistoryTb = new AlertsHistoryTb()
            .historyAlertId(DEFAULT_HISTORY_ALERT_ID)
            .historyAlertTemId(DEFAULT_HISTORY_ALERT_TEM_ID)
            .historyAlertType(DEFAULT_HISTORY_ALERT_TYPE)
            .historyAlertStatus(DEFAULT_HISTORY_ALERT_STATUS)
            .historyAlertMessage(DEFAULT_HISTORY_ALERT_MESSAGE)
            .historyAlertDate(DEFAULT_HISTORY_ALERT_DATE)
            .historyAlertRetries(DEFAULT_HISTORY_ALERT_RETRIES)
            .historyAlertTimestamp(DEFAULT_HISTORY_ALERT_TIMESTAMP)
            .historyAlertPostedBy(DEFAULT_HISTORY_ALERT_POSTED_BY)
            .historyAlertPostedDate(DEFAULT_HISTORY_ALERT_POSTED_DATE)
            .historyAlertInternalErrorcode(DEFAULT_HISTORY_ALERT_INTERNAL_ERRORCODE)
            .historyAlertRawRequest(DEFAULT_HISTORY_ALERT_RAW_REQUEST)
            .historyAlertRawResponse(DEFAULT_HISTORY_ALERT_RAW_RESPONSE)
            .historyAlertFreeField1(DEFAULT_HISTORY_ALERT_FREE_FIELD_1)
            .historyAlertFreeField2(DEFAULT_HISTORY_ALERT_FREE_FIELD_2)
            .historyAlertFreeField3(DEFAULT_HISTORY_ALERT_FREE_FIELD_3)
            .historyAlertFreeField4(DEFAULT_HISTORY_ALERT_FREE_FIELD_4)
            .historyAlertFreeField5(DEFAULT_HISTORY_ALERT_FREE_FIELD_5)
            .historyAlertFreeField6(DEFAULT_HISTORY_ALERT_FREE_FIELD_6)
            .historyAlertFreeField7(DEFAULT_HISTORY_ALERT_FREE_FIELD_7)
            .historyAlertFreeField8(DEFAULT_HISTORY_ALERT_FREE_FIELD_8)
            .createdAt(DEFAULT_CREATED_AT)
            .updatedAt(DEFAULT_UPDATED_AT)
            .historyStatus(DEFAULT_HISTORY_STATUS);
        return alertsHistoryTb;
    }

*
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.


    public static AlertsHistoryTb createUpdatedEntity(EntityManager em) {
        AlertsHistoryTb alertsHistoryTb = new AlertsHistoryTb()
            .historyAlertId(UPDATED_HISTORY_ALERT_ID)
            .historyAlertTemId(UPDATED_HISTORY_ALERT_TEM_ID)
            .historyAlertType(UPDATED_HISTORY_ALERT_TYPE)
            .historyAlertStatus(UPDATED_HISTORY_ALERT_STATUS)
            .historyAlertMessage(UPDATED_HISTORY_ALERT_MESSAGE)
            .historyAlertDate(UPDATED_HISTORY_ALERT_DATE)
            .historyAlertRetries(UPDATED_HISTORY_ALERT_RETRIES)
            .historyAlertTimestamp(UPDATED_HISTORY_ALERT_TIMESTAMP)
            .historyAlertPostedBy(UPDATED_HISTORY_ALERT_POSTED_BY)
            .historyAlertPostedDate(UPDATED_HISTORY_ALERT_POSTED_DATE)
            .historyAlertInternalErrorcode(UPDATED_HISTORY_ALERT_INTERNAL_ERRORCODE)
            .historyAlertRawRequest(UPDATED_HISTORY_ALERT_RAW_REQUEST)
            .historyAlertRawResponse(UPDATED_HISTORY_ALERT_RAW_RESPONSE)
            .historyAlertFreeField1(UPDATED_HISTORY_ALERT_FREE_FIELD_1)
            .historyAlertFreeField2(UPDATED_HISTORY_ALERT_FREE_FIELD_2)
            .historyAlertFreeField3(UPDATED_HISTORY_ALERT_FREE_FIELD_3)
            .historyAlertFreeField4(UPDATED_HISTORY_ALERT_FREE_FIELD_4)
            .historyAlertFreeField5(UPDATED_HISTORY_ALERT_FREE_FIELD_5)
            .historyAlertFreeField6(UPDATED_HISTORY_ALERT_FREE_FIELD_6)
            .historyAlertFreeField7(UPDATED_HISTORY_ALERT_FREE_FIELD_7)
            .historyAlertFreeField8(UPDATED_HISTORY_ALERT_FREE_FIELD_8)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT)
            .historyStatus(UPDATED_HISTORY_STATUS);
        return alertsHistoryTb;
    }

    @BeforeEach
    public void initTest() {
        alertsHistoryTb = createEntity(em);
    }

    @Test
    @Transactional
    void createAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeCreate = alertsHistoryTbRepository.findAll().size();
        // Create the AlertsHistoryTb
        restAlertsHistoryTbMockMvc
            .perform(
                post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isCreated());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeCreate + 1);
        AlertsHistoryTb testAlertsHistoryTb = alertsHistoryTbList.get(alertsHistoryTbList.size() - 1);
        assertThat(testAlertsHistoryTb.getHistoryAlertId()).isEqualTo(DEFAULT_HISTORY_ALERT_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertTemId()).isEqualTo(DEFAULT_HISTORY_ALERT_TEM_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertType()).isEqualTo(DEFAULT_HISTORY_ALERT_TYPE);
        assertThat(testAlertsHistoryTb.getHistoryAlertStatus()).isEqualTo(DEFAULT_HISTORY_ALERT_STATUS);
        assertThat(testAlertsHistoryTb.getHistoryAlertMessage()).isEqualTo(DEFAULT_HISTORY_ALERT_MESSAGE);
        assertThat(testAlertsHistoryTb.getHistoryAlertDate()).isEqualTo(DEFAULT_HISTORY_ALERT_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRetries()).isEqualTo(DEFAULT_HISTORY_ALERT_RETRIES);
        assertThat(testAlertsHistoryTb.getHistoryAlertTimestamp()).isEqualTo(DEFAULT_HISTORY_ALERT_TIMESTAMP);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedBy()).isEqualTo(DEFAULT_HISTORY_ALERT_POSTED_BY);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedDate()).isEqualTo(DEFAULT_HISTORY_ALERT_POSTED_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertInternalErrorcode()).isEqualTo(DEFAULT_HISTORY_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawRequest()).isEqualTo(DEFAULT_HISTORY_ALERT_RAW_REQUEST);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawResponse()).isEqualTo(DEFAULT_HISTORY_ALERT_RAW_RESPONSE);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField1()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_1);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField2()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_2);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField3()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_3);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField4()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_4);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField5()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_5);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField6()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_6);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField7()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_7);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField8()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_8);
        assertThat(testAlertsHistoryTb.getCreatedAt()).isEqualTo(DEFAULT_CREATED_AT);
        assertThat(testAlertsHistoryTb.getUpdatedAt()).isEqualTo(DEFAULT_UPDATED_AT);
        assertThat(testAlertsHistoryTb.getHistoryStatus()).isEqualTo(DEFAULT_HISTORY_STATUS);
    }

    @Test
    @Transactional
    void createAlertsHistoryTbWithExistingId() throws Exception {
        // Create the AlertsHistoryTb with an existing ID
        alertsHistoryTb.setId(1L);

        int databaseSizeBeforeCreate = alertsHistoryTbRepository.findAll().size();

        // An entity with an existing ID cannot be created, so this API call must fail
        restAlertsHistoryTbMockMvc
            .perform(
                post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    void getAllAlertsHistoryTbs() throws Exception {
        // Initialize the database
        alertsHistoryTbRepository.saveAndFlush(alertsHistoryTb);

        // Get all the alertsHistoryTbList
        restAlertsHistoryTbMockMvc
            .perform(get(ENTITY_API_URL + "?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(alertsHistoryTb.getId().intValue())))
            .andExpect(jsonPath("$.[*].historyAlertId").value(hasItem(DEFAULT_HISTORY_ALERT_ID)))
            .andExpect(jsonPath("$.[*].historyAlertTemId").value(hasItem(DEFAULT_HISTORY_ALERT_TEM_ID)))
            .andExpect(jsonPath("$.[*].historyAlertType").value(hasItem(DEFAULT_HISTORY_ALERT_TYPE)))
            .andExpect(jsonPath("$.[*].historyAlertStatus").value(hasItem(DEFAULT_HISTORY_ALERT_STATUS)))
            .andExpect(jsonPath("$.[*].historyAlertMessage").value(hasItem(DEFAULT_HISTORY_ALERT_MESSAGE)))
            .andExpect(jsonPath("$.[*].historyAlertDate").value(hasItem(sameInstant(DEFAULT_HISTORY_ALERT_DATE))))
            .andExpect(jsonPath("$.[*].historyAlertRetries").value(hasItem(DEFAULT_HISTORY_ALERT_RETRIES)))
            .andExpect(jsonPath("$.[*].historyAlertTimestamp").value(hasItem(sameInstant(DEFAULT_HISTORY_ALERT_TIMESTAMP))))
            .andExpect(jsonPath("$.[*].historyAlertPostedBy").value(hasItem(DEFAULT_HISTORY_ALERT_POSTED_BY)))
            .andExpect(jsonPath("$.[*].historyAlertPostedDate").value(hasItem(DEFAULT_HISTORY_ALERT_POSTED_DATE)))
            .andExpect(jsonPath("$.[*].historyAlertInternalErrorcode").value(hasItem(DEFAULT_HISTORY_ALERT_INTERNAL_ERRORCODE)))
            .andExpect(jsonPath("$.[*].historyAlertRawRequest").value(hasItem(DEFAULT_HISTORY_ALERT_RAW_REQUEST.toString())))
            .andExpect(jsonPath("$.[*].historyAlertRawResponse").value(hasItem(DEFAULT_HISTORY_ALERT_RAW_RESPONSE.toString())))
            .andExpect(jsonPath("$.[*].historyAlertFreeField1").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_1.toString())))
            .andExpect(jsonPath("$.[*].historyAlertFreeField2").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_2.toString())))
            .andExpect(jsonPath("$.[*].historyAlertFreeField3").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_3)))
            .andExpect(jsonPath("$.[*].historyAlertFreeField4").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_4)))
            .andExpect(jsonPath("$.[*].historyAlertFreeField5").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_5)))
            .andExpect(jsonPath("$.[*].historyAlertFreeField6").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_6)))
            .andExpect(jsonPath("$.[*].historyAlertFreeField7").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_7)))
            .andExpect(jsonPath("$.[*].historyAlertFreeField8").value(hasItem(DEFAULT_HISTORY_ALERT_FREE_FIELD_8)))
            .andExpect(jsonPath("$.[*].createdAt").value(hasItem(sameInstant(DEFAULT_CREATED_AT))))
            .andExpect(jsonPath("$.[*].updatedAt").value(hasItem(sameInstant(DEFAULT_UPDATED_AT))))
            .andExpect(jsonPath("$.[*].historyStatus").value(hasItem(DEFAULT_HISTORY_STATUS)));
    }

    @Test
    @Transactional
    void getAlertsHistoryTb() throws Exception {
        // Initialize the database
        alertsHistoryTbRepository.saveAndFlush(alertsHistoryTb);

        // Get the alertsHistoryTb
        restAlertsHistoryTbMockMvc
            .perform(get(ENTITY_API_URL_ID, alertsHistoryTb.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(alertsHistoryTb.getId().intValue()))
            .andExpect(jsonPath("$.historyAlertId").value(DEFAULT_HISTORY_ALERT_ID))
            .andExpect(jsonPath("$.historyAlertTemId").value(DEFAULT_HISTORY_ALERT_TEM_ID))
            .andExpect(jsonPath("$.historyAlertType").value(DEFAULT_HISTORY_ALERT_TYPE))
            .andExpect(jsonPath("$.historyAlertStatus").value(DEFAULT_HISTORY_ALERT_STATUS))
            .andExpect(jsonPath("$.historyAlertMessage").value(DEFAULT_HISTORY_ALERT_MESSAGE))
            .andExpect(jsonPath("$.historyAlertDate").value(sameInstant(DEFAULT_HISTORY_ALERT_DATE)))
            .andExpect(jsonPath("$.historyAlertRetries").value(DEFAULT_HISTORY_ALERT_RETRIES))
            .andExpect(jsonPath("$.historyAlertTimestamp").value(sameInstant(DEFAULT_HISTORY_ALERT_TIMESTAMP)))
            .andExpect(jsonPath("$.historyAlertPostedBy").value(DEFAULT_HISTORY_ALERT_POSTED_BY))
            .andExpect(jsonPath("$.historyAlertPostedDate").value(DEFAULT_HISTORY_ALERT_POSTED_DATE))
            .andExpect(jsonPath("$.historyAlertInternalErrorcode").value(DEFAULT_HISTORY_ALERT_INTERNAL_ERRORCODE))
            .andExpect(jsonPath("$.historyAlertRawRequest").value(DEFAULT_HISTORY_ALERT_RAW_REQUEST.toString()))
            .andExpect(jsonPath("$.historyAlertRawResponse").value(DEFAULT_HISTORY_ALERT_RAW_RESPONSE.toString()))
            .andExpect(jsonPath("$.historyAlertFreeField1").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_1.toString()))
            .andExpect(jsonPath("$.historyAlertFreeField2").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_2.toString()))
            .andExpect(jsonPath("$.historyAlertFreeField3").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_3))
            .andExpect(jsonPath("$.historyAlertFreeField4").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_4))
            .andExpect(jsonPath("$.historyAlertFreeField5").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_5))
            .andExpect(jsonPath("$.historyAlertFreeField6").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_6))
            .andExpect(jsonPath("$.historyAlertFreeField7").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_7))
            .andExpect(jsonPath("$.historyAlertFreeField8").value(DEFAULT_HISTORY_ALERT_FREE_FIELD_8))
            .andExpect(jsonPath("$.createdAt").value(sameInstant(DEFAULT_CREATED_AT)))
            .andExpect(jsonPath("$.updatedAt").value(sameInstant(DEFAULT_UPDATED_AT)))
            .andExpect(jsonPath("$.historyStatus").value(DEFAULT_HISTORY_STATUS));
    }

    @Test
    @Transactional
    void getNonExistingAlertsHistoryTb() throws Exception {
        // Get the alertsHistoryTb
        restAlertsHistoryTbMockMvc.perform(get(ENTITY_API_URL_ID, Long.MAX_VALUE)).andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    void putExistingAlertsHistoryTb() throws Exception {
        // Initialize the database
        alertsHistoryTbRepository.saveAndFlush(alertsHistoryTb);
*/
/**//*

        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();

        // Update the alertsHistoryTb
        AlertsHistoryTb updatedAlertsHistoryTb = alertsHistoryTbRepository.findById(alertsHistoryTb.getId()).get();
        // Disconnect from session so that the updates on updatedAlertsHistoryTb are not directly saved in db
        em.detach(updatedAlertsHistoryTb);
        updatedAlertsHistoryTb
            .historyAlertId(UPDATED_HISTORY_ALERT_ID)
            .historyAlertTemId(UPDATED_HISTORY_ALERT_TEM_ID)
            .historyAlertType(UPDATED_HISTORY_ALERT_TYPE)
            .historyAlertStatus(UPDATED_HISTORY_ALERT_STATUS)
            .historyAlertMessage(UPDATED_HISTORY_ALERT_MESSAGE)
            .historyAlertDate(UPDATED_HISTORY_ALERT_DATE)
            .historyAlertRetries(UPDATED_HISTORY_ALERT_RETRIES)
            .historyAlertTimestamp(UPDATED_HISTORY_ALERT_TIMESTAMP)
            .historyAlertPostedBy(UPDATED_HISTORY_ALERT_POSTED_BY)
            .historyAlertPostedDate(UPDATED_HISTORY_ALERT_POSTED_DATE)
            .historyAlertInternalErrorcode(UPDATED_HISTORY_ALERT_INTERNAL_ERRORCODE)
            .historyAlertRawRequest(UPDATED_HISTORY_ALERT_RAW_REQUEST)
            .historyAlertRawResponse(UPDATED_HISTORY_ALERT_RAW_RESPONSE)
            .historyAlertFreeField1(UPDATED_HISTORY_ALERT_FREE_FIELD_1)
            .historyAlertFreeField2(UPDATED_HISTORY_ALERT_FREE_FIELD_2)
            .historyAlertFreeField3(UPDATED_HISTORY_ALERT_FREE_FIELD_3)
            .historyAlertFreeField4(UPDATED_HISTORY_ALERT_FREE_FIELD_4)
            .historyAlertFreeField5(UPDATED_HISTORY_ALERT_FREE_FIELD_5)
            .historyAlertFreeField6(UPDATED_HISTORY_ALERT_FREE_FIELD_6)
            .historyAlertFreeField7(UPDATED_HISTORY_ALERT_FREE_FIELD_7)
            .historyAlertFreeField8(UPDATED_HISTORY_ALERT_FREE_FIELD_8)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT)
            .historyStatus(UPDATED_HISTORY_STATUS);

        restAlertsHistoryTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, updatedAlertsHistoryTb.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(updatedAlertsHistoryTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsHistoryTb testAlertsHistoryTb = alertsHistoryTbList.get(alertsHistoryTbList.size() - 1);
        assertThat(testAlertsHistoryTb.getHistoryAlertId()).isEqualTo(UPDATED_HISTORY_ALERT_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertTemId()).isEqualTo(UPDATED_HISTORY_ALERT_TEM_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertType()).isEqualTo(UPDATED_HISTORY_ALERT_TYPE);
        assertThat(testAlertsHistoryTb.getHistoryAlertStatus()).isEqualTo(UPDATED_HISTORY_ALERT_STATUS);
        assertThat(testAlertsHistoryTb.getHistoryAlertMessage()).isEqualTo(UPDATED_HISTORY_ALERT_MESSAGE);
        assertThat(testAlertsHistoryTb.getHistoryAlertDate()).isEqualTo(UPDATED_HISTORY_ALERT_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRetries()).isEqualTo(UPDATED_HISTORY_ALERT_RETRIES);
        assertThat(testAlertsHistoryTb.getHistoryAlertTimestamp()).isEqualTo(UPDATED_HISTORY_ALERT_TIMESTAMP);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedBy()).isEqualTo(UPDATED_HISTORY_ALERT_POSTED_BY);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedDate()).isEqualTo(UPDATED_HISTORY_ALERT_POSTED_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertInternalErrorcode()).isEqualTo(UPDATED_HISTORY_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawRequest()).isEqualTo(UPDATED_HISTORY_ALERT_RAW_REQUEST);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawResponse()).isEqualTo(UPDATED_HISTORY_ALERT_RAW_RESPONSE);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField1()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_1);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField2()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_2);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField3()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_3);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField4()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_4);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField5()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_5);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField6()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_6);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField7()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_7);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField8()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_8);
        assertThat(testAlertsHistoryTb.getCreatedAt()).isEqualTo(UPDATED_CREATED_AT);
        assertThat(testAlertsHistoryTb.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
        assertThat(testAlertsHistoryTb.getHistoryStatus()).isEqualTo(UPDATED_HISTORY_STATUS);
    }

    @Test
    @Transactional
    void putNonExistingAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();
        alertsHistoryTb.setId(count.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAlertsHistoryTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, alertsHistoryTb.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithIdMismatchAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();
        alertsHistoryTb.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsHistoryTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, count.incrementAndGet())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithMissingIdPathParamAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();
        alertsHistoryTb.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsHistoryTbMockMvc
            .perform(
                put(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isMethodNotAllowed());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void partialUpdateAlertsHistoryTbWithPatch() throws Exception {
        // Initialize the database
        alertsHistoryTbRepository.saveAndFlush(alertsHistoryTb);

        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();

        // Update the alertsHistoryTb using partial update
        AlertsHistoryTb partialUpdatedAlertsHistoryTb = new AlertsHistoryTb();
        partialUpdatedAlertsHistoryTb.setId(alertsHistoryTb.getId());

        partialUpdatedAlertsHistoryTb
            .historyAlertTemId(UPDATED_HISTORY_ALERT_TEM_ID)
            .historyAlertType(UPDATED_HISTORY_ALERT_TYPE)
            .historyAlertMessage(UPDATED_HISTORY_ALERT_MESSAGE)
            .historyAlertDate(UPDATED_HISTORY_ALERT_DATE)
            .historyAlertTimestamp(UPDATED_HISTORY_ALERT_TIMESTAMP)
            .historyAlertPostedBy(UPDATED_HISTORY_ALERT_POSTED_BY)
            .historyAlertRawRequest(UPDATED_HISTORY_ALERT_RAW_REQUEST)
            .historyAlertFreeField1(UPDATED_HISTORY_ALERT_FREE_FIELD_1)
            .historyAlertFreeField2(UPDATED_HISTORY_ALERT_FREE_FIELD_2)
            .historyAlertFreeField3(UPDATED_HISTORY_ALERT_FREE_FIELD_3)
            .historyAlertFreeField5(UPDATED_HISTORY_ALERT_FREE_FIELD_5)
            .historyAlertFreeField8(UPDATED_HISTORY_ALERT_FREE_FIELD_8)
            .updatedAt(UPDATED_UPDATED_AT);

        restAlertsHistoryTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedAlertsHistoryTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedAlertsHistoryTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsHistoryTb testAlertsHistoryTb = alertsHistoryTbList.get(alertsHistoryTbList.size() - 1);
        assertThat(testAlertsHistoryTb.getHistoryAlertId()).isEqualTo(DEFAULT_HISTORY_ALERT_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertTemId()).isEqualTo(UPDATED_HISTORY_ALERT_TEM_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertType()).isEqualTo(UPDATED_HISTORY_ALERT_TYPE);
        assertThat(testAlertsHistoryTb.getHistoryAlertStatus()).isEqualTo(DEFAULT_HISTORY_ALERT_STATUS);
        assertThat(testAlertsHistoryTb.getHistoryAlertMessage()).isEqualTo(UPDATED_HISTORY_ALERT_MESSAGE);
        assertThat(testAlertsHistoryTb.getHistoryAlertDate()).isEqualTo(UPDATED_HISTORY_ALERT_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRetries()).isEqualTo(DEFAULT_HISTORY_ALERT_RETRIES);
        assertThat(testAlertsHistoryTb.getHistoryAlertTimestamp()).isEqualTo(UPDATED_HISTORY_ALERT_TIMESTAMP);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedBy()).isEqualTo(UPDATED_HISTORY_ALERT_POSTED_BY);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedDate()).isEqualTo(DEFAULT_HISTORY_ALERT_POSTED_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertInternalErrorcode()).isEqualTo(DEFAULT_HISTORY_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawRequest()).isEqualTo(UPDATED_HISTORY_ALERT_RAW_REQUEST);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawResponse()).isEqualTo(DEFAULT_HISTORY_ALERT_RAW_RESPONSE);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField1()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_1);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField2()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_2);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField3()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_3);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField4()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_4);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField5()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_5);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField6()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_6);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField7()).isEqualTo(DEFAULT_HISTORY_ALERT_FREE_FIELD_7);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField8()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_8);
        assertThat(testAlertsHistoryTb.getCreatedAt()).isEqualTo(DEFAULT_CREATED_AT);
        assertThat(testAlertsHistoryTb.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
        assertThat(testAlertsHistoryTb.getHistoryStatus()).isEqualTo(DEFAULT_HISTORY_STATUS);
    }

    @Test
    @Transactional
    void fullUpdateAlertsHistoryTbWithPatch() throws Exception {
        // Initialize the database
        alertsHistoryTbRepository.saveAndFlush(alertsHistoryTb);

        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();

        // Update the alertsHistoryTb using partial update
        AlertsHistoryTb partialUpdatedAlertsHistoryTb = new AlertsHistoryTb();
        partialUpdatedAlertsHistoryTb.setId(alertsHistoryTb.getId());

        partialUpdatedAlertsHistoryTb
            .historyAlertId(UPDATED_HISTORY_ALERT_ID)
            .historyAlertTemId(UPDATED_HISTORY_ALERT_TEM_ID)
            .historyAlertType(UPDATED_HISTORY_ALERT_TYPE)
            .historyAlertStatus(UPDATED_HISTORY_ALERT_STATUS)
            .historyAlertMessage(UPDATED_HISTORY_ALERT_MESSAGE)
            .historyAlertDate(UPDATED_HISTORY_ALERT_DATE)
            .historyAlertRetries(UPDATED_HISTORY_ALERT_RETRIES)
            .historyAlertTimestamp(UPDATED_HISTORY_ALERT_TIMESTAMP)
            .historyAlertPostedBy(UPDATED_HISTORY_ALERT_POSTED_BY)
            .historyAlertPostedDate(UPDATED_HISTORY_ALERT_POSTED_DATE)
            .historyAlertInternalErrorcode(UPDATED_HISTORY_ALERT_INTERNAL_ERRORCODE)
            .historyAlertRawRequest(UPDATED_HISTORY_ALERT_RAW_REQUEST)
            .historyAlertRawResponse(UPDATED_HISTORY_ALERT_RAW_RESPONSE)
            .historyAlertFreeField1(UPDATED_HISTORY_ALERT_FREE_FIELD_1)
            .historyAlertFreeField2(UPDATED_HISTORY_ALERT_FREE_FIELD_2)
            .historyAlertFreeField3(UPDATED_HISTORY_ALERT_FREE_FIELD_3)
            .historyAlertFreeField4(UPDATED_HISTORY_ALERT_FREE_FIELD_4)
            .historyAlertFreeField5(UPDATED_HISTORY_ALERT_FREE_FIELD_5)
            .historyAlertFreeField6(UPDATED_HISTORY_ALERT_FREE_FIELD_6)
            .historyAlertFreeField7(UPDATED_HISTORY_ALERT_FREE_FIELD_7)
            .historyAlertFreeField8(UPDATED_HISTORY_ALERT_FREE_FIELD_8)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT)
            .historyStatus(UPDATED_HISTORY_STATUS);

        restAlertsHistoryTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedAlertsHistoryTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedAlertsHistoryTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsHistoryTb testAlertsHistoryTb = alertsHistoryTbList.get(alertsHistoryTbList.size() - 1);
        assertThat(testAlertsHistoryTb.getHistoryAlertId()).isEqualTo(UPDATED_HISTORY_ALERT_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertTemId()).isEqualTo(UPDATED_HISTORY_ALERT_TEM_ID);
        assertThat(testAlertsHistoryTb.getHistoryAlertType()).isEqualTo(UPDATED_HISTORY_ALERT_TYPE);
        assertThat(testAlertsHistoryTb.getHistoryAlertStatus()).isEqualTo(UPDATED_HISTORY_ALERT_STATUS);
        assertThat(testAlertsHistoryTb.getHistoryAlertMessage()).isEqualTo(UPDATED_HISTORY_ALERT_MESSAGE);
        assertThat(testAlertsHistoryTb.getHistoryAlertDate()).isEqualTo(UPDATED_HISTORY_ALERT_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRetries()).isEqualTo(UPDATED_HISTORY_ALERT_RETRIES);
        assertThat(testAlertsHistoryTb.getHistoryAlertTimestamp()).isEqualTo(UPDATED_HISTORY_ALERT_TIMESTAMP);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedBy()).isEqualTo(UPDATED_HISTORY_ALERT_POSTED_BY);
        assertThat(testAlertsHistoryTb.getHistoryAlertPostedDate()).isEqualTo(UPDATED_HISTORY_ALERT_POSTED_DATE);
        assertThat(testAlertsHistoryTb.getHistoryAlertInternalErrorcode()).isEqualTo(UPDATED_HISTORY_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawRequest()).isEqualTo(UPDATED_HISTORY_ALERT_RAW_REQUEST);
        assertThat(testAlertsHistoryTb.getHistoryAlertRawResponse()).isEqualTo(UPDATED_HISTORY_ALERT_RAW_RESPONSE);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField1()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_1);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField2()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_2);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField3()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_3);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField4()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_4);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField5()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_5);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField6()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_6);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField7()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_7);
        assertThat(testAlertsHistoryTb.getHistoryAlertFreeField8()).isEqualTo(UPDATED_HISTORY_ALERT_FREE_FIELD_8);
        assertThat(testAlertsHistoryTb.getCreatedAt()).isEqualTo(UPDATED_CREATED_AT);
        assertThat(testAlertsHistoryTb.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
        assertThat(testAlertsHistoryTb.getHistoryStatus()).isEqualTo(UPDATED_HISTORY_STATUS);
    }

    @Test
    @Transactional
    void patchNonExistingAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();
        alertsHistoryTb.setId(count.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAlertsHistoryTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, alertsHistoryTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithIdMismatchAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();
        alertsHistoryTb.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsHistoryTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, count.incrementAndGet())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithMissingIdPathParamAlertsHistoryTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsHistoryTbRepository.findAll().size();
        alertsHistoryTb.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsHistoryTbMockMvc
            .perform(
                patch(ENTITY_API_URL)
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsHistoryTb))
            )
            .andExpect(status().isMethodNotAllowed());

        // Validate the AlertsHistoryTb in the database
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void deleteAlertsHistoryTb() throws Exception {
        // Initialize the database
        alertsHistoryTbRepository.saveAndFlush(alertsHistoryTb);

        int databaseSizeBeforeDelete = alertsHistoryTbRepository.findAll().size();

        // Delete the alertsHistoryTb
        restAlertsHistoryTbMockMvc
            .perform(delete(ENTITY_API_URL_ID, alertsHistoryTb.getId()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<AlertsHistoryTb> alertsHistoryTbList = alertsHistoryTbRepository.findAll();
        assertThat(alertsHistoryTbList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
*/
