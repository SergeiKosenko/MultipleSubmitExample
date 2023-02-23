package ru.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleSubmitExampleApplication { public static void main(String[] args) {SpringApplication.run(MultipleSubmitExampleApplication.class, args);} }

//    //https://email:api_key@gate.smsaero.ru/v2/sms/send?number=79990000000&text=your+text&sign=SMS Aero
//    //Запрос на отправку смс: https://url?phone=79999999999&pin=1234
//    //В ответе важны поля: id, status, send_datetime
//    //status важен доставлено или не доставлено





