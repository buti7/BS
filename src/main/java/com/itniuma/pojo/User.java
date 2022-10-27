package com.itniuma.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="mail_line")
public class User {
    @Id
    private Integer id;
    private String user_name;
    private String phone_number;
    private String address;

    public User(){}
    public User(Integer id, String userName, String phoneNumber, String address) {
        this.address=address;
        this.id=id;
        this.user_name=userName;
        this.phone_number=phoneNumber;
    }
}
