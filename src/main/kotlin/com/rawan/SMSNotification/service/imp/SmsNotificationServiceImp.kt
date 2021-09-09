package com.rawan.SMSNotification.service.imp

import com.rawan.SMSNotification.config.TwilioConfiguration
import com.rawan.SMSNotification.dto.SmsRequest
import com.rawan.SMSNotification.service.SmsNotificationService
import com.twilio.rest.api.v2010.account.Message
import com.twilio.type.PhoneNumber
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SmsNotificationServiceImp @Autowired constructor(private val twilioConfiguration: TwilioConfiguration) :
    SmsNotificationService {
    override fun sendSms(smsRequest: SmsRequest) {
        val to = PhoneNumber(smsRequest.phoneNumber)
        val from = PhoneNumber(twilioConfiguration.trialNumber)
        val message = smsRequest.message
        val creator = Message.creator(to, from, message)
        creator.create()
    }
}