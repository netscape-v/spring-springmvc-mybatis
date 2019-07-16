package com.company02.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Role {
    private Integer id;
    private String nickname;
    private String constellation;
    private Integer age;
    private String address;
    private String image;
}
