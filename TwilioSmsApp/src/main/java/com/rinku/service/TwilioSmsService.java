package com.rinku.service;

/*import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;

@Service
public class TwilioSmsService {

    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String twilioPhoneNumber;

    public void sendSms(String to, String message) {
        Twilio.init(accountSid, authToken);

        Message.creator(
                new com.twilio.type.PhoneNumber(twilioPhoneNumber),
                new com.twilio.type.PhoneNumber(to),
                message)
                .create();
    }
}*/
import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TwilioSmsService {
  // Find your Account Sid and Token at twilio.com/console
	@Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String twilioPhoneNumber;
	
  public static final String ACCOUNT_SID = "AC9cba0d666d210f0f889883712b5e932c";
  public static final String AUTH_TOKEN = "de14af98175bad118920c04691dbfe39";

  public void sendSms(String to, String message) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message2 = Message.creator(
      new com.twilio.type.PhoneNumber(to),
      new com.twilio.type.PhoneNumber(twilioPhoneNumber),
      "Your message")
    .create();
    System.out.println("Sms Sent successfully :"+message2.getSid());
  }
}
