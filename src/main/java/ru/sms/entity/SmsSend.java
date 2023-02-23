package ru.sms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
