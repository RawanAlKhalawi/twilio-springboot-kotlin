package com.rawan.SMSNotification.dto

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank

class SmsRequest(
    @NotBlank @param:JsonProperty("phoneNumber") val phoneNumber: String,
    @NotBlank @param:JsonProperty("message") val message: String
) {
    override fun toString(): String {
        return "SmsRequest{" +
                "phoneNumber= ..." + '\'' +
                ", message='" + message + '\'' +
                '}'
    }
}