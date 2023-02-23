package ru.sms.controllers.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sms.entity.SmsSend;

@Data
@RestController
@RequestMapping("/api/v1/sms")
@RequiredArgsConstructor
public class SmsRestController {

    @PostMapping
    public void smsSend(String user, String pass, String action, String sender, String message, String target) {

        SmsSend runSms = new SmsSend();

        System.out.println(user);
        System.out.println(pass);
        System.out.println(action);
        System.out.println(sender);
        System.out.println(message);
        System.out.println(target);

    }
}
