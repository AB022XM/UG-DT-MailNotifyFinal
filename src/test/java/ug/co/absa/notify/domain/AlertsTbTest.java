package ug.co.absa.notify.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import ug.co.absa.notify.web.rest.TestUtil;

class AlertsTbTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AlertsTb.class);
        AlertsTb alertsTb1 = new AlertsTb();
        alertsTb1.setId(UUID.randomUUID());
        AlertsTb alertsTb2 = new AlertsTb();
        alertsTb2.setId(alertsTb1.getId());
        assertThat(alertsTb1).isEqualTo(alertsTb2);
        alertsTb2.setId(UUID.randomUUID());
        assertThat(alertsTb1).isNotEqualTo(alertsTb2);
        alertsTb1.setId(null);
        assertThat(alertsTb1).isNotEqualTo(alertsTb2);
    }
}
