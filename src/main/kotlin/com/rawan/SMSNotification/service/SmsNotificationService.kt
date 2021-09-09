package com.rawan.SMSNotification.service

import com.rawan.SMSNotification.dto.SmsRequest

interface SmsNotificationService {

    fun sendSms(smsRequest: SmsRequest)
}