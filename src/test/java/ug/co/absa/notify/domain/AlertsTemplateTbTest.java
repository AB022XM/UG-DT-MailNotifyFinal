package ug.co.absa.notify.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import ug.co.absa.notify.web.rest.TestUtil;

class AlertsTemplateTbTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AlertsTemplateTb.class);
        AlertsTemplateTb alertsTemplateTb1 = new AlertsTemplateTb();
        alertsTemplateTb1.setId(UUID.randomUUID());
        AlertsTemplateTb alertsTemplateTb2 = new AlertsTemplateTb();
        alertsTemplateTb2.setId(alertsTemplateTb1.getId());
        assertThat(alertsTemplateTb1).isEqualTo(alertsTemplateTb2);
        alertsTemplateTb2.setId(UUID.randomUUID());
        assertThat(alertsTemplateTb1).isNotEqualTo(alertsTemplateTb2);
        alertsTemplateTb1.setId(null);
        assertThat(alertsTemplateTb1).isNotEqualTo(alertsTemplateTb2);
    }
}
