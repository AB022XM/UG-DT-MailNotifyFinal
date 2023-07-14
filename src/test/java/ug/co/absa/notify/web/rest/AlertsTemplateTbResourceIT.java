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
import ug.co.absa.notify.domain.AlertsTemplateTb;
import ug.co.absa.notify.repository.AlertsTemplateTbRepository;

*/
/**
 * Integration tests for the {@link AlertsTemplateTbResource} REST controller.
 *//*

@IntegrationTest
@AutoConfigureMockMvc
@WithMockUser
class AlertsTemplateTbResourceIT {

    private static final String DEFAULT_ALERT_TEMPLATE_ID = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEMPLATE_ID = "BBBBBBBBBB";

    private static final String DEFAULT_ALERTRODUCT_ID = "AAAAAAAAAA";
    private static final String UPDATED_ALERTRODUCT_ID = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TEMPLATENAME = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEMPLATENAME = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TEMPLATE_DETAILS = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEMPLATE_DETAILS = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TEMPLATE_STATUS = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEMPLATE_STATUS = "BBBBBBBBBB";

    private static final Integer DEFAULT_ALERT_TEMPLATERETRIES = 1;
    private static final Integer UPDATED_ALERT_TEMPLATERETRIES = 2;

    private static final ZonedDateTime DEFAULT_ALERT_TEMPLATE_TIMESTAMP = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_ALERT_TEMPLATE_TIMESTAMP = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final String DEFAULT_ALERT_TEMPLATEPOSTEDBY = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEMPLATEPOSTEDBY = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TEMPLATEPOSTED_DATE = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TEMPLATEPOSTED_DATE = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_1 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_1 = "BBBBBBBBBB";

    private static final byte[] DEFAULT_ALERT_TMP_FREE_FIELD_2 = TestUtil.createByteArray(1, "0");
    private static final byte[] UPDATED_ALERT_TMP_FREE_FIELD_2 = TestUtil.createByteArray(1, "1");
    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE = "image/jpg";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE = "image/png";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_3 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_3 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_4 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_4 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_5 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_5 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_6 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_6 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_7 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_7 = "BBBBBBBBBB";

    private static final String DEFAULT_ALERT_TMP_FREE_FIELD_8 = "AAAAAAAAAA";
    private static final String UPDATED_ALERT_TMP_FREE_FIELD_8 = "BBBBBBBBBB";

    private static final ZonedDateTime DEFAULT_TIMESTAMP = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_TIMESTAMP = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);

    private static final Boolean DEFAULT_IS_ACTIVE = false;
    private static final Boolean UPDATED_IS_ACTIVE = true;

    private static final String ENTITY_API_URL = "/api/alerts-template-tbs";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    @Autowired
    private AlertsTemplateTbRepository alertsTemplateTbRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restAlertsTemplateTbMockMvc;

    private AlertsTemplateTb alertsTemplateTb;

    */
/**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*

    public static AlertsTemplateTb createEntity(EntityManager em) {
        AlertsTemplateTb alertsTemplateTb = new AlertsTemplateTb()
            .alertTemplateId(DEFAULT_ALERT_TEMPLATE_ID)
            .alertroductId(DEFAULT_ALERTRODUCT_ID)
            .alertTemplatename(DEFAULT_ALERT_TEMPLATENAME)
            .alertTemplateDetails(DEFAULT_ALERT_TEMPLATE_DETAILS)
            .alertTemplateStatus(DEFAULT_ALERT_TEMPLATE_STATUS)
            .alertTemplateretries(DEFAULT_ALERT_TEMPLATERETRIES)
            .alertTemplateTimestamp(DEFAULT_ALERT_TEMPLATE_TIMESTAMP)
            .alertTemplatepostedby(DEFAULT_ALERT_TEMPLATEPOSTEDBY)
            .alertTemplatepostedDate(DEFAULT_ALERT_TEMPLATEPOSTED_DATE)
            .alertTmpFreeField1(DEFAULT_ALERT_TMP_FREE_FIELD_1)
            .alertTmpFreeField2(DEFAULT_ALERT_TMP_FREE_FIELD_2)
            .alertTmpFreeField2ContentType(DEFAULT_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE)
            .alertTmpFreeField3(DEFAULT_ALERT_TMP_FREE_FIELD_3)
            .alertTmpFreeField4(DEFAULT_ALERT_TMP_FREE_FIELD_4)
            .alertTmpFreeField5(DEFAULT_ALERT_TMP_FREE_FIELD_5)
            .alertTmpFreeField6(DEFAULT_ALERT_TMP_FREE_FIELD_6)
            .alertTmpFreeField7(DEFAULT_ALERT_TMP_FREE_FIELD_7)
            .alertTmpFreeField8(DEFAULT_ALERT_TMP_FREE_FIELD_8)
            .timestamp(DEFAULT_TIMESTAMP)
            .isActive(DEFAULT_IS_ACTIVE);
        return alertsTemplateTb;
    }

    */
