package com.boye.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:阿捷
 * @date:2021/4/6 21:45
 */
@Data
public class TimeLine implements Serializable {

    private  int id;
    private String time;
}
