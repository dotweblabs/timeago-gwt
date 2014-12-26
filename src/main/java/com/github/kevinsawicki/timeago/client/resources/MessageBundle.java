package com.github.kevinsawicki.timeago.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocalizableResource;
import com.google.gwt.i18n.client.Messages.DefaultMessage;
import com.google.gwt.i18n.client.Constants;

@LocalizableResource.DefaultLocale("en_US")
public interface MessageBundle extends Constants {

    public static final MessageBundle INSTANCE = GWT.create(MessageBundle.class);

    @DefaultMessage("ago")
    String ago();

    @DefaultMessage("a day")
    String day();

    @DefaultMessage("{0} days")
    String days();

    @DefaultMessage("about an hour")
    String hour();

    @DefaultMessage("{0} hours")
    String hours();

    @DefaultMessage("about a minute")
    String minute();

    @DefaultMessage("{0} minutes")
    String minutes();

    @DefaultMessage("about a month")
    String month();

    @DefaultMessage("{0} months")
    String months();

    @DefaultMessage("less than a minute")
    String seconds();

    @DefaultMessage("from now")
    String suffixFromNow();

    @DefaultMessage("about a year")
    String year();

    @DefaultMessage("{0} years")
    String years();


}