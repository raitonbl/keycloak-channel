package com.raitonbl.keycloak.channel;

public class SmsChannelException extends RuntimeException {

    public SmsChannelException() {
    }

    public SmsChannelException(String message) {
        super(message);
    }

    public SmsChannelException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmsChannelException(Throwable cause) {
        super(cause);
    }

}
