package ug.co.absa.notify.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import ug.co.absa.notify.web.rest.TestUtil;

class ChannelTxnTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ChannelTxn.class);
        ChannelTxn channelTxn1 = new ChannelTxn();
        channelTxn1.setId(1L);
        ChannelTxn channelTxn2 = new ChannelTxn();
        channelTxn2.setId(channelTxn1.getId());
        assertThat(channelTxn1).isEqualTo(channelTxn2);
        channelTxn2.setId(2L);
        assertThat(channelTxn1).isNotEqualTo(channelTxn2);
        channelTxn1.setId(null);
        assertThat(channelTxn1).isNotEqualTo(channelTxn2);
    }
}
