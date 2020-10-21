package com.raitonbl.keycloak.channel;

import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class SmsChannelSpi implements Spi {

    @Override
    public boolean isInternal() {
        return Boolean.FALSE;
    }

    @Override
    public String getName() {
        return "sms-channel";
    }

    @Override
    public Class<? extends SmsChannel> getProviderClass() {
        return SmsChannel.class;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return SmsChannelFactory.class;
    }

}
