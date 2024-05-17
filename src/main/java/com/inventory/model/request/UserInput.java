package com.inventory.model.request;

import lombok.Data;

@Data
public class UserInput {

    private String name;
    private String emailId;
    private String mobileNumber;
    private String password;
}
