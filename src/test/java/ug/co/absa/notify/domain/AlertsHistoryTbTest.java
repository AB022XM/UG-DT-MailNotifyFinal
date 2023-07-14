package ug.co.absa.notify.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import ug.co.absa.notify.web.rest.TestUtil;

class AlertsHistoryTbTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AlertsHistoryTb.class);
        AlertsHistoryTb alertsHistoryTb1 = new AlertsHistoryTb();
        alertsHistoryTb1.setId(1L);
        AlertsHistoryTb alertsHistoryTb2 = new AlertsHistoryTb();
        alertsHistoryTb2.setId(alertsHistoryTb1.getId());
        assertThat(alertsHistoryTb1).isEqualTo(alertsHistoryTb2);
        alertsHistoryTb2.setId(2L);
        assertThat(alertsHistoryTb1).isNotEqualTo(alertsHistoryTb2);
        alertsHistoryTb1.setId(null);
        assertThat(alertsHistoryTb1).isNotEqualTo(alertsHistoryTb2);
    }
}