/**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     *//*

    public static AlertsTemplateTb createUpdatedEntity(EntityManager em) {
        AlertsTemplateTb alertsTemplateTb = new AlertsTemplateTb()
            .alertTemplateId(UPDATED_ALERT_TEMPLATE_ID)
            .alertroductId(UPDATED_ALERTRODUCT_ID)
            .alertTemplatename(UPDATED_ALERT_TEMPLATENAME)
            .alertTemplateDetails(UPDATED_ALERT_TEMPLATE_DETAILS)
            .alertTemplateStatus(UPDATED_ALERT_TEMPLATE_STATUS)
            .alertTemplateretries(UPDATED_ALERT_TEMPLATERETRIES)
            .alertTemplateTimestamp(UPDATED_ALERT_TEMPLATE_TIMESTAMP)
            .alertTemplatepostedby(UPDATED_ALERT_TEMPLATEPOSTEDBY)
            .alertTemplatepostedDate(UPDATED_ALERT_TEMPLATEPOSTED_DATE)
            .alertTmpFreeField1(UPDATED_ALERT_TMP_FREE_FIELD_1)
            .alertTmpFreeField2(UPDATED_ALERT_TMP_FREE_FIELD_2)
            .alertTmpFreeField2ContentType(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE)
            .alertTmpFreeField3(UPDATED_ALERT_TMP_FREE_FIELD_3)
            .alertTmpFreeField4(UPDATED_ALERT_TMP_FREE_FIELD_4)
            .alertTmpFreeField5(UPDATED_ALERT_TMP_FREE_FIELD_5)
            .alertTmpFreeField6(UPDATED_ALERT_TMP_FREE_FIELD_6)
            .alertTmpFreeField7(UPDATED_ALERT_TMP_FREE_FIELD_7)
            .alertTmpFreeField8(UPDATED_ALERT_TMP_FREE_FIELD_8)
            .timestamp(UPDATED_TIMESTAMP)
            .isActive(UPDATED_IS_ACTIVE);
        return alertsTemplateTb;
    }

    @BeforeEach
    public void initTest() {
        alertsTemplateTb = createEntity(em);
    }

    @Test
    @Transactional
    void createAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeCreate = alertsTemplateTbRepository.findAll().size();
        // Create the AlertsTemplateTb
        restAlertsTemplateTbMockMvc
            .perform(
                post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isCreated());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeCreate + 1);
        AlertsTemplateTb testAlertsTemplateTb = alertsTemplateTbList.get(alertsTemplateTbList.size() - 1);
        assertThat(testAlertsTemplateTb.getAlertTemplateId()).isEqualTo(DEFAULT_ALERT_TEMPLATE_ID);
        assertThat(testAlertsTemplateTb.getAlertroductId()).isEqualTo(DEFAULT_ALERTRODUCT_ID);
        assertThat(testAlertsTemplateTb.getAlertTemplatename()).isEqualTo(DEFAULT_ALERT_TEMPLATENAME);
        assertThat(testAlertsTemplateTb.getAlertTemplateDetails()).isEqualTo(DEFAULT_ALERT_TEMPLATE_DETAILS);
        assertThat(testAlertsTemplateTb.getAlertTemplateStatus()).isEqualTo(DEFAULT_ALERT_TEMPLATE_STATUS);
        assertThat(testAlertsTemplateTb.getAlertTemplateretries()).isEqualTo(DEFAULT_ALERT_TEMPLATERETRIES);
        assertThat(testAlertsTemplateTb.getAlertTemplateTimestamp()).isEqualTo(DEFAULT_ALERT_TEMPLATE_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedby()).isEqualTo(DEFAULT_ALERT_TEMPLATEPOSTEDBY);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedDate()).isEqualTo(DEFAULT_ALERT_TEMPLATEPOSTED_DATE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField1()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_1);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_2);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2ContentType()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField3()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_3);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField4()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_4);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField5()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_5);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField6()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_6);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField7()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_7);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField8()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_8);
        assertThat(testAlertsTemplateTb.getTimestamp()).isEqualTo(DEFAULT_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getIsActive()).isEqualTo(DEFAULT_IS_ACTIVE);
    }

    @Test
    @Transactional
    void createAlertsTemplateTbWithExistingId() throws Exception {
        // Create the AlertsTemplateTb with an existing ID
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        int databaseSizeBeforeCreate = alertsTemplateTbRepository.findAll().size();

        // An entity with an existing ID cannot be created, so this API call must fail
        restAlertsTemplateTbMockMvc
            .perform(
                post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    void getAllAlertsTemplateTbs() throws Exception {
        // Initialize the database
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        // Get all the alertsTemplateTbList
        restAlertsTemplateTbMockMvc
            .perform(get(ENTITY_API_URL + "?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(alertsTemplateTb.getId().toString())))
            .andExpect(jsonPath("$.[*].alertTemplateId").value(hasItem(DEFAULT_ALERT_TEMPLATE_ID)))
            .andExpect(jsonPath("$.[*].alertroductId").value(hasItem(DEFAULT_ALERTRODUCT_ID)))
            .andExpect(jsonPath("$.[*].alertTemplatename").value(hasItem(DEFAULT_ALERT_TEMPLATENAME)))
            .andExpect(jsonPath("$.[*].alertTemplateDetails").value(hasItem(DEFAULT_ALERT_TEMPLATE_DETAILS.toString())))
            .andExpect(jsonPath("$.[*].alertTemplateStatus").value(hasItem(DEFAULT_ALERT_TEMPLATE_STATUS)))
            .andExpect(jsonPath("$.[*].alertTemplateretries").value(hasItem(DEFAULT_ALERT_TEMPLATERETRIES)))
            .andExpect(jsonPath("$.[*].alertTemplateTimestamp").value(hasItem(sameInstant(DEFAULT_ALERT_TEMPLATE_TIMESTAMP))))
            .andExpect(jsonPath("$.[*].alertTemplatepostedby").value(hasItem(DEFAULT_ALERT_TEMPLATEPOSTEDBY)))
            .andExpect(jsonPath("$.[*].alertTemplatepostedDate").value(hasItem(DEFAULT_ALERT_TEMPLATEPOSTED_DATE)))
            .andExpect(jsonPath("$.[*].alertTmpFreeField1").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_1.toString())))
            .andExpect(jsonPath("$.[*].alertTmpFreeField2ContentType").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE)))
           // .andExpect(jsonPath("$.[*].alertTmpFreeField2").value(hasItem(Base64Utils.encodeToString(DEFAULT_ALERT_TMP_FREE_FIELD_2))))
            .andExpect(jsonPath("$.[*].alertTmpFreeField3").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_3)))
            .andExpect(jsonPath("$.[*].alertTmpFreeField4").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_4)))
            .andExpect(jsonPath("$.[*].alertTmpFreeField5").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_5)))
            .andExpect(jsonPath("$.[*].alertTmpFreeField6").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_6)))
            .andExpect(jsonPath("$.[*].alertTmpFreeField7").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_7)))
            .andExpect(jsonPath("$.[*].alertTmpFreeField8").value(hasItem(DEFAULT_ALERT_TMP_FREE_FIELD_8)))
            .andExpect(jsonPath("$.[*].timestamp").value(hasItem(sameInstant(DEFAULT_TIMESTAMP))))
            .andExpect(jsonPath("$.[*].isActive").value(hasItem(DEFAULT_IS_ACTIVE.booleanValue())));
    }

    @Test
    @Transactional
    void getAlertsTemplateTb() throws Exception {
        // Initialize the database
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        // Get the alertsTemplateTb
        restAlertsTemplateTbMockMvc
            .perform(get(ENTITY_API_URL_ID, alertsTemplateTb.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(alertsTemplateTb.getId().toString()))
            .andExpect(jsonPath("$.alertTemplateId").value(DEFAULT_ALERT_TEMPLATE_ID))
            .andExpect(jsonPath("$.alertroductId").value(DEFAULT_ALERTRODUCT_ID))
            .andExpect(jsonPath("$.alertTemplatename").value(DEFAULT_ALERT_TEMPLATENAME))
            .andExpect(jsonPath("$.alertTemplateDetails").value(DEFAULT_ALERT_TEMPLATE_DETAILS.toString()))
            .andExpect(jsonPath("$.alertTemplateStatus").value(DEFAULT_ALERT_TEMPLATE_STATUS))
            .andExpect(jsonPath("$.alertTemplateretries").value(DEFAULT_ALERT_TEMPLATERETRIES))
            .andExpect(jsonPath("$.alertTemplateTimestamp").value(sameInstant(DEFAULT_ALERT_TEMPLATE_TIMESTAMP)))
            .andExpect(jsonPath("$.alertTemplatepostedby").value(DEFAULT_ALERT_TEMPLATEPOSTEDBY))
            .andExpect(jsonPath("$.alertTemplatepostedDate").value(DEFAULT_ALERT_TEMPLATEPOSTED_DATE))
            .andExpect(jsonPath("$.alertTmpFreeField1").value(DEFAULT_ALERT_TMP_FREE_FIELD_1.toString()))
            .andExpect(jsonPath("$.alertTmpFreeField2ContentType").value(DEFAULT_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE))
          //  .andExpect(jsonPath("$.alertTmpFreeField2").value(Base64Utils.encodeToString(DEFAULT_ALERT_TMP_FREE_FIELD_2)))
            .andExpect(jsonPath("$.alertTmpFreeField3").value(DEFAULT_ALERT_TMP_FREE_FIELD_3))
            .andExpect(jsonPath("$.alertTmpFreeField4").value(DEFAULT_ALERT_TMP_FREE_FIELD_4))
            .andExpect(jsonPath("$.alertTmpFreeField5").value(DEFAULT_ALERT_TMP_FREE_FIELD_5))
            .andExpect(jsonPath("$.alertTmpFreeField6").value(DEFAULT_ALERT_TMP_FREE_FIELD_6))
            .andExpect(jsonPath("$.alertTmpFreeField7").value(DEFAULT_ALERT_TMP_FREE_FIELD_7))
            .andExpect(jsonPath("$.alertTmpFreeField8").value(DEFAULT_ALERT_TMP_FREE_FIELD_8))
            .andExpect(jsonPath("$.timestamp").value(sameInstant(DEFAULT_TIMESTAMP)))
            .andExpect(jsonPath("$.isActive").value(DEFAULT_IS_ACTIVE.booleanValue()));
    }

    @Test
    @Transactional
    void getNonExistingAlertsTemplateTb() throws Exception {
        // Get the alertsTemplateTb
        restAlertsTemplateTbMockMvc.perform(get(ENTITY_API_URL_ID, UUID.randomUUID().toString())).andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    void putExistingAlertsTemplateTb() throws Exception {
        // Initialize the database
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();

        // Update the alertsTemplateTb
        AlertsTemplateTb updatedAlertsTemplateTb = alertsTemplateTbRepository.findById(alertsTemplateTb.getId()).get();
        // Disconnect from session so that the updates on updatedAlertsTemplateTb are not directly saved in db
        em.detach(updatedAlertsTemplateTb);
        updatedAlertsTemplateTb
            .alertTemplateId(UPDATED_ALERT_TEMPLATE_ID)
            .alertroductId(UPDATED_ALERTRODUCT_ID)
            .alertTemplatename(UPDATED_ALERT_TEMPLATENAME)
            .alertTemplateDetails(UPDATED_ALERT_TEMPLATE_DETAILS)
            .alertTemplateStatus(UPDATED_ALERT_TEMPLATE_STATUS)
            .alertTemplateretries(UPDATED_ALERT_TEMPLATERETRIES)
            .alertTemplateTimestamp(UPDATED_ALERT_TEMPLATE_TIMESTAMP)
            .alertTemplatepostedby(UPDATED_ALERT_TEMPLATEPOSTEDBY)
            .alertTemplatepostedDate(UPDATED_ALERT_TEMPLATEPOSTED_DATE)
            .alertTmpFreeField1(UPDATED_ALERT_TMP_FREE_FIELD_1)
            .alertTmpFreeField2(UPDATED_ALERT_TMP_FREE_FIELD_2)
            .alertTmpFreeField2ContentType(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE)
            .alertTmpFreeField3(UPDATED_ALERT_TMP_FREE_FIELD_3)
            .alertTmpFreeField4(UPDATED_ALERT_TMP_FREE_FIELD_4)
            .alertTmpFreeField5(UPDATED_ALERT_TMP_FREE_FIELD_5)
            .alertTmpFreeField6(UPDATED_ALERT_TMP_FREE_FIELD_6)
            .alertTmpFreeField7(UPDATED_ALERT_TMP_FREE_FIELD_7)
            .alertTmpFreeField8(UPDATED_ALERT_TMP_FREE_FIELD_8)
            .timestamp(UPDATED_TIMESTAMP)
            .isActive(UPDATED_IS_ACTIVE);

        restAlertsTemplateTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, updatedAlertsTemplateTb.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(updatedAlertsTemplateTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsTemplateTb testAlertsTemplateTb = alertsTemplateTbList.get(alertsTemplateTbList.size() - 1);
        assertThat(testAlertsTemplateTb.getAlertTemplateId()).isEqualTo(UPDATED_ALERT_TEMPLATE_ID);
        assertThat(testAlertsTemplateTb.getAlertroductId()).isEqualTo(UPDATED_ALERTRODUCT_ID);
        assertThat(testAlertsTemplateTb.getAlertTemplatename()).isEqualTo(UPDATED_ALERT_TEMPLATENAME);
        assertThat(testAlertsTemplateTb.getAlertTemplateDetails()).isEqualTo(UPDATED_ALERT_TEMPLATE_DETAILS);
        assertThat(testAlertsTemplateTb.getAlertTemplateStatus()).isEqualTo(UPDATED_ALERT_TEMPLATE_STATUS);
        assertThat(testAlertsTemplateTb.getAlertTemplateretries()).isEqualTo(UPDATED_ALERT_TEMPLATERETRIES);
        assertThat(testAlertsTemplateTb.getAlertTemplateTimestamp()).isEqualTo(UPDATED_ALERT_TEMPLATE_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedby()).isEqualTo(UPDATED_ALERT_TEMPLATEPOSTEDBY);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedDate()).isEqualTo(UPDATED_ALERT_TEMPLATEPOSTED_DATE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField1()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_1);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_2);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2ContentType()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField3()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_3);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField4()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_4);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField5()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_5);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField6()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_6);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField7()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_7);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField8()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_8);
        assertThat(testAlertsTemplateTb.getTimestamp()).isEqualTo(UPDATED_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getIsActive()).isEqualTo(UPDATED_IS_ACTIVE);
    }

    @Test
    @Transactional
    void putNonExistingAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();
        alertsTemplateTb.setId(UUID.randomUUID());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAlertsTemplateTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, alertsTemplateTb.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithIdMismatchAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();
        alertsTemplateTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTemplateTbMockMvc
            .perform(
                put(ENTITY_API_URL_ID, UUID.randomUUID())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithMissingIdPathParamAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();
        alertsTemplateTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTemplateTbMockMvc
            .perform(
                put(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isMethodNotAllowed());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void partialUpdateAlertsTemplateTbWithPatch() throws Exception {
        // Initialize the database
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();

        // Update the alertsTemplateTb using partial update
        AlertsTemplateTb partialUpdatedAlertsTemplateTb = new AlertsTemplateTb();
        partialUpdatedAlertsTemplateTb.setId(alertsTemplateTb.getId());

        partialUpdatedAlertsTemplateTb
            .alertTemplateId(UPDATED_ALERT_TEMPLATE_ID)
            .alertTemplatename(UPDATED_ALERT_TEMPLATENAME)
            .alertTemplateStatus(UPDATED_ALERT_TEMPLATE_STATUS)
            .alertTemplatepostedby(UPDATED_ALERT_TEMPLATEPOSTEDBY)
            .alertTemplatepostedDate(UPDATED_ALERT_TEMPLATEPOSTED_DATE)
            .alertTmpFreeField1(UPDATED_ALERT_TMP_FREE_FIELD_1)
            .alertTmpFreeField2(UPDATED_ALERT_TMP_FREE_FIELD_2)
            .alertTmpFreeField2ContentType(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE)
            .alertTmpFreeField6(UPDATED_ALERT_TMP_FREE_FIELD_6);

        restAlertsTemplateTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedAlertsTemplateTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedAlertsTemplateTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsTemplateTb testAlertsTemplateTb = alertsTemplateTbList.get(alertsTemplateTbList.size() - 1);
        assertThat(testAlertsTemplateTb.getAlertTemplateId()).isEqualTo(UPDATED_ALERT_TEMPLATE_ID);
        assertThat(testAlertsTemplateTb.getAlertroductId()).isEqualTo(DEFAULT_ALERTRODUCT_ID);
        assertThat(testAlertsTemplateTb.getAlertTemplatename()).isEqualTo(UPDATED_ALERT_TEMPLATENAME);
        assertThat(testAlertsTemplateTb.getAlertTemplateDetails()).isEqualTo(DEFAULT_ALERT_TEMPLATE_DETAILS);
        assertThat(testAlertsTemplateTb.getAlertTemplateStatus()).isEqualTo(UPDATED_ALERT_TEMPLATE_STATUS);
        assertThat(testAlertsTemplateTb.getAlertTemplateretries()).isEqualTo(DEFAULT_ALERT_TEMPLATERETRIES);
        assertThat(testAlertsTemplateTb.getAlertTemplateTimestamp()).isEqualTo(DEFAULT_ALERT_TEMPLATE_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedby()).isEqualTo(UPDATED_ALERT_TEMPLATEPOSTEDBY);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedDate()).isEqualTo(UPDATED_ALERT_TEMPLATEPOSTED_DATE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField1()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_1);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_2);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2ContentType()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField3()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_3);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField4()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_4);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField5()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_5);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField6()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_6);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField7()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_7);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField8()).isEqualTo(DEFAULT_ALERT_TMP_FREE_FIELD_8);
        assertThat(testAlertsTemplateTb.getTimestamp()).isEqualTo(DEFAULT_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getIsActive()).isEqualTo(DEFAULT_IS_ACTIVE);
    }

    @Test
    @Transactional
    void fullUpdateAlertsTemplateTbWithPatch() throws Exception {
        // Initialize the database
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();

        // Update the alertsTemplateTb using partial update
        AlertsTemplateTb partialUpdatedAlertsTemplateTb = new AlertsTemplateTb();
        partialUpdatedAlertsTemplateTb.setId(alertsTemplateTb.getId());

        partialUpdatedAlertsTemplateTb
            .alertTemplateId(UPDATED_ALERT_TEMPLATE_ID)
            .alertroductId(UPDATED_ALERTRODUCT_ID)
            .alertTemplatename(UPDATED_ALERT_TEMPLATENAME)
            .alertTemplateDetails(UPDATED_ALERT_TEMPLATE_DETAILS)
            .alertTemplateStatus(UPDATED_ALERT_TEMPLATE_STATUS)
            .alertTemplateretries(UPDATED_ALERT_TEMPLATERETRIES)
            .alertTemplateTimestamp(UPDATED_ALERT_TEMPLATE_TIMESTAMP)
            .alertTemplatepostedby(UPDATED_ALERT_TEMPLATEPOSTEDBY)
            .alertTemplatepostedDate(UPDATED_ALERT_TEMPLATEPOSTED_DATE)
            .alertTmpFreeField1(UPDATED_ALERT_TMP_FREE_FIELD_1)
            .alertTmpFreeField2(UPDATED_ALERT_TMP_FREE_FIELD_2)
            .alertTmpFreeField2ContentType(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE)
            .alertTmpFreeField3(UPDATED_ALERT_TMP_FREE_FIELD_3)
            .alertTmpFreeField4(UPDATED_ALERT_TMP_FREE_FIELD_4)
            .alertTmpFreeField5(UPDATED_ALERT_TMP_FREE_FIELD_5)
            .alertTmpFreeField6(UPDATED_ALERT_TMP_FREE_FIELD_6)
            .alertTmpFreeField7(UPDATED_ALERT_TMP_FREE_FIELD_7)
            .alertTmpFreeField8(UPDATED_ALERT_TMP_FREE_FIELD_8)
            .timestamp(UPDATED_TIMESTAMP)
            .isActive(UPDATED_IS_ACTIVE);

        restAlertsTemplateTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedAlertsTemplateTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedAlertsTemplateTb))
            )
            .andExpect(status().isOk());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
        AlertsTemplateTb testAlertsTemplateTb = alertsTemplateTbList.get(alertsTemplateTbList.size() - 1);
        assertThat(testAlertsTemplateTb.getAlertTemplateId()).isEqualTo(UPDATED_ALERT_TEMPLATE_ID);
        assertThat(testAlertsTemplateTb.getAlertroductId()).isEqualTo(UPDATED_ALERTRODUCT_ID);
        assertThat(testAlertsTemplateTb.getAlertTemplatename()).isEqualTo(UPDATED_ALERT_TEMPLATENAME);
        assertThat(testAlertsTemplateTb.getAlertTemplateDetails()).isEqualTo(UPDATED_ALERT_TEMPLATE_DETAILS);
        assertThat(testAlertsTemplateTb.getAlertTemplateStatus()).isEqualTo(UPDATED_ALERT_TEMPLATE_STATUS);
        assertThat(testAlertsTemplateTb.getAlertTemplateretries()).isEqualTo(UPDATED_ALERT_TEMPLATERETRIES);
        assertThat(testAlertsTemplateTb.getAlertTemplateTimestamp()).isEqualTo(UPDATED_ALERT_TEMPLATE_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedby()).isEqualTo(UPDATED_ALERT_TEMPLATEPOSTEDBY);
        assertThat(testAlertsTemplateTb.getAlertTemplatepostedDate()).isEqualTo(UPDATED_ALERT_TEMPLATEPOSTED_DATE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField1()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_1);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_2);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField2ContentType()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_2_CONTENT_TYPE);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField3()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_3);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField4()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_4);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField5()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_5);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField6()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_6);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField7()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_7);
        assertThat(testAlertsTemplateTb.getAlertTmpFreeField8()).isEqualTo(UPDATED_ALERT_TMP_FREE_FIELD_8);
        assertThat(testAlertsTemplateTb.getTimestamp()).isEqualTo(UPDATED_TIMESTAMP);
        assertThat(testAlertsTemplateTb.getIsActive()).isEqualTo(UPDATED_IS_ACTIVE);
    }

    @Test
    @Transactional
    void patchNonExistingAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();
        alertsTemplateTb.setId(UUID.randomUUID());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAlertsTemplateTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, alertsTemplateTb.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithIdMismatchAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();
        alertsTemplateTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTemplateTbMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, UUID.randomUUID())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isBadRequest());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithMissingIdPathParamAlertsTemplateTb() throws Exception {
        int databaseSizeBeforeUpdate = alertsTemplateTbRepository.findAll().size();
        alertsTemplateTb.setId(UUID.randomUUID());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restAlertsTemplateTbMockMvc
            .perform(
                patch(ENTITY_API_URL)
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(alertsTemplateTb))
            )
            .andExpect(status().isMethodNotAllowed());

        // Validate the AlertsTemplateTb in the database
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void deleteAlertsTemplateTb() throws Exception {
        // Initialize the database
        alertsTemplateTbRepository.saveAndFlush(alertsTemplateTb);

        int databaseSizeBeforeDelete = alertsTemplateTbRepository.findAll().size();

        // Delete the alertsTemplateTb
        restAlertsTemplateTbMockMvc
            .perform(delete(ENTITY_API_URL_ID, alertsTemplateTb.getId().toString()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<AlertsTemplateTb> alertsTemplateTbList = alertsTemplateTbRepository.findAll();
        assertThat(alertsTemplateTbList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
*/
