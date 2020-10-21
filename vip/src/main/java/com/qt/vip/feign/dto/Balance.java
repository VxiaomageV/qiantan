package com.qt.vip.feign.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * description: 演示
 * date: 2020/10/21
 * @author wuyanzu
 */
@Data
public class Balance implements Serializable {

    private int id;
    private int diamond;
    private int ticket;
    private String message;

    public Balance() {
    }

    public Balance(int id, int diamond, int ticket) {
        this(id, diamond, ticket, "OK");
    }

    public Balance(int id, int diamond, int ticket, String message) {
        this.id = id;
        this.diamond = diamond;
        this.ticket = ticket;
        this.message = message;
    }


}
