package com.rawan.SMSNotification.controller

import com.rawan.SMSNotification.dto.SmsRequest
import com.rawan.SMSNotification.service.SmsNotificationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("api/v1/sms")
class SmsNotificationController @Autowired constructor(private val smsNotificationService: SmsNotificationService) {

    @PostMapping
    fun sendSms(@RequestBody smsRequest: @Valid SmsRequest) {
        smsNotificationService.sendSms(smsRequest)
    }
}