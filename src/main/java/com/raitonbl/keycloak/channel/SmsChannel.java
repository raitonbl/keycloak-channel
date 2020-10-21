package com.raitonbl.keycloak.channel;

import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.Provider;

/**
 * Channel that enables Keycloak to send SMS message
 */
public interface SmsChannel extends Provider {

    /**
     * Sends one message to one specific destination
     *
     * @param destination - The msisdn which is required to receive the message, this number must be formatted as an Internation number
     * @param message     - The content that the message contains
     */
    void send( String destination, String message);

    /**
     * Sends one message to one specific destination
     *
     * @param destination - An array of msisdn which are required to receive the message, this number must be formatted as an Internation number
     * @param message     - The content that the message contains
     */
    void send(String[] destination, String message);

}
