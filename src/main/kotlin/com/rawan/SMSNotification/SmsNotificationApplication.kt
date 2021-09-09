package com.rawan.SMSNotification

import com.rawan.SMSNotification.config.TwilioConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(TwilioConfiguration::class)
class SmsNotificationApplication

fun main(args: Array<String>) {
	runApplication<SmsNotificationApplication>(*args)
}
