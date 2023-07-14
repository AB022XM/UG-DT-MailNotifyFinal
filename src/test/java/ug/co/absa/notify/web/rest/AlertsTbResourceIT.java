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
import java.util.UUID;

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
import ug.co.absa.notify.domain.AlertsTb;
import ug.co.absa.notify.repository.AlertsTbRepository;

*/
/**
 * Integration tests for the {@link AlertsTbResource} REST controller.
 *//*

@IntegrationTest
@AutoConfigureMockMvc
@WithMockUser
class AlertsTbResourceIT {

    private static final String DEFAULT_ALERT_ID = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_ID = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TEM_ID = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEM_ID = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TYPE = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_STATUS = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_MESSAGE = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_MESSAGE = "BBBBBBBBBB";

    private static final ZonedDateTime DEFAULT_ALERT_DATE = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_ALERT_DATE = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final Integer DEFAULT_ALERT_RETRIES = 1;
    private static final Integer UPDATED_ALERT_RETRIES = 2;

    private static final ZonedDateTime DEFAULT_ALERT_TIMESTAMP = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_ALERT_TIMESTAMP = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final String DEFAULT_ALERT_POSTED_BY = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_POSTED_BY = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_POSTED_DATE = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_POSTED_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_INTERNAL_ERRORCODE = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_INTERNAL_ERRORCODE = "BBBBBBBBBB";

    private static final String DEFAULT_RAW_REQUEST = "AAAAAAAAAA";
    private static final String UPDATED_RAW_REQUEST = "BBBBBBBBBB";

    private static final String DEFAULT_RAW_RESPONSE = "AAAAAAAAAA";
    private static final String UPDATED_RAW_RESPONSE = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_1 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_1 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_2 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_2 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_3 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_3 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_4 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_4 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_5 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_5 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_6 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_6 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_7 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_7 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_FREE_FIELD_8 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_FREE_FIELD_8 = "BBBBBBBBBB";

    private static final ZonedDateTime DEFAULT_CREATED_AT = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_CREATED_AT = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final ZonedDateTime DEFAULT_UPDATED_AT = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_UPDATED_AT = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final String DEFAULT_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_STATUS = "BBBBBBBBBB";

    private static final String ENTITY_API_URL = "/api/alerts-tbs";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    @Autowired
    private AlertsTbRepository alertsTbRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restAlertsTbMockMvc;

    private AlertsTb alertsTb;

    */
/**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*

    public static AlertsTb createEntity(EntityManager em) {
        AlertsTb alertsTb = new AlertsTb()
            .alertId(DEFAULT_ALERT_ID)
            .alertTemId(DEFAULT_ALERT_TEM_ID)
            .alertType(DEFAULT_ALERT_TYPE)
            .alertStatus(DEFAULT_ALERT_STATUS)
            .alertMessage(DEFAULT_ALERT_MESSAGE)
            .alertDate(DEFAULT_ALERT_DATE)
            .alertRetries(DEFAULT_ALERT_RETRIES)
            .alertTimestamp(DEFAULT_ALERT_TIMESTAMP)
            .alertPostedBy(DEFAULT_ALERT_POSTED_BY)
            .alertPostedDate(DEFAULT_ALERT_POSTED_DATE)
            .alertInternalErrorcode(DEFAULT_ALERT_INTERNAL_ERRORCODE)
            .rawRequest(DEFAULT_RAW_REQUEST)
            .rawResponse(DEFAULT_RAW_RESPONSE)
            .alertFreeField1(DEFAULT_ALERT_FREE_FIELD_1)
            .alertFreeField2(DEFAULT_ALERT_FREE_FIELD_2)
            .alertFreeField3(DEFAULT_ALERT_FREE_FIELD_3)
            .alertFreeField4(DEFAULT_ALERT_FREE_FIELD_4)
            .alertFreeField5(DEFAULT_ALERT_FREE_FIELD_5)
            .alertFreeField6(DEFAULT_ALERT_FREE_FIELD_6)
            .alertFreeField7(DEFAULT_ALERT_FREE_FIELD_7)
            .alertFreeField8(DEFAULT_ALERT_FREE_FIELD_8)
            .createdAt(DEFAULT_CREATED_AT)
            .updatedAt(DEFAULT_UPDATED_AT)
            .status(DEFAULT_STATUS);
        return alertsTb;
    }

    */
