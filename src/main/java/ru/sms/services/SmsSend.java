package ru.sms.services;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sms.controllers.rest.SmsRestController;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsSend {

    private String user;
    private String pass;
    private String action;
    private String sender;
    private String message;
    private String target;

    SmsRestController smsRestController = new SmsRestController();

    public void addSms(String phone, String pin) throws IOException {

        String url = "https://a2p-sms-https.beeline.ru/proto/http/rest";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();


        JsonObject object = new JsonObject();
        object.addProperty("user", "login");
        object.addProperty("pass", "password");
        object.addProperty("action", "post_sms");
        object.addProperty("sender", "my.site.ru");
        object.addProperty("message", pin);
        object.addProperty("target", phone);

        System.out.println(object);
        System.out.println();

        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(object.toString());
        wr.flush();
        wr.close();
    }
}
