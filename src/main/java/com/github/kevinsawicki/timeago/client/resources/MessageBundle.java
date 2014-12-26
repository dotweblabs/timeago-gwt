package com.github.kevinsawicki.timeago.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocalizableResource;
import com.google.gwt.i18n.client.Constants;

//@LocalizableResource.DefaultLocale("en_US")
public interface MessageBundle extends Constants {

    public static final MessageBundle INSTANCE = GWT.create(MessageBundle.class);

    @DefaultStringValue("ago")
    String ago();

    @DefaultStringValue("a day")
    String day();

    @DefaultStringValue("{0} days")
    String days();

    @DefaultStringValue("about an hour")
    String hour();

    @DefaultStringValue("{0} hours")
    String hours();

    @DefaultStringValue("about a minute")
    String minute();

    @DefaultStringValue("{0} minutes")
    String minutes();

    @DefaultStringValue("about a month")
    String month();

    @DefaultStringValue("{0} months")
    String months();

    @DefaultStringValue("less than a minute")
    String seconds();

    @DefaultStringValue("from now")
    String suffixFromNow();

    @DefaultStringValue("about a year")
    String year();

    @DefaultStringValue("{0} years")
    String years();


}