/**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*

    public static AlertsTb createUpdatedEntity(EntityManager em) {
        AlertsTb alertsTb = new AlertsTb()
            .alertId(UPDATED_ALERT_ID)
            .alertTemId(UPDATED_ALERT_TEM_ID)
            .alertType(UPDATED_ALERT_TYPE)
            .alertStatus(UPDATED_ALERT_STATUS)
            .alertMessage(UPDATED_ALERT_MESSAGE)
            .alertDate(UPDATED_ALERT_DATE)
            .alertRetries(UPDATED_ALERT_RETRIES)
            .alertTimestamp(UPDATED_ALERT_TIMESTAMP)
            .alertPostedBy(UPDATED_ALERT_POSTED_BY)
            .alertPostedDate(UPDATED_ALERT_POSTED_DATE)
            .alertInternalErrorcode(UPDATED_ALERT_INTERNAL_ERRORCODE)
            .rawRequest(UPDATED_RAW_REQUEST)
            .rawResponse(UPDATED_RAW_RESPONSE)
            .alertFreeField1(UPDATED_ALERT_FREE_FIELD_1)
            .alertFreeField2(UPDATED_ALERT_FREE_FIELD_2)
            .alertFreeField3(UPDATED_ALERT_FREE_FIELD_3)
            .alertFreeField4(UPDATED_ALERT_FREE_FIELD_4)
            .alertFreeField5(UPDATED_ALERT_FREE_FIELD_5)
            .alertFreeField6(UPDATED_ALERT_FREE_FIELD_6)
            .alertFreeField7(UPDATED_ALERT_FREE_FIELD_7)
            .alertFreeField8(UPDATED_ALERT_FREE_FIELD_8)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT)
            .status(UPDATED_STATUS);
        return alertsTb;
    }

    @BeforeEach
    public void initTest() {
        alertsTb = createEntity(em);
    }

    @Test
    @Transactional
    void createAlertsTb() throws Exception {
        int databaseSizeBeforeCreate = alertsTbRepository.findAll().size();
        // Create the AlertsTb
        restAlertsTbMockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsTb)))
            .andExpect(status().isCreated());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeCreate + 1);
        AlertsTb testAlertsTb = alertsTbList.get(alertsTbList.size() - 1);
        assertThat(testAlertsTb.getAlertId()).isEqualTo(DEFAULT_ALERT_ID);
        assertThat(testAlertsTb.getAlertTemId()).isEqualTo(DEFAULT_ALERT_TEM_ID);
        assertThat(testAlertsTb.getAlertType()).isEqualTo(DEFAULT_ALERT_TYPE);
        assertThat(testAlertsTb.getAlertStatus()).isEqualTo(DEFAULT_ALERT_STATUS);
        assertThat(testAlertsTb.getAlertMessage()).isEqualTo(DEFAULT_ALERT_MESSAGE);
        assertThat(testAlertsTb.getAlertDate()).isEqualTo(DEFAULT_ALERT_DATE);
        assertThat(testAlertsTb.getAlertRetries()).isEqualTo(DEFAULT_ALERT_RETRIES);
        assertThat(testAlertsTb.getAlertTimestamp()).isEqualTo(DEFAULT_ALERT_TIMESTAMP);
        assertThat(testAlertsTb.getAlertPostedBy()).isEqualTo(DEFAULT_ALERT_POSTED_BY);
        assertThat(testAlertsTb.getAlertPostedDate()).isEqualTo(DEFAULT_ALERT_POSTED_DATE);
        assertThat(testAlertsTb.getAlertInternalErrorcode()).isEqualTo(DEFAULT_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsTb.getRawRequest()).isEqualTo(DEFAULT_RAW_REQUEST);
        assertThat(testAlertsTb.getRawResponse()).isEqualTo(DEFAULT_RAW_RESPONSE);
        assertThat(testAlertsTb.getAlertFreeField1()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_1);
        assertThat(testAlertsTb.getAlertFreeField2()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_2);
        assertThat(testAlertsTb.getAlertFreeField3()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_3);
        assertThat(testAlertsTb.getAlertFreeField4()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_4);
        assertThat(testAlertsTb.getAlertFreeField5()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_5);
        assertThat(testAlertsTb.getAlertFreeField6()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_6);
        assertThat(testAlertsTb.getAlertFreeField7()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_7);
        assertThat(testAlertsTb.getAlertFreeField8()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_8);
        assertThat(testAlertsTb.getCreatedAt()).isEqualTo(DEFAULT_CREATED_AT);
        assertThat(testAlertsTb.getUpdatedAt()).isEqualTo(DEFAULT_UPDATED_AT);
        assertThat(testAlertsTb.getStatus()).isEqualTo(DEFAULT_STATUS);
    }

    @Test
    @Transactional
    void createAlertsTbWithExistingId() throws Exception {
        // Create the AlertsTb with an existing ID
        alertsTbRepository.saveAndFlush(alertsTb);

        int databaseSizeBeforeCreate = alertsTbRepository.findAll().size();

        // An entity with an existing ID cannot be created, so this API call must fail
        restAlertsTbMockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsTb)))
            .andExpect(status().isBadRequest());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    void getAllAlertsTbs() throws Exception {
        // Initialize the database
        alertsTbRepository.saveAndFlush(alertsTb);

        // Get all the alertsTbList
        restAlertsTbMockMvc
            .perform(get(ENTITY_API_URL + "?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(alertsTb.getId().toString())))
            .andExpect(jsonPath("$.[*].alertId").value(hasItem(DEFAULT_ALERT_ID)))
            .andExpect(jsonPath("$.[*].alertTemId").value(hasItem(DEFAULT_ALERT_TEM_ID)))
            .andExpect(jsonPath("$.[*].alertType").value(hasItem(DEFAULT_ALERT_TYPE)))
            .andExpect(jsonPath("$.[*].alertStatus").value(hasItem(DEFAULT_ALERT_STATUS)))
            .andExpect(jsonPath("$.[*].alertMessage").value(hasItem(DEFAULT_ALERT_MESSAGE)))
            .andExpect(jsonPath("$.[*].alertDate").value(hasItem(sameInstant(DEFAULT_ALERT_DATE))))
            .andExpect(jsonPath("$.[*].alertRetries").value(hasItem(DEFAULT_ALERT_RETRIES)))
            .andExpect(jsonPath("$.[*].alertTimestamp").value(hasItem(sameInstant(DEFAULT_ALERT_TIMESTAMP))))
            .andExpect(jsonPath("$.[*].alertPostedBy").value(hasItem(DEFAULT_ALERT_POSTED_BY)))
            .andExpect(jsonPath("$.[*].alertPostedDate").value(hasItem(DEFAULT_ALERT_POSTED_DATE)))
            .andExpect(jsonPath("$.[*].alertInternalErrorcode").value(hasItem(DEFAULT_ALERT_INTERNAL_ERRORCODE)))
            .andExpect(jsonPath("$.[*].rawRequest").value(hasItem(DEFAULT_RAW_REQUEST.toString())))
            .andExpect(jsonPath("$.[*].rawResponse").value(hasItem(DEFAULT_RAW_RESPONSE.toString())))
            .andExpect(jsonPath("$.[*].alertFreeField1").value(hasItem(DEFAULT_ALERT_FREE_FIELD_1.toString())))
            .andExpect(jsonPath("$.[*].alertFreeField2").value(hasItem(DEFAULT_ALERT_FREE_FIELD_2.toString())))
            .andExpect(jsonPath("$.[*].alertFreeField3").value(hasItem(DEFAULT_ALERT_FREE_FIELD_3)))
            .andExpect(jsonPath("$.[*].alertFreeField4").value(hasItem(DEFAULT_ALERT_FREE_FIELD_4)))
            .andExpect(jsonPath("$.[*].alertFreeField5").value(hasItem(DEFAULT_ALERT_FREE_FIELD_5)))
            .andExpect(jsonPath("$.[*].alertFreeField6").value(hasItem(DEFAULT_ALERT_FREE_FIELD_6)))
            .andExpect(jsonPath("$.[*].alertFreeField7").value(hasItem(DEFAULT_ALERT_FREE_FIELD_7)))
            .andExpect(jsonPath("$.[*].alertFreeField8").value(hasItem(DEFAULT_ALERT_FREE_FIELD_8)))
            .andExpect(jsonPath("$.[*].createdAt").value(hasItem(sameInstant(DEFAULT_CREATED_AT))))
            .andExpect(jsonPath("$.[*].updatedAt").value(hasItem(sameInstant(DEFAULT_UPDATED_AT))))
            .andExpect(jsonPath("$.[*].status").value(hasItem(DEFAULT_STATUS)));
    }

    @Test
    @Transactional
    void getAlertsTb() throws Exception {
        // Initialize the database
        alertsTbRepository.saveAndFlush(alertsTb);

        // Get the alertsTb
        restAlertsTbMockMvc
            .perform(get(ENTITY_API_URL_ID, alertsTb.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(alertsTb.getId().toString()))
            .andExpect(jsonPath("$.alertId").value(DEFAULT_ALERT_ID))
            .andExpect(jsonPath("$.alertTemId").value(DEFAULT_ALERT_TEM_ID))
            .andExpect(jsonPath("$.alertType").value(DEFAULT_ALERT_TYPE))
            .andExpect(jsonPath("$.alertStatus").value(DEFAULT_ALERT_STATUS))
            .andExpect(jsonPath("$.alertMessage").value(DEFAULT_ALERT_MESSAGE))
            .andExpect(jsonPath("$.alertDate").value(sameInstant(DEFAULT_ALERT_DATE)))
            .andExpect(jsonPath("$.alertRetries").value(DEFAULT_ALERT_RETRIES))
            .andExpect(jsonPath("$.alertTimestamp").value(sameInstant(DEFAULT_ALERT_TIMESTAMP)))
            .andExpect(jsonPath("$.alertPostedBy").value(DEFAULT_ALERT_POSTED_BY))
            .andExpect(jsonPath("$.alertPostedDate").value(DEFAULT_ALERT_POSTED_DATE))
            .andExpect(jsonPath("$.alertInternalErrorcode").value(DEFAULT_ALERT_INTERNAL_ERRORCODE))
            .andExpect(jsonPath("$.rawRequest").value(DEFAULT_RAW_REQUEST.toString()))
            .andExpect(jsonPath("$.rawResponse").value(DEFAULT_RAW_RESPONSE.toString()))
            .andExpect(jsonPath("$.alertFreeField1").value(DEFAULT_ALERT_FREE_FIELD_1.toString()))
            .andExpect(jsonPath("$.alertFreeField2").value(DEFAULT_ALERT_FREE_FIELD_2.toString()))
            .andExpect(jsonPath("$.alertFreeField3").value(DEFAULT_ALERT_FREE_FIELD_3))
            .andExpect(jsonPath("$.alertFreeField4").value(DEFAULT_ALERT_FREE_FIELD_4))
            .andExpect(jsonPath("$.alertFreeField5").value(DEFAULT_ALERT_FREE_FIELD_5))
            .andExpect(jsonPath("$.alertFreeField6").value(DEFAULT_ALERT_FREE_FIELD_6))
            .andExpect(jsonPath("$.alertFreeField7").value(DEFAULT_ALERT_FREE_FIELD_7))
            .andExpect(jsonPath("$.alertFreeField8").value(DEFAULT_ALERT_FREE_FIELD_8))
            .andExpect(jsonPath("$.createdAt").value(sameInstant(DEFAULT_CREATED_AT)))
            .andExpect(jsonPath("$.updatedAt").value(sameInstant(DEFAULT_UPDATED_AT)))
            .andExpect(jsonPath("$.status").value(DEFAULT_STATUS));
    }

    @Test
    @Transactional
    void getNonExistingAlertsTb() throws Exception {
        // Get the alertsTb
        restAlertsTbMockMvc.perform(get(ENTITY_API_URL_ID, UUID.randomUUID().toString())).andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    void putExistingAlertsTb() throws Exception {
        // Initialize the database
        alertsTbRepository.saveAndFlush(alertsTb);

        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();

        // Update the alertsTb
        AlertsTb updatedAlertsTb = alertsTbRepository.findById(alertsTb.getId()).get();
        // Disconnect from session so that the updates on updatedAlertsTb are not directly saved in db
        em.detach(updatedAlertsTb);
        updatedAlertsTb
            .alertId(UPDATED_ALERT_ID)
            .alertTemId(UPDATED_ALERT_TEM_ID)
            .alertType(UPDATED_ALERT_TYPE)
            .alertStatus(UPDATED_ALERT_STATUS)
            .alertMessage(UPDATED_ALERT_MESSAGE)
            .alertDate(UPDATED_ALERT_DATE)
            .alertRetries(UPDATED_ALERT_RETRIES)
            .alertTimestamp(UPDATED_ALERT_TIMESTAMP)
            .alertPostedBy(UPDATED_ALERT_POSTED_BY)
            .alertPostedDate(UPDATED_ALERT_POSTED_DATE)
            .alertInternalErrorcode(UPDATED_ALERT_INTERNAL_ERRORCODE)
            .rawRequest(UPDATED_RAW_REQUEST)
            .rawResponse(UPDATED_RAW_RESPONSE)
            .alertFreeField1(UPDATED_ALERT_FREE_FIELD_1)
            .alertFreeField2(UPDATED_ALERT_FREE_FIELD_2)
            .alertFreeField3(UPDATED_ALERT_FREE_FIELD_3)
            .alertFreeField4(UPDATED_ALERT_FREE_FIELD_4)
            .alertFreeField5(UPDATED_ALERT_FREE_FIELD_5)
            .alertFreeField6(UPDATED_ALERT_FREE_FIELD_6)
            .alertFreeField7(UPDATED_ALERT_FREE_FIELD_7)
            .alertFreeField8(UPDATED_ALERT_FREE_FIELD_8)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT)
            .status(UPDATED_STATUS);

        restAlertsTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, updatedAlertsTb.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(updatedAlertsTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsTb testAlertsTb = alertsTbList.get(alertsTbList.size() - 1);
        assertThat(testAlertsTb.getAlertId()).isEqualTo(UPDATED_ALERT_ID);
        assertThat(testAlertsTb.getAlertTemId()).isEqualTo(UPDATED_ALERT_TEM_ID);
        assertThat(testAlertsTb.getAlertType()).isEqualTo(UPDATED_ALERT_TYPE);
        assertThat(testAlertsTb.getAlertStatus()).isEqualTo(UPDATED_ALERT_STATUS);
        assertThat(testAlertsTb.getAlertMessage()).isEqualTo(UPDATED_ALERT_MESSAGE);
        assertThat(testAlertsTb.getAlertDate()).isEqualTo(UPDATED_ALERT_DATE);
        assertThat(testAlertsTb.getAlertRetries()).isEqualTo(UPDATED_ALERT_RETRIES);
        assertThat(testAlertsTb.getAlertTimestamp()).isEqualTo(UPDATED_ALERT_TIMESTAMP);
        assertThat(testAlertsTb.getAlertPostedBy()).isEqualTo(UPDATED_ALERT_POSTED_BY);
        assertThat(testAlertsTb.getAlertPostedDate()).isEqualTo(UPDATED_ALERT_POSTED_DATE);
        assertThat(testAlertsTb.getAlertInternalErrorcode()).isEqualTo(UPDATED_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsTb.getRawRequest()).isEqualTo(UPDATED_RAW_REQUEST);
        assertThat(testAlertsTb.getRawResponse()).isEqualTo(UPDATED_RAW_RESPONSE);
        assertThat(testAlertsTb.getAlertFreeField1()).isEqualTo(UPDATED_ALERT_FREE_FIELD_1);
        assertThat(testAlertsTb.getAlertFreeField2()).isEqualTo(UPDATED_ALERT_FREE_FIELD_2);
        assertThat(testAlertsTb.getAlertFreeField3()).isEqualTo(UPDATED_ALERT_FREE_FIELD_3);
        assertThat(testAlertsTb.getAlertFreeField4()).isEqualTo(UPDATED_ALERT_FREE_FIELD_4);
        assertThat(testAlertsTb.getAlertFreeField5()).isEqualTo(UPDATED_ALERT_FREE_FIELD_5);
        assertThat(testAlertsTb.getAlertFreeField6()).isEqualTo(UPDATED_ALERT_FREE_FIELD_6);
        assertThat(testAlertsTb.getAlertFreeField7()).isEqualTo(UPDATED_ALERT_FREE_FIELD_7);
        assertThat(testAlertsTb.getAlertFreeField8()).isEqualTo(UPDATED_ALERT_FREE_FIELD_8);
        assertThat(testAlertsTb.getCreatedAt()).isEqualTo(UPDATED_CREATED_AT);
        assertThat(testAlertsTb.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
        assertThat(testAlertsTb.getStatus()).isEqualTo(UPDATED_STATUS);
    }

    @Test
    @Transactional
    void putNonExistingAlertsTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();
        alertsTb.setId(UUID.randomUUID());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAlertsTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, alertsTb.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(alertsTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithIdMismatchAlertsTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();
        alertsTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, UUID.randomUUID())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(alertsTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithMissingIdPathParamAlertsTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();
        alertsTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTbMockMvc
            .perform(put(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsTb)))
            .andExpect(status().isMethodNotAllowed());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void partialUpdateAlertsTbWithPatch() throws Exception {
        // Initialize the database
        alertsTbRepository.saveAndFlush(alertsTb);

        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();

        // Update the alertsTb using partial update
        AlertsTb partialUpdatedAlertsTb = new AlertsTb();
        partialUpdatedAlertsTb.setId(alertsTb.getId());

        partialUpdatedAlertsTb
            .alertType(UPDATED_ALERT_TYPE)
            .alertMessage(UPDATED_ALERT_MESSAGE)
            .alertDate(UPDATED_ALERT_DATE)
            .alertRetries(UPDATED_ALERT_RETRIES)
            .rawRequest(UPDATED_RAW_REQUEST)
            .alertFreeField2(UPDATED_ALERT_FREE_FIELD_2)
            .alertFreeField3(UPDATED_ALERT_FREE_FIELD_3)
            .alertFreeField8(UPDATED_ALERT_FREE_FIELD_8)
            .updatedAt(UPDATED_UPDATED_AT);

        restAlertsTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedAlertsTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedAlertsTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsTb testAlertsTb = alertsTbList.get(alertsTbList.size() - 1);
        assertThat(testAlertsTb.getAlertId()).isEqualTo(DEFAULT_ALERT_ID);
        assertThat(testAlertsTb.getAlertTemId()).isEqualTo(DEFAULT_ALERT_TEM_ID);
        assertThat(testAlertsTb.getAlertType()).isEqualTo(UPDATED_ALERT_TYPE);
        assertThat(testAlertsTb.getAlertStatus()).isEqualTo(DEFAULT_ALERT_STATUS);
        assertThat(testAlertsTb.getAlertMessage()).isEqualTo(UPDATED_ALERT_MESSAGE);
        assertThat(testAlertsTb.getAlertDate()).isEqualTo(UPDATED_ALERT_DATE);
        assertThat(testAlertsTb.getAlertRetries()).isEqualTo(UPDATED_ALERT_RETRIES);
        assertThat(testAlertsTb.getAlertTimestamp()).isEqualTo(DEFAULT_ALERT_TIMESTAMP);
        assertThat(testAlertsTb.getAlertPostedBy()).isEqualTo(DEFAULT_ALERT_POSTED_BY);
        assertThat(testAlertsTb.getAlertPostedDate()).isEqualTo(DEFAULT_ALERT_POSTED_DATE);
        assertThat(testAlertsTb.getAlertInternalErrorcode()).isEqualTo(DEFAULT_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsTb.getRawRequest()).isEqualTo(UPDATED_RAW_REQUEST);
        assertThat(testAlertsTb.getRawResponse()).isEqualTo(DEFAULT_RAW_RESPONSE);
        assertThat(testAlertsTb.getAlertFreeField1()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_1);
        assertThat(testAlertsTb.getAlertFreeField2()).isEqualTo(UPDATED_ALERT_FREE_FIELD_2);
        assertThat(testAlertsTb.getAlertFreeField3()).isEqualTo(UPDATED_ALERT_FREE_FIELD_3);
        assertThat(testAlertsTb.getAlertFreeField4()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_4);
        assertThat(testAlertsTb.getAlertFreeField5()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_5);
        assertThat(testAlertsTb.getAlertFreeField6()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_6);
        assertThat(testAlertsTb.getAlertFreeField7()).isEqualTo(DEFAULT_ALERT_FREE_FIELD_7);
        assertThat(testAlertsTb.getAlertFreeField8()).isEqualTo(UPDATED_ALERT_FREE_FIELD_8);
        assertThat(testAlertsTb.getCreatedAt()).isEqualTo(DEFAULT_CREATED_AT);
        assertThat(testAlertsTb.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
        assertThat(testAlertsTb.getStatus()).isEqualTo(DEFAULT_STATUS);
    }

    @Test
    @Transactional
    void fullUpdateAlertsTbWithPatch() throws Exception {
        // Initialize the database
        alertsTbRepository.saveAndFlush(alertsTb);

        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();

        // Update the alertsTb using partial update
        AlertsTb partialUpdatedAlertsTb = new AlertsTb();
        partialUpdatedAlertsTb.setId(alertsTb.getId());

        partialUpdatedAlertsTb
            .alertId(UPDATED_ALERT_ID)
            .alertTemId(UPDATED_ALERT_TEM_ID)
            .alertType(UPDATED_ALERT_TYPE)
            .alertStatus(UPDATED_ALERT_STATUS)
            .alertMessage(UPDATED_ALERT_MESSAGE)
            .alertDate(UPDATED_ALERT_DATE)
            .alertRetries(UPDATED_ALERT_RETRIES)
            .alertTimestamp(UPDATED_ALERT_TIMESTAMP)
            .alertPostedBy(UPDATED_ALERT_POSTED_BY)
            .alertPostedDate(UPDATED_ALERT_POSTED_DATE)
            .alertInternalErrorcode(UPDATED_ALERT_INTERNAL_ERRORCODE)
            .rawRequest(UPDATED_RAW_REQUEST)
            .rawResponse(UPDATED_RAW_RESPONSE)
            .alertFreeField1(UPDATED_ALERT_FREE_FIELD_1)
            .alertFreeField2(UPDATED_ALERT_FREE_FIELD_2)
            .alertFreeField3(UPDATED_ALERT_FREE_FIELD_3)
            .alertFreeField4(UPDATED_ALERT_FREE_FIELD_4)
            .alertFreeField5(UPDATED_ALERT_FREE_FIELD_5)
            .alertFreeField6(UPDATED_ALERT_FREE_FIELD_6)
            .alertFreeField7(UPDATED_ALERT_FREE_FIELD_7)
            .alertFreeField8(UPDATED_ALERT_FREE_FIELD_8)
            .createdAt(UPDATED_CREATED_AT)
            .updatedAt(UPDATED_UPDATED_AT)
            .status(UPDATED_STATUS);

        restAlertsTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedAlertsTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedAlertsTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsTb testAlertsTb = alertsTbList.get(alertsTbList.size() - 1);
        assertThat(testAlertsTb.getAlertId()).isEqualTo(UPDATED_ALERT_ID);
        assertThat(testAlertsTb.getAlertTemId()).isEqualTo(UPDATED_ALERT_TEM_ID);
        assertThat(testAlertsTb.getAlertType()).isEqualTo(UPDATED_ALERT_TYPE);
        assertThat(testAlertsTb.getAlertStatus()).isEqualTo(UPDATED_ALERT_STATUS);
        assertThat(testAlertsTb.getAlertMessage()).isEqualTo(UPDATED_ALERT_MESSAGE);
        assertThat(testAlertsTb.getAlertDate()).isEqualTo(UPDATED_ALERT_DATE);
        assertThat(testAlertsTb.getAlertRetries()).isEqualTo(UPDATED_ALERT_RETRIES);
        assertThat(testAlertsTb.getAlertTimestamp()).isEqualTo(UPDATED_ALERT_TIMESTAMP);
        assertThat(testAlertsTb.getAlertPostedBy()).isEqualTo(UPDATED_ALERT_POSTED_BY);
        assertThat(testAlertsTb.getAlertPostedDate()).isEqualTo(UPDATED_ALERT_POSTED_DATE);
        assertThat(testAlertsTb.getAlertInternalErrorcode()).isEqualTo(UPDATED_ALERT_INTERNAL_ERRORCODE);
        assertThat(testAlertsTb.getRawRequest()).isEqualTo(UPDATED_RAW_REQUEST);
        assertThat(testAlertsTb.getRawResponse()).isEqualTo(UPDATED_RAW_RESPONSE);
        assertThat(testAlertsTb.getAlertFreeField1()).isEqualTo(UPDATED_ALERT_FREE_FIELD_1);
        assertThat(testAlertsTb.getAlertFreeField2()).isEqualTo(UPDATED_ALERT_FREE_FIELD_2);
        assertThat(testAlertsTb.getAlertFreeField3()).isEqualTo(UPDATED_ALERT_FREE_FIELD_3);
        assertThat(testAlertsTb.getAlertFreeField4()).isEqualTo(UPDATED_ALERT_FREE_FIELD_4);
        assertThat(testAlertsTb.getAlertFreeField5()).isEqualTo(UPDATED_ALERT_FREE_FIELD_5);
        assertThat(testAlertsTb.getAlertFreeField6()).isEqualTo(UPDATED_ALERT_FREE_FIELD_6);
        assertThat(testAlertsTb.getAlertFreeField7()).isEqualTo(UPDATED_ALERT_FREE_FIELD_7);
        assertThat(testAlertsTb.getAlertFreeField8()).isEqualTo(UPDATED_ALERT_FREE_FIELD_8);
        assertThat(testAlertsTb.getCreatedAt()).isEqualTo(UPDATED_CREATED_AT);
        assertThat(testAlertsTb.getUpdatedAt()).isEqualTo(UPDATED_UPDATED_AT);
        assertThat(testAlertsTb.getStatus()).isEqualTo(UPDATED_STATUS);
    }

    @Test
    @Transactional
    void patchNonExistingAlertsTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();
        alertsTb.setId(UUID.randomUUID());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAlertsTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, alertsTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithIdMismatchAlertsTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();
        alertsTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, UUID.randomUUID())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithMissingIdPathParamAlertsTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTbRepository.findAll().size();
        alertsTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTbMockMvc
            .perform(patch(ENTITY_API_URL).contentType("application/merge-patch+json").content(TestUtil.convertObjectToJsonBytes(alertsTb)))
            .andExpect(status().isMethodNotAllowed());

        // Validate the AlertsTb in the database
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void deleteAlertsTb() throws Exception {
        // Initialize the database
        alertsTbRepository.saveAndFlush(alertsTb);

        int databaseSizeBeforeDelete = alertsTbRepository.findAll().size();

        // Delete the alertsTb
        restAlertsTbMockMvc
            .perform(delete(ENTITY_API_URL_ID, alertsTb.getId().toString()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<AlertsTb> alertsTbList = alertsTbRepository.findAll();
        assertThat(alertsTbList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
*/
