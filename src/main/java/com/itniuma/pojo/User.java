package com.itniuma.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="connect")
public class User {
    @Id
    private Integer id;
    private String name;
    private String phone;
    private String address;

    public User(Integer id, String name, String phone, String address) {
        this.id = null;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    public User(){}
}
