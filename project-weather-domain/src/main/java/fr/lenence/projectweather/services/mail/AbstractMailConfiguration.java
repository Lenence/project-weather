package fr.lenence.projectweather.services.mail;

import org.springframework.beans.factory.annotation.Value;

public class AbstractMailConfiguration {

    @Value("${mail.host}")
    protected String host;

    @Value("${mail.from}")
    protected String from;
}