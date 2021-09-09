package com.rawan.SMSNotification.config

import com.twilio.Twilio
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration

@Configuration
class TwilioInitializer @Autowired constructor(private val twilioConfiguration: TwilioConfiguration) {
    init {
        Twilio.init(
            twilioConfiguration.accountSid,
            twilioConfiguration.authToken
        )
    }
}