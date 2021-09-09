package com.rawan.SMSNotification.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration

@ConstructorBinding
@ConfigurationProperties("twilio")
data class TwilioConfiguration(
    val accountSid: String,
    val authToken: String,
    val trialNumber: String
)