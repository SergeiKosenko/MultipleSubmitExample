package ru.sms.controllers.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sms.services.SmsSend;

import java.io.IOException;

@Data
@RestController
@RequestMapping
@RequiredArgsConstructor
public class SmsRestController {

    @PostMapping("/api/v1/sms")
    public void smsSend(String phone, String pin) throws IOException {

            SmsSend smsSend = new SmsSend();
            smsSend.addSms(phone, pin);
    }
}
