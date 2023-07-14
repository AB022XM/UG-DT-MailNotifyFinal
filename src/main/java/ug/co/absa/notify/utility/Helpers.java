package ug.co.absa.notify.utility;


import ug.co.absa.notify.domain.ChannelTxn;

public class Helpers {
    public static String createEmailBody(ChannelTxn channelTxn) {
        return"This is the email Body";
    }

    public static String createEmailSubject(ChannelTxn channelTxn) {
        return"This is a PROD Test";


    }

}
