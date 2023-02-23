package ru.sms.controllers.rest;

import com.google.gson.JsonObject;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping
@RequiredArgsConstructor
public class SmsRestController {

    @PostMapping("/api/v1/sms")
    public void smsSend(String phone, String pin) {

        JsonObject object = new JsonObject();
        object.addProperty("user", "login");
        object.addProperty("pass", "password");
        object.addProperty("action", "post_sms");
        object.addProperty("sender", "my.site.ru");
        object.addProperty("message", pin);
        object.addProperty("target", phone);

        System.out.println(object);
        System.out.println();
    }
}
