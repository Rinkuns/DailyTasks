package com.rinku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rinku.dto.TwilioSmsDto;
import com.rinku.service.TwilioSmsService;

@RestController
public class TwilioSmsController {

    @Autowired
    private TwilioSmsService smsService;

    @PostMapping("/sendSms")
    public void sendSms(@RequestBody TwilioSmsDto smsRequest) {
    	smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
    }
}
